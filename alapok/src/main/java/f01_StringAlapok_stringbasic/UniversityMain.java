package f01_StringAlapok_stringbasic;


public class UniversityMain {
    public static void main(String[] args) {
        University university=new University();

        Person person1=new Person("Barna Gábor", "barnagabor@gmail.com", "052 876 942", "11178924 78453579", "0036 70 2986423");
        Person person2=new Person("Fehér Alma", "feheralma@gmail.com", "453 976 133", "11178924 87627103", "0036 20 8479631");
        Person person3=new Person("Szürke Béla", "szurkebela@gmail.com", "321 851 975", "11178987 78213579", "0036 20 8479631");

        Student student1=new Student(person1, "BAGA81649", "0198963248");
        Student student2=new Student(person2, "FAAL71593", "0205867416");
        Student student3=new Student(person3, "FAAL71593", "0205867416");

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        System.out.println(university);

        String output=university.areEqual(university.getStudentsList().get(0),university.getStudentsList().get(1))?"First and second students are equal":"First and second students are different";
        System.out.println(output);
        output=university.areEqual(university.getStudentsList().get(1),university.getStudentsList().get(2))?"Second and third students are equal":"Second and third students are different";
        System.out.println(output);
    }
}
