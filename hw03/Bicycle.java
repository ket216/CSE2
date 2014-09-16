/*  Kevin Trinh
    CSE 2
    hw03 - Bicycle
    September 16, 2014
*/

import java.util.Scanner;

// define a class
public class Bicycle {
    
    // add main method
    public static void main(String[] args) {
        double wheelDiameter=27.0;                          // wheel diameter in inches
        double pi=3.14159;                                  // π
        double feetPerMile=5280;                            // conversion from feet to miles
        double inchesPerFoot=12;                            // conversion from inches to feet
        double secondsPerMinute=60;                         // conversion from seconds to minutes
        double distance;                                    // declares distance variable
        double duration;                                    // declares duration variable
        double averageMPH;                                  // declares averageMPH variable
        
        Scanner counter = new Scanner(System.in);                           // creates new scanner
        
        System.out.print("Enter the number counts on the cyclometer: ");    // prompts for user input
        double counts = counter.nextDouble();                               // stores input as a double
        
        System.out.print("Enter the trip duration in seconds: ");           // prompts for user input
        double seconds = counter.nextDouble();                              // stores input as a double
        
        distance = counts*wheelDiameter*pi/inchesPerFoot/feetPerMile;       // calculates trip distance in miles
        duration = seconds/secondsPerMinute;                                // calculates trip duration in minutes
        averageMPH = distance/(duration/60);                                // calculates average speed in MPH
        
        
        // final print
        System.out.println("Counts on cyclometer: "+counts+"");
        System.out.println("Trip duration: "+(int)(duration*100)/100.0 + " minutes.");
        System.out.println("Distance traveled: "+(int)(distance*100)/100.0 + " miles.");
        System.out.println("Average speed: "+(int)(averageMPH*100)/100.0 + " MPH.");
    }
}