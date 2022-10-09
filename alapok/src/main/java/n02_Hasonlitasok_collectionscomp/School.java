package n02_Hasonlitasok_collectionscomp;

import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class School {
    public static void main(String[] args) {
        TreeSet<Student> studentsOrderedSet=new TreeSet<Student>(new StudentComparator());
        Student student1=new Student("Kis Virág",195);
        Student student2=new Student("Varga Győző",159);
        Student student3=new Student("Torzonborz Ákos",170);
        Student student4=new Student("Barna Béla",149);
        Student student5=new Student("Piros Judit",181);
        Student student6=new Student("Ákos Balázs",185);

        studentsOrderedSet.add(student1);
        studentsOrderedSet.add(student2);
        studentsOrderedSet.add(student3);
        studentsOrderedSet.add(student4);
        studentsOrderedSet.add(student5);
        studentsOrderedSet.add(student6);
        System.out.println(studentsOrderedSet);

        Map<String, Integer> orderedMap=new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        orderedMap.put(student1.getName(),student1.getHeight());
        orderedMap.put(student2.getName(),student2.getHeight());
        orderedMap.put(student3.getName(),student3.getHeight());
        orderedMap.put(student4.getName(),student4.getHeight());
        orderedMap.put(student5.getName(),student5.getHeight());
        orderedMap.put(student6.getName(),student6.getHeight());
        System.out.println(orderedMap);

        TreeSet<Student> studentsOrderedSet2=new TreeSet<Student>(new StudentComparatorByReversedAlphabetical());
        studentsOrderedSet2.add(student1);
        studentsOrderedSet2.add(student2);
        studentsOrderedSet2.add(student3);
        studentsOrderedSet2.add(student4);
        studentsOrderedSet2.add(student5);
        studentsOrderedSet2.add(student6);

        System.out.println(studentsOrderedSet2);


    }
}
