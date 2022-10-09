package j02_Interface_interfacerules.bill;

public class Item {
    private String name;
    private int price;
    private int amount;

    public Item(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getReport1(){
        return name+", "+amount+" * "+price+" = "+(amount*price)+" Ft";
    }
    public String getReport2(){
        return name+"; darabszám: "+amount+", egységár: "+price+", összesen: "+(amount*price)+" Ft";
    }
}
