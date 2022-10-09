package a003_KonzolKommunikacio_classstructuremethods;

public class Client {
    private String name;
    private int year;
    private String address;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAddress(String address) {
        this.address = address; // it is redundant with the function migrate
    }

    public void migrate(String address){
        this.address=address;
    }
}
