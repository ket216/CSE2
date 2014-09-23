/*  Kevin Trinh
    CSE 2
    hw04 - Month
    September 21, 2014
    
    This program prompts the user to enter a month as an integer.
    This program then tells the user how many days that month has.
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class Month {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner monthInput = new Scanner(System.in);                                                                        // declares scanner variable
        System.out.println("Enter an integer corresponding to a month: ");                                                  // prompts user for an integer
        
        if (monthInput.hasNextInt()) {                                                                                      // if scanner has next integer...
            int month = monthInput.nextInt();                                                                               // declares and sets variable month to that integer
            
            if (month > 12 || month <= 0) {                                                                                 // if 0 >= integer > 12...
                System.out.println("You did not enter a valid integer.");                                                   // returns error
                return;                                                                                                     // terminates code
            }
            else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {    // if month = 1, 3, 5, 7, 8, 10, or 12...
                System.out.println("The month has 31 days.");                                                               // prints the month has 31 days
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {                                               // if month = 4, 6, 9, 11...
                System.out.println("The month has 30 days.");                                                               // prints the month has 30 days
            }
            else if (month == 2) {                                                                                          // if month = 2...
                System.out.println("Enter the year: ");                                                                     // prompts user for the year
                if (monthInput.hasNextInt()) {                                                                              // if scanner has next integer...
                    int year = monthInput.nextInt();                                                                        // declares and sets variable year to that integer
                
                    if (year <= 0){                                                                                         // if year <= 0
                        System.out.println("You have not entered a valid year.");                                           // returns error
                        return;                                                                                             // terminates code
                    }
                    else {                                                                                                  // otherwise...
                        if (year%4 == 0 && (year%100!=0 || year%400 == 0)){                                                 // if year is divisible by 4 and is either not divisible by 100 or divisible by 400...
                            System.out.println("The month has 29 days.");                                                   // prints the month has 29 days
                        }
                        else {                                                                                              // otherwise...
                            System.out.println("The month has 28 days.");                                                   // the month has 28 days
                        }
                    }
                }
                else {                                                                                                      // if scanner did not have an integer...
                    System.out.println("You did not enter an integer.");                                                    // returns error
                    return;                                                                                                 // terminates code
                }
            }
        }
        else {                                                                                                              // if scanner did not have an integer...
            System.out.println("You did not enter an integer.");                                                            // returns error
            return;                                                                                                         // terminates code
        }
    }
}