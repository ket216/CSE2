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
        int tenths;                                 // declares variable for tenths place
        int hundredths;                             // declares variable for hundredths place
        int thousandths;                            // declares variable for thousandths place
        int tenthousandths;                         // declares variable for ten thousandths place
        
        tenths=(int)(fourDigit*10)%10;              // calculates 10ths place
        hundredths=(int)(fourDigit*100)%10;         // calculates 100ths place
        thousandths=(int)(fourDigit*1000)%10;       // calculates 1000ths place
        tenthousandths=(int)(fourDigit*10000)%10;   // calculates 10000ths place
        
        // final print
        System.out.println("The four digits are: " + tenths + hundredths + thousandths + tenthousandths + ".");
    }
}