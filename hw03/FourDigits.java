/*  Kevin Trinh
    CSE 2
    hw03 - FourDigits
    September 16, 2014
*/

import java.util.Scanner;

// define a class
public class FourDigits {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner digit = new Scanner (System.in);    // declares digit as a Scanner from system input
        System.out.println("Enter a double: ");     // prompts user to enter a double
        double fourDigit = digit.nextDouble();      // stores user's double into fourDigit
        
        int left = (int)fourDigit;                  // converts fourDigit to integer (digits left of decimal)
        double right = (fourDigit-left)*10000;      // "removes" digits left of decimal and * 10,000 so four digits are now left of decimal
        int rightDigits = (int)right;               // converts double right to int rightDigits
        
        // final print
        System.out.println("The four digits are: " +rightDigits +".");
    }
}