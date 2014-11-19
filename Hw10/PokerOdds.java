/*  Kevin Trinh
    CSE 2
    hw10 - PokerOdds
    November 18, 2014
    
    This code )))))))))))))))))))))))))))\
    
*/

// imports Random utility
import java.util.Random;
// imports Scanner utility
import java.util.Scanner;

// add public class
public class PokerOdds {
    
    // add showHands method
    public static void showHands() {
        
        Scanner scan = new Scanner(System.in);                                          // declares and assigns new Scanner
        Random cards = new Random();                                                    // declares and assigns new Random
        int handArray[] = new int[5];                                                   // creates array of size 5
        String answer = "";                                                             // initialize String answer as blank
        String clubs = "Clubs: ";                                                       // initialize String club
        String diamonds = "Diamonds: ";                                                 // initialize String diamonds
        String hearts = "Hearts: ";                                                     // initialize String hearts
        String spades = "Spades: ";                                                     // initialize String spades
        
        do{
            clubs = "Clubs: ";                                                          // resets clubs
            diamonds = "Diamonds: ";                                                    // resets diamonds
            hearts = "Hearts: ";                                                        // resets hearts
            spades = "Spades: ";                                                        // resets spades
            
            for (int i = 0; i <= 4; i++) {                                              // for each card in the hand...
                
                handArray[i] = cards.nextInt(52);                                       // assign random value between 0 and 51
                
                switch (handArray[i]) {                                                 // switch on the cards in hand
                    
                    // assigns cards for clubs
                    case 0: clubs += "A ";
                        break;
                    case 1: clubs += "K ";
                        break;
                    case 2: clubs += "Q ";
                        break;
                    case 3: clubs += "J ";
                        break;
                    case 4: clubs += "10 ";
                        break;
                    case 5: clubs += "9 ";
                        break;
                    case 6: clubs += "8 ";
                        break;
                    case 7: clubs += "7 ";
                        break;
                    case 8: clubs += "6 ";
                        break;
                    case 9: clubs += "5 ";
                        break;
                    case 10: clubs += "4 ";
                        break;
                    case 11: clubs += "3 ";
                        break;
                    case 12: clubs += "2 ";
                        break;
                    
                    // assigns cards for diamonds
                    case 13: diamonds += "A ";
                        break;
                    case 14: diamonds += "K ";
                        break;
                    case 15: diamonds += "Q ";
                        break;
                    case 16: diamonds += "J ";
                        break;
                    case 17: diamonds += "10 ";
                        break;
                    case 18: diamonds += "9 ";
                        break;
                    case 19: diamonds += "8 ";
                        break;
                    case 20: diamonds += "7 ";
                        break;
                    case 21: diamonds += "6 ";
                        break;
                    case 22: diamonds += "5 ";
                        break;
                    case 23: diamonds += "4 ";
                        break;
                    case 24: diamonds += "3 ";
                        break;
                    case 25: diamonds += "2 ";
                        break;
                        
                    // assigns cards for hearts
                    case 26: hearts += "A ";
                        break;
                    case 27: hearts += "K ";
                        break;
                    case 28: hearts += "Q ";
                        break;
                    case 29: hearts += "J ";
                        break;
                    case 30: hearts += "10 ";
                        break;
                    case 31: hearts += "9 ";
                        break;
                    case 32: hearts += "8 ";
                        break;
                    case 33: hearts += "7 ";
                        break;
                    case 34: hearts += "6 ";
                        break;
                    case 35: hearts += "5 ";
                        break;
                    case 36: hearts += "4 ";
                        break;
                    case 37: hearts += "3 ";
                        break;
                    case 38: hearts += "2 ";
                        break;
                        
                    // assigns cards for spades
                    case 39: spades += "A ";
                        break;
                    case 40: spades += "K ";
                        break;
                    case 41: spades += "Q ";
                        break;
                    case 42: spades += "J ";
                        break;
                    case 43: spades += "10 ";
                        break;
                    case 44: spades += "9 ";
                        break;
                    case 45: spades += "8 ";
                        break;
                    case 46: spades += "7 ";
                        break;
                    case 47: spades += "6 ";
                        break;
                    case 48: spades += "5 ";
                        break;
                    case 49: spades += "4 ";
                        break;
                    case 50: spades += "3 ";
                        break;
                    case 51: spades += "2 ";
                        break;
                    
                    // default case
                    default:
                        break;
                }
                    
            }
            
            System.out.println(clubs);                                                      // prints clubs in hand
            System.out.println(diamonds);                                                   // prints diamonds in hand
            System.out.println(hearts);                                                     // prints hearts in hand
            System.out.println(spades);                                                     // prints spades in hand
            System.out.println("");                                                         // prints break
            System.out.print("Enter 'y' or 'Y' for a new hand, anything else to quit: ");   // prompts user for rerun
            answer = scan.next();                                                           // answer is scan.next()
            
            
        } while (answer.equals("Y") || answer.equals("y"));                                 // rerun while answer is Y or y
    
    }
    
