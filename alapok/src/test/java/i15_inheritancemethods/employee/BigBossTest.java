package i15_inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {
    @Test
    void testCreateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        //Then
        assertEquals("John Doe", employee.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", employee.getAddress());
        assertEquals(300_000.0, employee.getSalary());
    }

    @Test
    void testMigrateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        employee.migrate("1117 Budapest, Budafoki út 100.");
        //Then
        assertEquals("1117 Budapest, Budafoki út 100.", employee.getAddress());
    }

    @Test
    void testRaiseSalary() {
        //Given
        Employee employee = new Employee("John Doe", "1117 Budapest, Budafoki út 56.", 300_000);
        //When
        employee.raiseSalary(10);
        //Then
        assertEquals(330_000.0, employee.getSalary());
    }
    @Test
    void testCreateBoss() {
        Boss boss = new Boss("John Doe", "1117 Budapest, Budafoki út 56.", 500_000, 3);

        assertEquals("John Doe", boss.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", boss.getAddress());
        assertEquals(650_000.0, boss.getSalary());
        assertEquals(3, boss.getNumberOfEmployees());
    }

    @Test
    void testCreateBigBoss() {
        BigBoss boss = new BigBoss("John Doe", "1117 Budapest, Budafoki út 56.", 1_000_000, 6, 200_000);

        assertEquals("John Doe", boss.getName());
        assertEquals("1117 Budapest, Budafoki út 56.", boss.getAddress());
        assertEquals(1_800_000.0, boss.getSalary());
        assertEquals(6, boss.getNumberOfEmployees());
    }

}