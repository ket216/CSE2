/*  Kevin Trinh
    CSE 2
    hw03 - Root.java
    September 16, 2014
*/

import java.util.Scanner;

// define a class
public class Root {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner xinput = new Scanner (System.in);                       // declares scanner as xinput
        
        System.out.println("Enter a number as a double: ");             // prompts user for a double
        double x = xinput.nextDouble();                                 // stores user double in variable x
        
        double guess1 = x/3.0;                                          // calculates crude guess of cube root
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);   // calculates more precise guess of cube root
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);   // reiterates guess from previous guess
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);   // reiterates guess from previous guess
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);   // reiterates guess from previous guess
        double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);   // reiterates guess from previous guess
        
        // final print
        System.out.println("The cube root of " +x + " is " +guess6 + "." );
        System.out.println(guess6 + " * " + guess6 + " * " + guess6 + " = " + guess6*guess6*guess6 );
    }
}
