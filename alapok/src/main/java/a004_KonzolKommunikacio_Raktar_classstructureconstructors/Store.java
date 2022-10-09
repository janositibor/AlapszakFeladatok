package a004_KonzolKommunikacio_Raktar_classstructureconstructors;

public class Store {
    String storeName;
    String product;
    int stock;

    public Store(String storeName,String product) {
        this.storeName = storeName;
        this.product = product;
        this.stock = 0;
    }
    public void store(int amount) {
        this.stock += amount;
    }
    public void dispatch(int amount) {
        this.stock -= amount;
    }
    public String report() {
        return "The amount of "+product+" in "+storeName+" is "+stock+"!";
    }
}
