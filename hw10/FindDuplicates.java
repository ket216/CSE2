/*  Kevin Trinh
    CSE 2
    hw10 - FindDuplicates
    November 18, 2014
    
    This code compares the values within an array to see if there are duplicates.
    Distinction between one and one or more duplicates must be specified.
*/

// import Scanner utility
import java.util.Scanner;

// add a class
public class FindDuplicates {
    
    // add listArray method
    public static String listArray(int num[]) {
        
        String out = "{";                                                               // prints {
        
        for (int j = 0; j < num.length; j++) {                                          // for loop to print out values

            if (j > 0) {                                                                // if j > 0...
                out += ", ";                                                            // print comma space
            }
            out += num[j];                                                              // then prints number
            
        }
        out += "} ";                                                                    // prints }
        return out;                                                                     // returns array
    }
    
    // add hasDups method
    public static boolean hasDups(int num[]) {
        
        int counter = 0;                                                                // counter variable for number of duplicates
        
        for (int i = 0; i < 9; i++) {                                                   // for loop to check values in array
            
            if (num[i] == num[i+1]) {                                                   // if (i)th value = (i+1)th value...
                counter++;                                                              // increments counter
            }
            
        }
        
        if (counter >= 1) {                                                             // if counter >= 1...
            return true;                                                                // returns true (has duplicates)
        }
        else {                                                                          // else...
            return false;                                                               // returns false
        }
        
    }
    
    // add exactlyOneDup method
    public static boolean exactlyOneDup(int num[]) {
        
        int counter = 0;                                                                // counter variable for number of duplicates
        
        for (int i = 0; i < 9; i++) {                                                   // for loop to check values in array
            
            if (num[i] == num[i+1]) {                                                   // if (i)th value = (i+1)th value...
                counter++;                                                              // increments counter
            }
            
        }
        
        if (counter == 1) {                                                             // if counter == 1...
            return true;                                                                // returns true (has 1 duplicate)
        }
        else {                                                                          // else...
            return false;                                                               // returns false
        }
        
    }
    
    // add main method
    public static void main(String[] arg) {
        
        Scanner scan = new Scanner(System.in);                                          // declares and assigns new Scanner
        int num[] = new int[10];                                                        // creates array of size 10
        String answer = "";                                                             // initialize String answer as blank
        
        do {
            
            System.out.println("Enter 10 ints: ");                                      // prompts user for 10 ints
            
            for (int j = 0; j < 10; j++) {                                              // for loop controlling int placement in array
                num[j] = scan.nextInt();                                                // (j)th value of array is scan.nextInt
            }
            
            String out = "The array ";                                                  // declares String out as "The array "
            out += listArray(num);                                                      // adds string of the form "{x, y, z}" to out
            
            if (hasDups(num)) {                                                         // if array hasDups is true...
                out += "has ";                                                          // adds "has " to out
            }
            else {                                                                      // otherwise
                out += "does not have ";                                                // adds "does not have " to out
            }
            out += "duplicates.";                                                       // adds "duplicates." to out
            
            System.out.println(out);                                                    // prints String out
            
            out = "The array ";                                                         // reassigns String out as "The array "
            out += listArray(num);                                                      // adds string of the form "{x, y, z}" to out
            
            if (exactlyOneDup(num)) {                                                   // if array exactlyOneDups is true...
                out += "has ";                                                          // adds "has " to out
            }
            else {                                                                      // otherwise...
                out += "does not have ";                                                // adds "does not have " to out
            }
            
            out += "exactly one duplicate.";                                            // adds "exactly one duplicate." to out.
            
            System.out.println(out);                                                    // prints String out
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit: ");    // prompts user for rerun
            answer = scan.next();                                                       // answer is scan.next()
            
        } while (answer.equals("Y") || answer.equals("y"));                             // loop reruns while answer is Y or y
    }

    
}
