package mx.com.develop.models;

/**
 *
 * @author danielorlandoharolozano
 */
public class Location {
    private int id;
    private String streetAddress;
    private String city;
    private String stateProvidence;
    private  String country;

    public Location(String streetAddress, String city, String stateProvidence, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.stateProvidence = stateProvidence;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvidence() {
        return stateProvidence;
    }

    public void setStateProvidence(String stateProvidence) {
        this.stateProvidence = stateProvidence;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
