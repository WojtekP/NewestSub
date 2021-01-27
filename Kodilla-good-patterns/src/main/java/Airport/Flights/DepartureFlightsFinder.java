package Airport.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DepartureFlightsFinder {
    List<FlightDirect> listOfDirectFlights = new ArrayList<>();

    public String findDepartureFlight(String departureCity) {

        FlightList flightList = new FlightList();
        listOfDirectFlights = flightList.getDirectFlights().stream()
                .filter(f -> f.getDeparture().equals(departureCity)).collect(Collectors.toList());
        return "Flights Departure : " + listOfDirectFlights;


    }

    @Override
    public String toString() {
        return "Departures From: " + listOfDirectFlights;
    }
}
