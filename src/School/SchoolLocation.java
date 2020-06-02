package School;

import org.junit.Assert;

import java.util.ArrayList;

public class SchoolLocation {

    private String price;
    private String location;
    private static ArrayList<String> locationList = new ArrayList<>();

    public SchoolLocation(String location){
        addLocation();
        setSchoolLocation(location);
        setPrice();

    }

    public void setPrice(){

        if(location.equals("USA")){
            this.price = "$8000";
        }else if(location.equals("England")){
            this.price = "£6500";
        }else if(location.equals("France")){
            this.price = "€7200";
        }else if(location.equals("Germany")){
            this.price = "€7000";
        }else if(location.equals("Canada")){
            this.price = "C$7500";
        }else{
            throw new RuntimeException("This is not a valid location");
        }
    }

    public String getPrice() {
        return price;
    }

    public static void addLocation() {
        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");
    }

    public ArrayList<String> getLocationList() {
        return locationList;
    }

    public void setSchoolLocation(String SchoolLocation){

        ArrayList<String> listOfLocations = new ArrayList<>();

        listOfLocations = getLocationList();

        boolean result = listOfLocations.contains(SchoolLocation);

        if(result){
            this.location = SchoolLocation;
        }else{
            Assert.fail("Location should be one of the following " + listOfLocations);
        }

    }

    public String getLocation() {
        return location;
    }



}
