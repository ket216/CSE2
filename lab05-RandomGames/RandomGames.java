/*  Kevin Trinh
    CSE 2
    lab05-RandomGames
    September 26, 2014
    
    This code prompts the user for a random game type.
    The code then outputs the results of the chosen game (Roulette, Craps, or Pick a Card).
*/

// imports Scanner utility
import java.util.Scanner;

// define a class
public class RandomGames {
    
    // add main method
    public static void main(String[] args) {
        System.out.println("Enter R or r for Roulette, C or c for Craps, P or p for Pick a Card: ");    // prompts user for game input
        
        Scanner gameInput = new Scanner(System.in);                                                     // creates and declares gameInput as Scanner
        
        if(gameInput.hasNext()) {                                                                       // if gameInput has next string...
            String game = gameInput.next();                                                             // sets String game as Scanner input
            
            if (game.length() > 1) {                                                                    // if Scanner input > 0...
                System.out.println("You did not enter a valid input.");                                 // returns error
            }
            else {                                                                                      // if Scanner input !> 0...
                switch(game) {                                                                          // switch on game
                
                    case "R":                                                                           // if game = R
                    case "r":                                                                           // or if game = r
                        
                        int Roulette = (int)((Math.random())*38)+1;                                     // randomly generates numbers from 1-38
                        
                        if (Roulette == 37 || Roulette == 38) {                                         // if Roulette is 37 or 38...
                            
                            switch(Roulette) {                                                          // switch on Roulette
                                
                                case 37:                                                                // if Roulette is 37
                                    System.out.println("The results of the Roulette game are: 0");      // prints result is 0
                                    break;                                                              // breaks Roulette switch
                                    
                                case 38:                                                                // if Roulette is 38
                                    System.out.println("The results of the Roulette game are: 00");     // prints result is 00
                                    break;                                                              // breaks Roulette switch
                                
                                default:                                                                // I don't think I need this because of if statement...                                                              
                                    break;                                                              // breaks Roulette switch
                            }                                                                           // end of switch statement
                        }                                                                               // end of if statement
                        else {                                                                          // if Roulette != 37 or 38...
                        System.out.println("The results of the Roulette game are: " + Roulette);        // prints results of Roulette
                        }                                                                               // end of else statement
                        break;                                                                          // breaks game switch
                        
                    case "C":                                                                           // if game = C
                    case "c":                                                                           // if game = c
                        System.out.println("This feature has not yet been implemented.");               // prints feature has not yet been implemented
                        break;                                                                          // breaks game switch
                        
                    case "P":                                                                           // if game = P
                    case "p":                                                                           // if game = p
                        System.out.println("This feature has not yet been implemented.");               // prints feature has not yet been implemented
                        break;                                                                          // breaks game switch
                        
                    default:                                                                            // if game != R,r,C,c,P,p...
                        System.out.println("You did not enter a valid input.");                         // prints error
                        break;                                                                          // breaks game switch
                }                                                                                       // end of game switch
            }                                                                                           // end of game.length() else statement
        }                                                                                               // end of gameInput.hasNext() if statement
        else {                                                                                          // if gameInput does not have next string...
            System.out.println("You did not enter a valid input.");                                     // returns error
            return;                                                                                     // terminates code
        }                                                                                               // end of gameInput.hasNext() else statement
        
    }                                                                                                   // end of main method
}                                                                                                       // end of public class