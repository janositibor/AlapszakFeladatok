package i10_Oroklodes_introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit=new Fruit();
        fruit.setName("Banana");
        fruit.setWeight(1.2);
        System.out.println(fruit.getName()+": "+fruit.getWeight()+" kg");

        Grape grape=new Grape();
        grape.setName("Grape");
        grape.setType("cirfandli");
        grape.setWeight(0.34);
        System.out.println(grape.getName()+"-"+grape.getType()+": "+grape.getWeight()+" kg");

        Apple apple=new Apple();
        apple.setName("Apple");
        apple.setPieces(2);
        apple.setWeight(0.25);
        System.out.println(apple.getName()+": "+apple.getPieces()+" x "+apple.getWeight()+" kg");

        GoldenDelicious goldenDelicious=new GoldenDelicious();
        goldenDelicious.setName("GoldenDelicious");
        goldenDelicious.setPieces(3);
        goldenDelicious.setWeight(0.19);
        System.out.println(goldenDelicious.getName()+" ("+goldenDelicious.getColour()+"): "+goldenDelicious.getPieces()+" x "+goldenDelicious.getWeight()+" kg");

        Starking starking=new Starking();
        starking.setName("Starking");
        starking.setPieces(7);
        starking.setWeight(0.33);
        System.out.println(starking.getName()+" ("+starking.getColour()+"): "+starking.getPieces()+" x "+starking.getWeight()+" kg");
    }
}
