package dev.felipesantana.hotelmanager.hotel.model;

class Coordinates {
    private double lng;
    private double lat;

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }
}

public class Address {
    private String number;
    private String street;
    private String neighbourhood;
    private String city;
    private String province;
    private String country;
    private String complement;
    private String references;
    private Coordinates location;

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public String getComplement() {
        return complement;
    }

    public String getReferences() {
        return references;
    }

    public Coordinates getLocation() {
        return location;
    }
}
