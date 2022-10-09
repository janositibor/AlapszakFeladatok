package i10_Oroklodes_introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        coffee.setName("Fekete");
        coffee.setPrice(150);
        System.out.println(coffee.getName()+": "+coffee.getPrice()+" Ft");

        Cappuccino cappuccino=new Cappuccino();
        cappuccino.setName("Olasz álom");
        cappuccino.setPrice(999);
        System.out.println(cappuccino.getName()+": "+cappuccino.getPrice()+" Ft");

        System.out.println();
        System.out.println("A leszármazott osztály eléri a szülő attribútumait és metódusait.");

    }
}
