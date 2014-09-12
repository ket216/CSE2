/*  Kevin Trinh
    CSE 2
    hw03 - Bicycle
    September 10, 2014
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
        double counts = 0.0;
        double seconds = 0.0;
        
        counts = new Scanner(System.in);                                    // creates new scanner
        System.out.print("Enter the number counts on the cyclometer: ");    // prompts for user input
        double counts = counts.nextDouble();                                // stores input as a double
        
        Scanner seconds = new Scanner(System.in);                           // creates new scanner
        System.out.print("Enter the trip duration in seconds: ");           // prompts for user input
        double seconds = seconds.nextDouble();                              // stores input as a double
        
        distance = counts*wheelDiameter*pi/inchesPerFoot/feetPerMile;   // calculates trip distance in miles
        duration = seconds/secondsPerMinute;                            // calculates trip duration in minutes
        averageMPH = distance/(duration/60);                            // calculates average speed in MPH
        
        System.out.println("Counts on cyclometer: "+counts+"");
        System.out.println("Trip duration: "+duration+"");
        System.out.println("Distance traveled: "+distance+"");
        System.out.println("Average speed: "+averageMPH+"");
        
    }
}