package j07_STATICMethodsInterface_interfacestaticmethods.schoolcild;

public class UpperClassSchoolChild implements PrimarySchoolChild{
    private String name;
    private int age;

    public UpperClassSchoolChild(int age) {
        this.age = age;
    }

    public UpperClassSchoolChild(String name) {
        this.name = name;
    }

    public UpperClassSchoolChild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
