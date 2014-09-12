/*  Kevin Trinh
    CSE 2
    lab03 - BigMac
    September 11, 2014
*/

import java.util.Scanner;                                                                   // imports Scanner class

// define a class
public class BigMac{
    
    // add main method
    public static void main(String[] args) {
        Scanner myScanner;                                                                  // declares Scanner variable "myScanner"
        myScanner = new Scanner( System.in );                                               // declares myScanner as a system input
        
        System.out.print("Enter the number of Big Macs (an integer > 0): ");                // prompts user for nBigMacs
        int nBigMacs = myScanner.nextInt();                                                 // stores user integer input for nBigMacs as an int
        
        System.out.print("Enter the cost per Big Mac as adouble (in the form xx.xx): ");    // prompts user for cost per BigMac
        double bigMac$ = myScanner.nextDouble();                                            // stores user double input for bigMac$ as a double
        
	    System.out.print("Enter the percent tax as a whole number (xx): ");                 // prompts user for tax
        double taxRate = myScanner.nextDouble();                                            // stores user double input for taxRate as a double
        
        taxRate/=100;                                                                       // calculates taxRate as a percent
        
        
        double cost$;
        int dollars, dimes, pennies;                                                        // declares cost$ as a double
        cost$ = nBigMacs*bigMac$*(1+taxRate);                                               // declares dollars, dimes, and pennies as integers
        dollars=(int)cost$;                                                                 // calculates dollar amount
        dimes=(int)(cost$*10)%10;                                                           // calculates dime amount
        pennies=(int)(cost$*100)%10;                                                        // calculates penny amount
        
        // final print
        System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+bigMac$+" per Big Mac, with a sales tax of "+(int)(taxRate*100)+ "%, is $"+dollars+"."+dimes+pennies+".");

    }
}