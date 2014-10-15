/*  Kevin Trinh
    CSE 2
    hw06 - Roulette.java
    October 14, 2014
    
    This program counts the number of times a specific number comes up in a game of Roulette.
    Program then prints out how many times person won, and their earnings.
*/

// define a class
public class Roulette {
    
    // add main method
    public static void main(String[] args) {
        
        int userNumber = (int)((Math.random())*38)+1;                           // userNumber is randomly chosen between 1-38
        int i = 0;                                                              // counter for current round number
        int roundsWon = 0;                                                      // counter for rounds user won
        
        while (i<100) {                                                         // while current round number < 1...
            
            int Roulette = (int)((Math.random())*38)+1;                         // randomly generates numbers from 1-38
                            
                if (userNumber == Roulette) {                                   // if the user wins...
                    roundsWon++;                                                // increments roundsWon
                }                                                               // end of if statement
                
                i++;                                                            // increments i
        }                                                                       // end of while loop
        
        if (roundsWon >= 3 && userNumber <=36) {                                // if user won more than 3 rounds and <= 36...
            int userEarnings = roundsWon*36;                                    // calculates earnings
            System.out.println("You bet on: " + userNumber);                    // prints out user's number
            System.out.println("You won " + roundsWon + " times.");             // prints out how many rounds won
            System.out.println("You won $" + userEarnings + "!");               // prints out earnings
        }
        else if (roundsWon >=3 && userNumber == 37) {                           // if user won more than 3 rounds and == 37...
            int userEarnings = roundsWon*36;                                    // calculates earnings
            System.out.println("You bet on: 0");                                // prints out user's number (0)
            System.out.println("You won " + roundsWon + " times.");             // prints out how many rounds won
            System.out.println("You won $" + userEarnings + "!");               // prints out earnings
        }
        else if (roundsWon >=3 && userNumber == 38) {                           // if user won more than 3 rounds and == 38...
            int userEarnings = roundsWon*36;                                    // calculates earnings
            System.out.println("You bet on: 00");                               // prints out user's number (00)
            System.out.println("You won " + roundsWon + " times.");             // prints out how many rounds won
            System.out.println("You won $" + userEarnings + "!");               // prints out earnings
        }
        else if (roundsWon <3 && userNumber == 37) {                            // if user won less than 3 rounds and == 37...
            int userEarnings = roundsWon*36;                                    // calculates earnings
            System.out.println("You bet on: 0");                                // prints out user's number (0)
            System.out.println("Sorry, you only won " + roundsWon + " times."); // prints out sympathetic message
        }
        else if (roundsWon <3 && userNumber == 38) {                            // if user won less than 3 rounds and == 38...
            int userEarnings = roundsWon*36;                                    // calculates earnings
            System.out.println("You bet on: 00");                               // prints out user's number
            System.out.println("Sorry, you only won " + roundsWon + " times."); // prints out sympathetic message
        }
        else {                                                                  // otherwise...
            System.out.println("You bet on: " + userNumber);                    // prints out user's number
            System.out.println("Sorry, you only won " + roundsWon + " times."); // prints out sympathetic message
        }    
    }                                                                           // end of main method
}                                                                               // end of public class

