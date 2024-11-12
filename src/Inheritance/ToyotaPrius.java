public class ToyotaPrius extends Car
{
    public ToyotaPrius(int theYear, int thePrice)
    {
        make = "Toyota";
        model = "Prius";
        engineSize = 2000;
        loadCapacity = 440;
        fuelCapacity = 40;
        milesPerLitre = 356;
        numberOfDoors = 5;
        numberOfSeats = 5;

        year = theYear;
        price = thePrice;
    }
}
