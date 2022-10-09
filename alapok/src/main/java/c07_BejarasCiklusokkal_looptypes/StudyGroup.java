package c07_BejarasCiklusokkal_looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    private void printStudyGroups(List<String> students){
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        for (String student: students)  {
            if(student.length()<=10){
                group1.add(student);
            }
            else{
                group2.add(student);
            }
        }
        System.out.println("Group1:"+group1);
        System.out.println("Group2:"+group2);
    }

    public static void main(String[] args) {
        String[] names = {"KULCS joe","KÁLYHA ember","LÓ elek","AJTÓ orbánvili","CSERESZNYEFA ága","TEJ föl","FELHŐ szolgáltatás","CIPŐ kan","MOSODA","KÁVÉTEJSZÍN","CITERA","BABA"};
        List<String> students = Arrays.asList(names);

        StudyGroup studyGroup=new StudyGroup();
        studyGroup.printStudyGroups(students);
    }
}
