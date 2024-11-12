 

// class to provide information about our car garage
public class TrustyCarsApp
{  
    public void run()
    {
        TrustyCars garage = new TrustyCars();           // Make a 'garage' object
        garage.stockList.add( new Car() );              // add cars to its stockList
        // New Cars
        garage.stockList.add( new Car("Toyota", "Corolla", 7000, 2006) );
        garage.stockList.add( new Car("Toyota", "Sprinter Trueno", 15000, 1983) );

        // New Car
        garage.stockList.add( new ToyotaPrius(2022, 25000));
        garage.stockList.add( new MazdaRX7(1978, 27000));

        // New Car with specified fields

        System.out.println( garage.longListing() );    // print a list of the cars
    }  
    
    // the usual 'main' method so we can run this as a program
    public static void main(String[] args)
    {
        // make an instance of the app, and then call its run method
        TrustyCarsApp app = new TrustyCarsApp();
        app.run();
    }
}
