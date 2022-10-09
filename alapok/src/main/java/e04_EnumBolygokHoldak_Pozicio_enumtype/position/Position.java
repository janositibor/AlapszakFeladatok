package e04_EnumBolygokHoldak_Pozicio_enumtype.position;

public enum Position {
    ASSISTANT(400000,""),JUNIOR(500000,"Laptop"),SENIOR(1000000,"Car"),BOSS(1500000,"Car + turkey");
    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
