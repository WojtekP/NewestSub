package Airport.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MiddleFlightsFinder {
    List<FlightIndirect> listOfIndirectFlights = new ArrayList<>();

    public String findMiddleAirport (String middleCity){
        FlightList flightList = new FlightList();
        listOfIndirectFlights = flightList.getIndirectFlights().stream()
                .filter(f -> f.getMiddle().equals(middleCity))
                .collect(Collectors.toList());

        return "Flights with middle airport: " + listOfIndirectFlights;




    }

    @Override
    public String toString() {
        return "Flights with middle airport: " + listOfIndirectFlights;
    }
}
