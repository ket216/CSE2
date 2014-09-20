/*  Kevin Trinh
    CSE 2
    lab04 - BigMacAgain
    September 17, 2014
    
    This program prompts the user for how many Big Macs they wish to order.
    The program also asks if the user wants an order of fries.
    The program returns errors if the user does not enter the proper type of input.
    The program returns the final cost of the meal
*/

import java.util.Scanner;                                                                               // imports Scanner utility

// define a class
public class BigMacAgain{
    
    // add main method
    public static void main(String[] args){
        double costPerBigMac = 2.22;                                                                    // declares double cost per Big Mac
        double costPerFries = 2.15;                                                                     // declares double cost per order of fries
        int nBigMacs;                                                                                   // declares nBigMacs as an integer
        int nFries;                                                                                     // declares nFries as an integer
        
        Scanner bigMac = new Scanner(System.in);                                                        // declares and names new Scanner
        
        System.out.println("How many Big Macs would you like? ");                                       // prompts user for number of Big Macs they'd like
        
            if (bigMac.hasNextInt()) {                                                                  // if user enters an integer...
                nBigMacs = bigMac.nextInt();                                                            // nBigMacs is set to that integer
                
                if (nBigMacs<0){                                                                        // if the integer < 0
                    System.out.println("You did not enter a valid number of Big Macs.");                // prints error
                    return;                                                                             // terminates code
                }
                else {                                                                                  // if user did enter an integer...
                    double totalCostofBigMacs = costPerBigMac*nBigMacs;                                 // calculates total cost of Big Macs
                    System.out.println("Big Mac total: $" + (int)(totalCostofBigMacs*100)/100.0);       // prints out total for Big Macs
                }
            }
            else{                                                                                       // if user did not enter an integer...
                System.out.println("You did not enter an integer.");                                    // prints error
                return;                                                                                 // terminates code
            }
        
        System.out.println(" ");                                                                        // prints break
        
        System.out.println("Would you like fries with your order? (Y/y/N/n)");                          // prompts user if they would like fries
            if (bigMac.hasNext()) {                                                                     // if user enters a string...
                String Fries = bigMac.next();                                                           // String fries is set to that string
                
                if (Fries.equals("Y")||Fries.equals("y")) {                                             // if the user input is Y or y...
                    System.out.println("How many orders of fries would you like? ");                    // prompts user for number of fries they would like
                    if (bigMac.hasNextInt()) {                                                          // if user inputs an integer...
                        nFries = bigMac.nextInt();                                                      // nFries is set to that integer
                    
                        if (nFries<0){                                                                  // if integer < 0...
                            System.out.println("You entered an invalid number of orders of fries.");    // prints error
                            return;                                                                     // terminates code
                        }
                        else {                                                                          // if user did enter an integer...
                            double totalCostofFries = costPerFries*nFries;                              // calculates totalCostofFries
                            double totalCost = totalCostofFries+(costPerBigMac*nBigMacs);               // calculates totalCost
                            System.out.println("Fries total: $"+ (int)(totalCostofFries*100)/100.0);    // prints fries total
                            System.out.println(" ");                                                    // prints break
                            System.out.println("Order total: $" + (int)(totalCost*100)/100.0);          // prints order total
                        }
                    
                    }
                    else {                                                                              // if user did not enter an integer...
                        System.out.println("You did not input a valid number of orders of fries.");     // prints error
                    }
                }
                else if (Fries.equals("N")||Fries.equals("n")) {                                        // if the user input is N or n...
                    System.out.println("Total: $" + (int)(costPerBigMac*nBigMacs*100)/100.0);           // prints totalCostofBigMacs
                }
                else {                                                                                  // if user input is something other than YyNn...
                    System.out.println("You did not input a valid response.");                          // prints error
                    return;                                                                             // terminates code
                }
                
            }
    }
}