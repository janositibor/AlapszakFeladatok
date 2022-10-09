package n02_Hasonlitasok_collectionscomp;

public class Student {
    private String name;
    private int height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}'+"\n";
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
