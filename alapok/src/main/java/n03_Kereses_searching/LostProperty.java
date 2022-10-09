package n03_Kereses_searching;

import java.time.LocalDate;

public class LostProperty implements Comparable<LostProperty>{
    private String id;
    private String description;
    private LocalDate date;

    public LostProperty(String description, LocalDate date) {
        this.id = "";
        this.description = description;
        this.date = date;
    }

    public LostProperty(String id, String description, LocalDate date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }


    @Override
    public int compareTo(LostProperty o) {
        if(description.equals(o.description)){
            return date.compareTo(o.date);
        }
        return description.compareTo(o.description);
    }

    public String getRegNumber() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }
}
