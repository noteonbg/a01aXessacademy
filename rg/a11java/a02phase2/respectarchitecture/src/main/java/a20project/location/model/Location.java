package a20project.location.model;

public class Location {
    private int id;
    private String pincode;
    private String city;

    public Location() {}

    public Location(int id, String pincode, String city) {
        this.id = id;
        this.pincode = pincode;
        this.city = city;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}

