package inputLoopChoice;

// Tell Java you want to use the Scanner library
import java.util.Scanner;

// This class provides the 'template code for using Scanner. It doesn't
// do anything, but you can copy it and add your own code in the middle 
// which uses myInput to get user input

public class ScannerTemplate
{
    public void run() 
    {
        // create a new Scanner object which uses System.in for its data,
        // and call it myInput
        Scanner myInput = new Scanner(System.in);

        // Put your own code here. This code can use scanner to get information
        // from the user. For example:
        //     String home = myInput.next();
        //     int myAge = myInput.nextInt();

        // remember to 'close' the Scanner (so the system knows you have finished with it)
        myInput.close();
    }
    
    public static void main(String[] args)
    {
        new ScannerTemplate().run();
    }
}
