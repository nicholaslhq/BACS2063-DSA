package entity;

public class Location {
    int locationID;
    String locationName;
    String locationDescription;

    public Location(int locationID, String locationName, String locationDescription) {
        this.locationID = locationID;
        this.locationName = locationName;
        this.locationDescription = locationDescription;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    @Override
    public String toString() {
        return "\nLocation\t:" + getLocationName() + "\nDescription\t:" + getLocationDescription();
    }
    
}