package b09_DatumAlapok_introdate;

import java.time.*;

public class Employee {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.beginEmployment = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    public void setName(String name) {
        this.name = name;
    }
}
