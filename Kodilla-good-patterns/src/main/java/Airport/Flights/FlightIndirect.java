package Airport.Flights;

public class FlightIndirect {
    private String arrival;
    private String departure;
    private String middle;

    public FlightIndirect(String departure,String arrival , String middle) {
        this.arrival = arrival;
        this.departure = departure;
        this.middle = middle;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getMiddle() {
        return middle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightIndirect that = (FlightIndirect) o;

        if (!arrival.equals(that.arrival)) return false;
        if (!departure.equals(that.departure)) return false;
        return middle.equals(that.middle);
    }

    @Override
    public int hashCode() {
        int result = arrival.hashCode();
        result = 31 * result + departure.hashCode();
        result = 31 * result + middle.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FlightIndirect{" +
                "arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", middle='" + middle + '\'' +
                '}';
    }
}
