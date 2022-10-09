package k03_exceptionmulticatch.aid;

public class CityForAid {
    private String name;
    private int numberOfNeedy;
    private int totalAmount;
    private int amount;

    public CityForAid(int totalAmount, String name, int numberOfNeedy) {
        this.name = name;
        this.numberOfNeedy = numberOfNeedy;
        this.totalAmount = totalAmount;
        this.amount=totalAmount/numberOfNeedy;
    }

    @Override
    public String toString() {
        return name + ": " +amount;
    }
}
