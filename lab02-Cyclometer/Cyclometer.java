/*  Kevin Trinh
    CSE 2
    Lab02 - Cyclometer
    September 3, 2014
*/

// define a class
public class Cyclometer {
    
    // add main method
    public static void main(String[] args) {        
        int secsTrip1=480;                                  // duration of trip 1
        int secsTrip2=3220;                                 // duration of trip 2
        int countsTrip1=1561;                               // number of rotations for trip 1
        int countsTrip2=9037;                               // number of rotations for trip 2
        double wheelDiameter=27.0;                          // wheel diameter
        double distanceTrip1, distanceTrip2, totalDistance; // sets variables as doubles
        double pi=3.14159;                                  // π
        double feetPerMile=5280;                            // conversion from feet to miles
        double inchesPerFoot=12;                            // conversion from inches to feet
        double secondsPerMinute=60;                         // conversion from seconds to minutes
        
        // prints out trip durations and rotation counts
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts."); 
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        // calculates trip distances and total
        distanceTrip1=countsTrip1*wheelDiameter*pi/inchesPerFoot/feetPerMile;   // gives trip 1 distance in inches
        distanceTrip2=countsTrip2*wheelDiameter*pi/inchesPerFoot/feetPerMile;   // gives trip 2 distance in inches
        totalDistance=distanceTrip1+distanceTrip2;                              // calculates total distance
        
        // prints out trip distances and total
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");              // gives trip 1 distance in miles
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");              // gives trip 2 distance in miles
        System.out.println("The total distance was "+totalDistance+" miles.");  // gives total trip distance in miles
    }
}