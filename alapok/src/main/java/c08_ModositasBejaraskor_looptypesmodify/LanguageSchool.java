package c08_ModositasBejaraskor_looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1= new Student("Kis Gábor");
        Student student2= new Student("Nagy Norbert");
        Student student3= new Student("Fekete Tibor");
        Student student4= new Student("Fehér Márta");
        Student student5= new Student("Barna Béla");
        System.out.println("The number of students:"+studentList.size());
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println("The number of students:"+studentList.size());
        studentList.get(1).setActive(false);
        studentList.get(4).setActive(false);
        for (int i = studentList.size(); i > 0; i--) {
            if(!studentList.get(i-1).isActive()){
                studentList.remove(i-1);
            }
        }
        System.out.println("The number of students:"+studentList.size());

    }
}
