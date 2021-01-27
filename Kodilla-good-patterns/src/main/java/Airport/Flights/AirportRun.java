package Airport.Flights;

public class AirportRun {
    public static void main(String[] args){


        ArrivalFLightsFinder arrivalFLightsFinder = new ArrivalFLightsFinder();
        DepartureFlightsFinder departureFlightsFinder = new DepartureFlightsFinder();
        MiddleFlightsFinder middleFlightsFinder = new MiddleFlightsFinder();

        System.out.println(arrivalFLightsFinder.findArrivalFlight("Berlin"));
        System.out.println(departureFlightsFinder.findDepartureFlight("Osaka"));
        System.out.println(middleFlightsFinder.findMiddleAirport("London"));


    }
}
