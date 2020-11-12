package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {
    public String findFlight(Flight flight) throws RouteNotFoundException{
        String result = "";
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Cracow",true);
        airports.put("Moscow",true);
        airports.put("Berlin",true);
        airports.put("Helsinki",false);
        airports.put("Sydney",false);
        airports.put("Washington",false);
        airports.put("Hong Kong",true);

        if(airports.keySet().contains(flight.getArrivalAirport()) && airports.get(flight.getArrivalAirport()) == true &&
        airports.keySet().contains(flight.getDepartureAirport()) && airports.get(flight.getDepartureAirport()) == true){
            result = "Flight is available";
        } else {
            throw new RouteNotFoundException();
        }

       return result;
    }
}