    // add exactlyOneDup method
    public static boolean exactlyOneDup(int hand[]) {
        
        int counter = 0;                                                                // counter variable for number of duplicates
        
        for (int i = 0; i < 4; i++) {                                                   // for loop to check values in array
            
            if (hand[i] == hand[i+1]) {                                                 // if (i)th value = (i+1)th value...
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
    
    public static void simulateOdds() {
        
        int handArray[] = new int[5];                                                   // creates array of size 5
        Random cards = new Random();                                                    // declares and assigns new Random
        int counterA = 0;                                                               // counter variable for number of A duplicates
        int counterK = 0;                                                               // counter variable for number of K duplicates
        int counterQ = 0;                                                               // counter variable for number of Q duplicates
        int counterJ = 0;                                                               // counter variable for number of J duplicates
        int counter10 = 0;                                                              // counter variable for number of 10 duplicates
        int counter9 = 0;                                                               // counter variable for number of 9 duplicates
        int counter8 = 0;                                                               // counter variable for number of 8 duplicates
        int counter7 = 0;                                                               // counter variable for number of 7 duplicates
        int counter6 = 0;                                                               // counter variable for number of 6 duplicates
        int counter5 = 0;                                                               // counter variable for number of 5 duplicates
        int counter4 = 0;                                                               // counter variable for number of 4 duplicates
        int counter3 = 0;                                                               // counter variable for number of 3 duplicates
        int counter2 = 0;                                                               // counter variable for number of 2 duplicates
        int counterNM = 0;                                                              //counter variable for No Match duplicates
        int duplicate = -1;
        
        for (int i = 1; i <= 10000; i++) {                                              // for 10,000 iterations
            
            for (int j = 0; j <= 4; j++) {                                              // for each place in the hand
                
                handArray[j] = cards.nextInt(52);                                       // assign random number between 0 and 51
            
                if (exactlyOneDup(handArray)) {                                         // if hand has exactly one duplicate...
                    
                    for (int k = 0; k <= 4; k++) {                                      // for each card in the hand...
                        
                        duplicate = handArray[0];                                       // sets duplicate to first member in array
                        if (duplicate == handArray[1]) {                                // if duplicate matches 1st value in array...
                            duplicate = handArray[1];                                   // duplicate is that value
                        }
                        else if(duplicate == handArray[2]) {                            // if duplicate matches 2nd value in array...
                            duplicate = handArray[2];                                   // duplicate is that value
                        }
                        else if(duplicate == handArray[3]) {                            // if duplicate matches 3rd value in array...
                            duplicate = handArray[3];                                   // duplicate is that value
                        }
                        else if(duplicate == handArray[4]) {                            // if duplicate matches 4th value in array...
                            duplicate = handArray[4];                                   // duplicate is that value
                        }

                    }
                    
                }
                
                /* At this point in the code, I know I'm supposed to find how frequently each of the cards appear and increment that variable.
                   I ran out of time, but I know how I would do it.
                   It would be done with a series of switch statements checking the duplicate value against the card values given in the switch statements in a previous method.
                   If that duplicate value matches (let's say a King), the counterK variable would be incremented. This would be repeated all 10,000 times.
                   After finding all the matches, I would simply print/format the println statements to reflect the numbers of duplicates with the given cards.
                
                   Sorry for the messy code, I may or may not have done this the last minute. No time to organize.
                */
                
                else {                                                                  // if hand does not have a duplicate...
                    
                    counterNM++;                                                        // increment no match counter
                    
                }
            }
        }
        System.out.println("");                                                         // line break
        System.out.println(duplicate);                                                  // prints out the duplicate value
        System.out.println(counterNM);                                                  // prints out how many unmatched hands
    }
    
    // add main method
    public static void main(String[] arg) {
        
        showHands();                                                                    // calls showHands method
        simulateOdds();                                                                 // calls simulateOdds method
        
    }
}
