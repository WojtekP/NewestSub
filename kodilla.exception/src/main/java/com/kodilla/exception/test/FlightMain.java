package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        FlightSearching flightSearching = new FlightSearching();
        Flight flightNo555 = new Flight("Cracow", "Moscow");
        Flight flightNo123 = new Flight("Hong Kong", "Helsinki");
        try {
            flightSearching.findFlight(flightNo123);
        } catch (RouteNotFoundException e) {
            System.out.println("No route like that.Sorry " + e);
        } finally {
            System.out.println("Searching ended");
        }

    }
}
