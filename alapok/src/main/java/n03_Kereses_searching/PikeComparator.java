package n03_Kereses_searching;


import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class PikeComparator  implements Comparator<Pike> {
    @Override
    public int compare(Pike pike1, Pike pike2) {
        Collator collator=Collator.getInstance(new Locale("hu", "HU"));
        return collator.compare(pike1.getName(),pike2.getName());
    }
}
