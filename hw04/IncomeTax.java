/*  Kevin Trinh
    CSE 2
    hw04 - IncomeTax
    September 19, 2014
    
    This code prompts the user to input their income in thousands.
    The code then determines which tax bracket they're in.
    The code calculates and prints out their income tax.
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class IncomeTax {
    
    // add main method
    public static void main(String[] args) {
        
        // declares tax rates variables as percentages
        double taxrate020 = 0.05;
        double taxrate2040 = 0.07;
        double taxrate4078 = 0.12;
        double taxrate78up = 0.14;
        
        // declares variables for the tax amount
        double tax020;
        double tax2040;
        double tax4078;
        double tax78up;
        
        Scanner incomeTax = new Scanner(System.in);                             // creates new Scanner incomeTax
        
        System.out.println("Enter your income in thousands: ");                 // prompts user for income in thousands
            if (incomeTax.hasNextInt()) {                                       // if the scanner has next integer...
                int income = incomeTax.nextInt();                               // declares and sets income to that integer
                
                if (income < 0) {                                               // if income < 0...
                    System.out.println("You did not enter a valid integer.");   // returns error
                    return;                                                     // terminates code
                }
            
                else if (income >= 0 && income <= 20) {                                                                                             // if 0 < income < 20...
                    tax020 = income * taxrate020;                                                                                                   // calculates tax rate
                    System.out.println("At a 5% interest rate, the income tax for $" + income + ",000 is $" + (int)(tax020*100000)/100.0 + ".");    // prints out income and income tax
                }
                
                else if (income > 20 && income <= 40) {                                                                                             // if 20 < income < 40...
                    tax2040 = income * taxrate2040;                                                                                                 // calculates tax rate
                    System.out.println("At a 7% interest rate, the income tax for $" + income + ",000 is $" + (int)(tax2040*100000)/100.0 + ".");   // prints out income and income tax
                }
                
                else if (income > 40 && income <= 78) {                                                                                             // if 40 < income < 78...
                    tax4078 = income * taxrate4078;                                                                                                 // calculates tax rate
                    System.out.println("At a 12% interest rate, the income tax for $" + income + ",000 is $" + (int)(tax4078*100000)/100.0 + ".");  // prints out income and income tax
                }
                
                else if (income > 78) {                                                                                                             // if income > 78...
                    tax78up = income * taxrate78up;                                                                                                 // calculates tax rate
                    System.out.println("At a 14% interest rate, the income tax for $" + income + ",000 is $" + (int)(tax78up*100000)/100.0 + ".");  // prints out income and income tax
                }
            } 
            
            else {                                                              // if the scanner does not have the next integer...
                System.out.println("You did not enter an integer.");            // returns error
                return;                                                         // terminates code
            }
        
    }
}