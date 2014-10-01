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
        System.out.println("Enter R or r for Roulette, C or c for Craps, P or p for Pick a Card: ");
        
        Scanner gameInput = new Scanner(System.in);
        
        if(gameInput.hasNext()) {
            String game = gameInput.next();
            
            switch(game) {
            
                case "R":
                    
                    int Roulette = (int)((Math.random())*38)+1; // fix this.. this prints out up to 38!
                    
                    
                    
                    System.out.println("The results of the Roulette game are: " + Roulette);
                    break;
                    
                case "r":
                    System.out.println("This feature has not yet been implemented.");
                    break;
                    
                case "C":
                    System.out.println("This feature has not yet been implemented.");
                    break;
                    
                case "c":
                    System.out.println("This feature has not yet been implemented.");
                    break;
                    
                case "P":
                    System.out.println("This feature has not yet been implemented.");
                    break;
                    
                case "p":
                    System.out.println("This feature has not yet been implemented.");
                    break;
                    
                default:
                    System.out.println("You did not enter a valid input.");
                    break;
            }
        }
        else {
            System.out.println("You did not enter a valid input.");
            return;
        }
        
    }
}