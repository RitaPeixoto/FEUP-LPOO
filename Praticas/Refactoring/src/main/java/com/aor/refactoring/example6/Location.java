package com.aor.refactoring.example6;

public class Location {
    private String locationLatitude;
    private String locationLongitude;
    private String name;

    public Location(String locationLatitude, String locationLongitude, String name){
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.name = name;
    }

    public String getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(String locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public String getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(String locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
