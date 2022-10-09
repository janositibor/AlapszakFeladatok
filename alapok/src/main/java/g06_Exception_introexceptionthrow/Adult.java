package g06_Exception_introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(String name, int age) {
        if(age<18) {
            throw new IllegalArgumentException("Too young! ("+age+" year old)");
        }
        else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
