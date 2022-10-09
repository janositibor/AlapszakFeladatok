package f01_StringAlapok_stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentsList = new ArrayList<>();

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student){
        studentsList.add(student);
    }
    public boolean areEqual(Student student, Student anotherStudent){
        if(student.getNeptunCode().equals(anotherStudent.getNeptunCode()) && student.getEducationID().equals(anotherStudent.getEducationID())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "University{" +
                "studentsList=\n" + studentsList +
                '}';
    }
}
