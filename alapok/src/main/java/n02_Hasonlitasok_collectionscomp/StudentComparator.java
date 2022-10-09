package n02_Hasonlitasok_collectionscomp;

import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return student1.getHeight()-student2.getHeight();
        }
}
