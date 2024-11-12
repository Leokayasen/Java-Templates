 

// The initial Car class
public class Car {
    // Instance variables for Car
    public String make = "";
    public String model = "";
    public int engineSize = 0;
    public int loadCapacity = 0;
    public int fuelCapacity = 0;
    public int milesPerLitre = 0;
    public int numberOfDoors = 0;
    public int numberOfSeats = 0;

    // Properties that vary for each individual car
    public int year = 0;
    public int price = 0;

    // Constructor
    public Car() {
        // nothing to do here - just use the built-in values
    }

    // 2nd Constructor for car
    public Car(String theMake, String theModel, int thePrice, int theYear) {
        make = theMake;
        model = theModel;
        price = thePrice;
        year = theYear;
    }

    // Method to compute the range - how far the car can go on a full tank
    public int range() {
        int theRange = fuelCapacity * milesPerLitre;
        return theRange;
    }

    // Method to create a short string that describes the car
    public String shortDescription() {
        String theDescription =
                make + " " + model + " (" + year + ") �" + price;

        return theDescription;
    }

    // Long description method
    public String longDescription() {
        String longDescription =
                shortDescription() + "\n"
                        + "Doors: " + numberOfDoors + "\n"
                        + "Seats: " + numberOfSeats + "\n"
                        + "Boot Capacity: " + loadCapacity + "\n"
                        + "Range: " + range() + " miles \n";
        return longDescription;
    }
}
