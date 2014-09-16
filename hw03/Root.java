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
        
        Scanner xinput = new Scanner (System.in);
        
        System.out.println("Enter a number as a double: ");
        double x = xinput.nextDouble();
        
        double guess1 = x/3.0;
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);
        
        System.out.println("The cube root of " +x + " is " +guess6 + "." );
        System.out.println(guess6 + " * " + guess6 + " * " + guess6 + " = " + guess6*guess6*guess6 );
    }
}