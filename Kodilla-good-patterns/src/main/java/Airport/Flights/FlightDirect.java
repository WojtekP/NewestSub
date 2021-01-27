package Airport.Flights;

public class FlightDirect {
    private String departure;
    private String arrival;

    public FlightDirect(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightDirect that = (FlightDirect) o;

        if (!departure.equals(that.departure)) return false;
        return arrival.equals(that.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FlightDirect{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
