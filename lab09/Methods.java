/*  Kevin Trinh
    CSE 2
    lab08 - Methods.java
    October 24, 2014
    
    This code is practicing the use of methods.
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class Methods {


    // add getInt method
    public static int getInt(Scanner userInt) {
        
        while (true) {                                                              // while true
            if (userInt.hasNextInt()) {                                             // if scanner has next int...
                return userInt.nextInt();                                           // return that int
            }
            else {                                                                  // if scanner ! has next int...
                System.out.println("You did not enter an integer. Try again: ");    // prints error
                userInt.next();                                                     // clears scanner
                continue;                                                           // continues while loop
            }
        }
    }

    // add larger method
    public static int larger(int first, int second) {
        
        if (first > second) {                                                       // if first > second
            return first;                                                           // return first
        }
        else {                                                                      // otherwise...
            return second;                                                          // return second
        }

    }

    // add ascending method
    public static boolean ascending(int first, int second, int third) {
        
        if (second > first && third > second) {                                     // if a < b < c...
            return true;                                                            // return true
        }
        else {                                                                      // otherwise...
            return false;                                                           // return false
        }
    }

    // add main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);                                      // declares and assigns scanner
        
        int a, b, c;                                                                // declares ints a, b, and c
        System.out.println("Enter three integers: ");                               // prompts user for 3 integers
        a = getInt(scan);                                                           // calls getInt method for int a
        b = getInt(scan);                                                           // calls getInt method for int b
        c = getInt(scan);                                                           // calls getInt method for int c
        
        // calls larger method and prints the larger of a and b
        System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b) + ".");
        // calls larger method and prints the larger of a, b, and c
        System.out.println("The larger of " + a + ", " + b + ", and " + c + " is " + larger(a, larger(b, c)) + ".");
        // calls ascending method and prints if the order of the integers were in ascending order as given.
        System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b + ", and " + c + " are in ascending order.");
        
    }
        
}