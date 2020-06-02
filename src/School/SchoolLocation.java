package School;

import org.junit.Assert;

import java.util.ArrayList;

public class SchoolLocation {

    /*
    Create 3 instance variables
    String price and location
    String ArrayList locationList
     */

    private String price;
    private String location;
    private static ArrayList<String> locationList = new ArrayList<>();


    /*
    Create a constructor
        Parameter string location

        call three methods

        addLocation
        setSchoolLocation
        setPrice
     */
    public SchoolLocation(String location){
        addLocation();
        setSchoolLocation(location);
        setPrice();

    }


    /*
    create a setPrice Method

            if the location is USA
                price should be $8000
            if the location is England
                price should be $6500
            if the location is France
                price should be $7200
            if the location is Germany
                price should be $7000
            if the location is Canada
                price should be $7500

            if the location is non of these then throw an exception  --> "This is not a valid location"

     */
    public void setPrice(){

        if(location.equals("USA")){
            this.price = "$8000";
        }else if(location.equals("England")){
            this.price = "$6500";
        }else if(location.equals("France")){
            this.price = "$7200";
        }else if(location.equals("Germany")){
            this.price = "$7000";
        }else if(location.equals("Canada")){
            this.price = "$7500";
        }else{
            throw new RuntimeException("This is not a valid location");
        }
    }

    /*
    Create a get method for price
     */
    public String getPrice() {
        return price;
    }

    /*
    Create a static method name is addLocation
        add USA , England , France , Germany , Canada
        to
        ArrayList locationList
     */
    public static void addLocation() {
        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");
    }

    /*
    Create a get method for the locationList
     */
    public ArrayList<String> getLocationList() {
        return locationList;
    }

    /*
    Create a set method for the locationList
    no return type
    one String parameter SchoolLocation

    If the locationList contains SchoolLocation
    then instance variable location is equal to  SchoolLocation

     If the locationList NOT contains SchoolLocation
     then throw error "Location should be one of the following " +listOfLocations
     */
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

    /*
    Create a get method for the location
     */
    public String getLocation() {
        return location;
    }



}
