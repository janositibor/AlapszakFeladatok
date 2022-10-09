package n02_Hasonlitasok_collectionscomp;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class StudentComparatorByReversedAlphabetical implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        Collator collator=Collator.getInstance(new Locale("hu", "HU"));
        return collator.compare(student2.getName(), student1.getName());
    }
}
