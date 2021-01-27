package Airport.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrivalFLightsFinder {

    List<FlightDirect> listOfDirectFlights = new ArrayList<>();

    public String findArrivalFlight (String arrivalCity){

        FlightList flightList = new FlightList();
        listOfDirectFlights = flightList.getDirectFlights().stream()
                .filter(f -> f.getArrival().equals(arrivalCity)).collect(Collectors.toList());
        return "Flights Arrival: " + listOfDirectFlights;

    }

    @Override
    public String toString() {
        return "Flights Arrival:" + listOfDirectFlights;
    }
}
