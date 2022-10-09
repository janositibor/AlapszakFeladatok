package i15_inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Barna Béla", 59000);
        System.out.println("name: "+passenger.getName());
        System.out.println("price: "+passenger.getPriceOfPlaneTicket());
        System.out.println();

        PriorityPassenger priorityPassenger = new PriorityPassenger("Szürke Gandalf", 59000, 22);
        System.out.println("name: "+priorityPassenger.getName());
        System.out.println("percent: "+priorityPassenger.getPercent());
        System.out.println("price: "+priorityPassenger.getPriceOfPlaneTicket());
        System.out.println();

        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Fehér Kati", 59000, 22);
        System.out.println("name: "+firstClassPassenger.getName());
        System.out.println("percent: "+firstClassPassenger.getPercent());
        System.out.println("extre charge: "+firstClassPassenger.getExtraCharge());
        System.out.println("price: "+firstClassPassenger.getPriceOfPlaneTicket());
    }
}
