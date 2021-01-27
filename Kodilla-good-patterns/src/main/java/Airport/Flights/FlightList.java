package Airport.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<FlightDirect> directFlights = new ArrayList<>();
    private List<FlightIndirect> indirectFlights = new ArrayList<>();

    public FlightList(){
        directFlights.add(new FlightDirect("Cracow","Berlin"));
        directFlights.add(new FlightDirect("Cracow","Bilbao"));
        directFlights.add(new FlightDirect("Malaga","Berlin"));
        directFlights.add(new FlightDirect("Osaka","Berlin"));
        directFlights.add(new FlightDirect("Omsk","Washington"));
        directFlights.add(new FlightDirect("New York","Rome"));
        directFlights.add(new FlightDirect("Lyon","Paris"));
        directFlights.add(new FlightDirect("Metz","Warsaw"));
        indirectFlights.add(new FlightIndirect("Wroclaw","Mexico City","Madrid"));
        indirectFlights.add(new FlightIndirect("Radom","Los Angeles","Nancy"));
        indirectFlights.add(new FlightIndirect("Gdansk","Lublin","London"));
        indirectFlights.add(new FlightIndirect("Minsk","Oslo","Dubaj"));
        indirectFlights.add(new FlightIndirect("Kijev","Amsterdam","Stambul"));
        indirectFlights.add(new FlightIndirect("Sydney","Fiumicino","Bangkok"));
        indirectFlights.add(new FlightIndirect("Amneville","Bologne","Shanghai"));
        indirectFlights.add(new FlightIndirect("Esch","Eindhoven","Piza"));
    }
    public List<FlightDirect> getDirectFlights(){
        return new ArrayList<>(directFlights);
    }
    public List<FlightIndirect> getIndirectFlights(){
        return new ArrayList<>(indirectFlights);
    }
}
