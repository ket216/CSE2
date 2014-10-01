/*  Kevin Trinh
    CSE 2
    hw05 - BurgerKing.java
    September 30, 2014
    
    This program prompts the user to enter a choice of a burger, a soda, or fries.
    The program then prompts the users for details of their choices.
*/

// imports scanner utility
import java.util.Scanner;

// define a class
public class BurgerKing {
    
    // add main method
    public static void main(String[] args) {
        
        Scanner userChoice = new Scanner(System.in);                                                            // creates and declares new scanner
        
        System.out.println("Enter a letter to indicate choice of:");                                            // prompts user for choice
        System.out.println("\t Burger (B or b)");                                                               // displays burger input
        System.out.println("\t Soda (S or s)");                                                                 // displays soda input
        System.out.println("\t Fries (F or f)");                                                                // displays fries input
        
        if (userChoice.hasNext()) {                                                                             // if scanner has a string for food...
            String choice = userChoice.next();                                                                  // stores string into "choice"
            
            switch (choice) {                                                                                   // switch choice...
                
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// BURGER
                
                case "B":                                                                                       // if choice = "B"...
                case "b":                                                                                       // or if choice = "b"...
                    System.out.println("What would you like on your burger?");                                  // prompts user for burger toppings
                    System.out.println("\t All the fixins (A or a)");                                           // displays all fixins input
                    System.out.println("\t Cheese (C or c)");                                                   // displays cheese input
                    System.out.println("\t Nothing (N or n)");                                                  // displays nothing input
                    
                    if (userChoice.hasNext()) {                                                                 // if scanner has a string...
                        choice = userChoice.next();                                                             // stores string into "choice"
                        
                        switch(choice) {                                                                        // switch choice...
                            
                            case "A":                                                                           // if choice = "A"
                            case "a":                                                                           // or if choice = "a"
                                System.out.println("You ordered a burger with all the fixins.");                // displays topping
                                break;                                                                          // breaks switch statement
                                
                            case "C":                                                                           // if choice = "C"
                            case "c":                                                                           // or if choice = "c"
                                System.out.println("You ordered a burger with cheese.");                        // displays topping
                                break;                                                                          // breaks switch statement
                            
                            case "N":                                                                           // if choice = "N"
                            case "n":                                                                           // or if choice = "n"
                                System.out.println("You ordered a plain burger.");                              // displays topping
                                break;                                                                          // breaks switch statement
                                
                            default:                                                                            // if choice is something else
                                System.out.println("You did not enter a valid input.");                         // prints error
                                break;                                                                          // breaks switch statement
                            
                        }       // ends switch statement
                        
                    }       // ends if statement
                    else {                                                                                      // if scanner does NOT have a string for food...
                        System.out.println("You did not enter a valid input.");                                 // prints error
                        break;                                                                                  // terminates code
                    }
                break;                                                                                          // break for "B" or "b" case
                    
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// SODA
                    
                case "S":                                                                                       // if choice = "S"...
                case "s":                                                                                       // or if choice = "s"...
                    System.out.println("What kind of soda would you like?");                                    // prompts user for soda preference
                    System.out.println("\t Coke (C or c)");                                                     // displays Coke input
                    System.out.println("\t Pepsi (P or p)");                                                    // displays Pepsi input
                    System.out.println("\t Sprite (S or s)");                                                   // displays Sprite input
                    System.out.println("\t Mountain Dew (M or m)");                                             // displays MD input
                    
                    if (userChoice.hasNext()) {                                                                 // if scanner has a string...
                        choice = userChoice.next();                                                             // stores string into "choice"
                        
                        switch(choice) {                                                                        // switch choice...
                            
                            case "C":                                                                           // if choice = "C"
                            case "c":                                                                           // or if choice = "c"
                                System.out.println("You ordered a Coke.");                                      // displays Coke preference
                                break;                                                                          // breaks switch statement
                                
                            case "P":                                                                           // if choice = "P"
                            case "p":                                                                           // or if choice = "p"
                                System.out.println("You ordered a Pepsi.");                                     // displays Pepsi preference
                                break;                                                                          // breaks switch statement
                            
                            case "S":                                                                           // if choice = "S"
                            case "s":                                                                           // or if choice = "s"
                                System.out.println("You ordered a Sprite.");                                    // displays Sprite preference
                                break;                                                                          // breaks switch statement
                                
                            case "M":                                                                           // if choice = "M"
                            case "m":                                                                           // or if choice = "m"
                                System.out.println("You ordered a Mountain Dew.");                              // displays MD preference
                                break;                                                                          // breaks switch statement
                                
                            default:                                                                            // if choice is something else
                                System.out.println("You did not enter a valid input.");                         // prints error
                                break;                                                                          // breaks switch statement
                            
                        }       // ends switch statement
                        
                    }       // ends if statement
                    else {                                                                                      // if scanner does NOT have a string for food...
                        System.out.println("You did not enter a valid input.");                                 // prints error
                        break;                                                                                  // terminates code
                    }
                break;                                                                                          // break for "S" or "s" case
                    
                /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// FRIES
                
                case "F":                                                                                       // if choice = "F"...
                case "f":                                                                                       // or if choice = "f"...
                    System.out.println("What size fries would you like?");                                      // prompts user for fry size
                    System.out.println("\t Small (S or s)");                                                    // displays small input
                    System.out.println("\t Medium (M or m)");                                                   // displays medium input
                    System.out.println("\t Large (L or L)");                                                    // displays large input
                    
                    if (userChoice.hasNext()) {                                                                 // if scanner has a string...
                        choice = userChoice.next();                                                             // stores string into "choice"
                        
                        switch(choice) {                                                                        // switch choice...
                            
                            case "S":                                                                           // if choice = "S"
                            case "s":                                                                           // or if choice = "s"
                                System.out.println("You ordered small fries.");                                 // displays small fry size preference
                                break;                                                                          // breaks switch statement
                                
                            case "M":                                                                           // if choice = "M"
                            case "m":                                                                           // or if choice = "m"
                                System.out.println("You ordered medium fries.");                                // displays medium fry size preference
                                break;                                                                          // breaks switch statement
                                
                            case "L":                                                                           // if choice = "L"
                            case "l":                                                                           // or if choice = "l"
                                System.out.println("You ordered large fries.");                                 // displays large fry size preference
                                break;                                                                          // breaks switch statement
                                
                            default:                                                                            // if choice is something else
                                System.out.println("You did not enter a valid input.");                         // prints error
                                break;                                                                          // breaks switch statement
                            
                        }       // ends switch statement
                        
                    }       // ends if statement
                    else {                                                                                      // if scanner does NOT have a string for food...
                        System.out.println("You did not enter a valid input.");                                 // prints error
                        break;                                                                                  // terminates code
                    }
                break;                                                                                          // break for "S" or "s" case
                    
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    
                default:                                                                                        // if food choice is not B,b,S,s,F,f...
                    System.out.println("You did not enter a valid input.");                                     // prints error
                    break;                                                                                      // terminates code
                    
            }       // ends switch statement for B,b,S,s,F,f
            
            
        }       // end of if statement for if scanner.hasNext()
        else {                                                                                                  // if scanner does NOT have a string for food...
            System.out.println("You did not enter a valid input.");                                             // prints error
            return;                                                                                             // terminates code
        }       // end of else statement
        
    }       // end of main method
}       // end of public class