package f04_Airport_Palindroma_stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights=new ArrayList<>();
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public StringBuilder getDeletedFlights(){
        StringBuilder output=new StringBuilder();
        for(Flight flight:flights){
            if(flight.getStatus()==Status.DELETED){
                output.append(flight.getFlightNumber()).append("\n");
            }
        }
        return output;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "flights=" + flights +
                '}';
    }

    public static void main(String[] args) {
        Status status=Status.ACTIVE;
        String flightNumber="SW707";
        Flight flight=new Flight(flightNumber,status);
        Airport airport=new Airport();
        airport.addFlight(flight);

        flight=new Flight("SW2405",Status.ACTIVE);
        airport.addFlight(flight);

        flight=new Flight("MAL5306",Status.ACTIVE);
        airport.addFlight(flight);
        System.out.println(airport);
        System.out.println("Deleted:"+airport.getDeletedFlights());
        System.out.println();

        airport.flights.get(1).setStatus(Status.DELETED);
        airport.flights.get(2).setStatus(Status.DELETED);
        System.out.println(airport);
        System.out.println("Deleted:\n"+airport.getDeletedFlights());
        System.out.println();
    }
}
