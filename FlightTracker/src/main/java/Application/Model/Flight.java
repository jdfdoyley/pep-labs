package Application.Model;

import java.util.Objects;

/**
 * This class is used to model a flight. The format of this data should match
 * both its JSON representation and its associated database table.
 *
 * Do not change anything in this class.
 */
public class Flight {
    public int flight_id;
    public String departure_city;
    public String arrival_city;

    /**
     * A default, no-args constructor is REQUIRED for Jackson ObjectMapper to work.
     */
    public Flight() {

    }

    /**
     * a constructor without a flight_id for when persisting a flight to the
     * database where the flight_id has not been created yet.
     * 
     * @param departure_city
     * @param arrival_city
     */
    public Flight(String departure_city, String arrival_city) {
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
    }

    /**
     * an all args constructor for use when retrieving a flight from the database.
     * 
     * @param flight_id
     * @param departure_city
     * @param arrival_city
     */
    public Flight(int flight_id, String departure_city, String arrival_city) {
        this.flight_id = flight_id;
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
    }

    /**
     * getters and setters are required to correctly parse to/from JSON using
     * Jackson ObjectMapper. These were generated by the IDE.
     * 
     * @return flight_id
     */
    public int getFlight_id() {
        return this.flight_id;
    }

    /**
     * getters and setters are required to correctly parse to/from JSON using
     * Jackson ObjectMapper. These were generated by the IDE.
     * 
     * @param flight_id
     */
    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    /**
     * getters and setters are required to correctly parse to/from JSON using
     * Jackson ObjectMapper. These were generated by the IDE.
     * 
     * @return departure_city
     */
    public String getDeparture_city() {
        return departure_city;
    }

    /**
     * getters and setters are required to correctly parse to/from JSON using
     * Jackson ObjectMapper. These were generated by the IDE.
     * 
     * @param departure_city
     */
    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    /**
     * getters and setters are required to correctly parse to/from JSON using
     * Jackson ObjectMapper. These were generated by the IDE.
     * 
     * @return arrival_city
     */
    public String getArrival_city() {
        return arrival_city;
    }

    /**
     * getters and setters are required to correctly parse to/from JSON using
     * Jackson ObjectMapper. These were generated by the IDE.
     * 
     * @param arrival_city
     */
    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    /**
     * A toString method in the event that you want to test your methods using
     * System.out.println. This was auto-generated by the IDE (alt+insert).
     * 
     * @return a String representation of this flight.
     */
    @Override
    public String toString() {
        return "Flight{" +
                "flight_id=" + flight_id +
                ", departure_city='" + departure_city + '\'' +
                ", arrival_city='" + arrival_city + '\'' +
                '}';
    }

    /**
     * An equals method that determines if another flight is equal to this one.
     * This was auto-generated by the IDE (alt+insert).
     * There is no need to change anything in this method.
     * 
     * @param o some other object (such as Flight).
     * @return true if this flight is equivalent to f, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Flight flight = (Flight) o;
        return this.flight_id == flight.flight_id && Objects.equals(departure_city, flight.departure_city)
                && Objects.equals(arrival_city, flight.arrival_city);
    }

}