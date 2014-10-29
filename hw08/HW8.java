/*  Kevin Trinh
    CSE 2
    hw08
    October 24, 2014
    
    This code is an exercise in writing overloaded methods.
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class HW8 {
    
    // add getInput method for continuing
    public static char getInput(Scanner scan, String userString) {
            
        char C = userString.charAt(0);                                                                  // char C is the 0th string character
        char c = userString.charAt(1);                                                                  // char c is the 1st string character
            
        while (true) {                                                                                  // while true...
            userString = scan.next();                                                                   // clears scanner
            
            if (userString.length() == 1) {                                                             // if userString is 1 letter long...
                
                if (userString.equals("C")) {                                                           // if userString is C...
                    return C;                                                                           // return char C
                }
                else if (userString.equals("c")) {                                                      // if userString is c...
                    return c;                                                                           // return char c
                }
                else {                                                                                  // otherwise...
                    System.out.print("You did not enter either C or c. Please try again: ");            // prints error
                    continue;                                                                           // continues while loop
                }
                
            }
            else {                                                                                      // if userString is not 1 letter long...
                System.out.print("You did not enter a char. Please try again: ");                       // prints error
                continue;                                                                               // continues while loop
            }
        }
    }
    
    // add getInput method
    public static char getInput(Scanner scan, String yYnN, int attempts) {
        
        char y = yYnN.charAt(0);                                                                        // char y is the 0th string character
        char Y = yYnN.charAt(1);                                                                        // char Y is the 1st string character
        char n = yYnN.charAt(2);                                                                        // char n is the 2nd string character
        char N = yYnN.charAt(3);                                                                        // char N is the 3rd string character
        int i = 0;                                                                                      // incremental variable
        
        while (true) {                                                                                  // while true
            
            while (i < attempts) {                                                                      // while i < attempts
                String userString = scan.next();                                                        // declare and assign new scanner
                
                if (userString.length() == 1) {                                                         // if string length is 1...
                    
                    switch (userString) {                                                               // switch on userString
                        
                        case "y":                                                                       // if y
                            return y;                                                                   // return y
                        case "Y":                                                                       // if Y
                            return Y;                                                                   // return Y
                        case "n":                                                                       // if n
                            return n;                                                                   // return n
                        case "N":                                                                       // if N
                            return N;                                                                   // return N
                        default:                                                                        // default
                            System.out.print("You did not enter y, Y, n, or N. Please try again: ");    // prints error
                            i++;                                                                        // increments i
                            continue;                                                                   // continues loop
                    }
                
                }
                else {                                                                                  // if string length > 1...
                    System.out.print("You did not enter a char. Please try again: ");                   // prints error
                    i++;                                                                                // increments i
                    continue;                                                                           // continues loop
                }
            }
            System.out.println("");                                                                     // prints break
            System.out.println("You failed after 5 tries.");                                            // prints error
            return ' ';                                                                                 // return ' ' for failure
        }
        
    }
    
    // add getInput method for choose a digit
    public static char getInput(Scanner scan, String choose, String digits) {
        
        System.out.print(choose + "(" + digits + "): ");                                                // prompts users for digits
        
        char zero = digits.charAt(0);                                                                   // char zero is the 0th string character
        char one = digits.charAt(1);                                                                    // char one is the 1st string character
        char two = digits.charAt(2);                                                                    // char two is the 2nd string character
        char three = digits.charAt(3);                                                                  // char three is the 3rd string character
        char four = digits.charAt(4);                                                                   // char four is the 4th string character
        char five = digits.charAt(5);                                                                   // char five is the 5th string character
        char six = digits.charAt(6);                                                                    // char six is the 6th string character
        char seven = digits.charAt(7);                                                                  // char seven is the 7th string character
        char eight = digits.charAt(8);                                                                  // char eight is the 8th string character
        char nine = digits.charAt(9);                                                                   // char nine is the 9th string character
        
        while (true) {                                                                                  // while true
            String userString = scan.next();                                                            // declare and assign new scanner
            
            if (userString.length() == 1) {                                                             // if string length is 1...
                
                switch (userString) {                                                                   // switch on userString
                    
                    case "0":                                                                           // if 0
                        return zero;                                                                    // returns zero
                    case "1":                                                                           // if 1
                        return one;                                                                     // returns one
                    case "2":                                                                           // if 2
                        return two;                                                                     // returns two
                    case "3":                                                                           // if 3
                        return three;                                                                   // returns three
                    case "4":                                                                           // if 4
                        return four;                                                                    // returns four
                    case "5":                                                                           // if 5
                        return five;                                                                    // returns five
                    case "6":                                                                           // if 6
                        return six;                                                                     // returns six
                    case "7":                                                                           // if 7
                        return seven;                                                                   // returns seven
                    case "8":                                                                           // if 8
                        return eight;                                                                   // returns eight
                    case "9":                                                                           // if 9
                        return nine;                                                                    // returns nine
                    default:                                                                            // default
                        System.out.print("You did not enter from 01234567889. Please try again: ");     // prints error
                        continue;                                                                       // continues while loop
                }
            }
            else {                                                                                      // if string length is not 1...
                System.out.print("You did not enter a char. Please try again: ");                       // prints error
                continue;                                                                               // continues while loop
            }
        }
    }
    
    // add main method
    public static void main(String[] args) {
        
        char input;                                                                                     // sets input as char type
        Scanner scan = new Scanner(System.in);                                                          // declares and assigns new Scanner
        
        System.out.print("Enter 'C' or 'c' to continue: ");                                             // prompts user for C or c
        input = getInput(scan, "Cc");                                                                   // calls getInput for continuing
        System.out.println("You entered '" + input + "'.");                                             // prints out user's input
        
        System.out.print("Enter 'y', 'Y', 'n', or 'N': ");                                              // prompts user for y, Y, n, N
        input = getInput(scan, "yYnN", 5);                                                              // calls getInput for yes or no
        if (input != ' ') {                                                                             // if input is not ' ' (passed)
            System.out.println("You entered '" + input + "'");                                          // prints out user's input
        }
        
        input = getInput(scan, "Choose a digit", "0123456789");                                         // calls getInput for digits    
        System.out.println("You entered '" + input + "'");                                              // prints out user's input
        
    }
}