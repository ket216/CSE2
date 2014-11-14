/*  Kevin Trinh
    CSE 2
    lab 11 - Arrays
    November 14, 2014
    
    This code is an exercise in elementary array operations.
*/

// import Scanner utility
import java.util.Scanner;

// add a class
public class Arrays {
    
    // add main method
    public static void main(String[] args) {
        
        int[] userInts = new int[10];                                           // declares array userInts to 10 spaces
        int[] userInts2 = new int[10];                                          // declares array userInts2 to 10 spaces
        Scanner userInput = new Scanner(System.in);                             // declares and assigns new Scanner utility
        
        System.out.println("Enter 10 ints: ");                                  // prompts user to enter 10 ints
        for (int i = 0; i <= 9; i++) {                                          // for number of entries 0-9 (10 total)...
            
            int temp = userInput.nextInt();                                     // int temp is the inputted integer
            userInts[i] = temp;                                                 // ith value of userInts is set to temp
            userInts2[(9-i)] = temp;                                            // (9 - i)th value of userInts2 is set to temp (reverses arrays)
            
        }
        
        int lowest = userInts[0];                                               // variable lowest is set to first entry in array userInts
        int highest = userInts[0];                                              // variable highest is set to first entry in array userInts
        int sum = 0;                                                            // variable sum is set to 0
        
        // for loop to find lowest value
        for (int i = 0; i <= 9; i++) {                                          // for entries 0-9...
            
            if (lowest > userInts[i]) {                                         // if lowest is greater than current entry...
                
                lowest = userInts[i];                                           // lowest is updated to current entry's value
                
            }
        
        }
        
        // for loop to find highest value
        for (int i = 0; i <= 9; i++) {                                          // for entries 0-9...
            
            if (highest < userInts[i]) {                                        // if highest is lower than current entry...
                
                highest = userInts[i];                                          // highest is updated to current entry's value
                
            }
        
        }
        
        // for loop to find sum
        for (int i = 0; i <= 9; i++) {                                          // for entries 0-9...
            
            sum = sum + userInts[i];                                            // sum is current sum plus current entry
        
        }
        
        System.out.println("The lowest entry is: " + lowest);                   // prints out lowest value
        System.out.println("The highest entry is: " + highest);                 // prints out highest value
        System.out.println("The sum of values is: " + sum);                     // prints out sum value
        System.out.println("-----------");                                      // prints out divider line
        
        for (int i = 0; i <= 9; i++) {                                          // for entries 0-9...
            
            System.out.printf(userInts[i] + "\t" + userInts2[i] + "\n");        // print array entries for forward and reverse arrays
            
        }
        
    }
}