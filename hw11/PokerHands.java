/*  Kevin Trinh
    CSE 2
    December 6, 2014
    hw11 - PokerHands
    
    This code is an exercise in multidimensional array.
*/

// imports Scanner utility
import java.util.Scanner;

// add public class
public class PokerHands {

    // adds showOneHand method
    public static void showOneHand(int hand[]) {
        
        String suit[] = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};                                  // creates suit array
        String face[] = {"A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "};    // creates face array
        String out = "";                                                                                    // creates out string
        
        for (int s = 0; s < 4; s++) {                                                                       // for suits 0 < 4
            out += suit[s];                                                                                 // adds suit[s] to out
            
            for (int rank = 0; rank < 13; rank++) {                                                         // for rank 0 < 13
            
                for (int card = 0; card < 5; card++) {                                                      // for card 0 < 5
                
                    if (hand[card] / 13 == s && hand[card] % 13 == rank) {                                  // calculates card type
                        out += face[rank];                                                                  // adds face to out
                    }
                }
            }
            out += '\n';                                                                                    // prints break
        }
        System.out.println();                                                                               // prints break
        System.out.print(out);                                                                              // prints out
    }

    // add main method
    public static void main(String[] args) {
        
        String[][] hand = new String[5][2];                                                                 // creates hand array 5 cards, 2 values
        int[][] handInts = new int[5][2];                                                                   // creates hand array represented as ints
        int[] handIntsSingle = new int[5];                                                                  // creates 1d hand array represented as ints
        String[] cards = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};                // creates cards array

        Scanner userScanner = new Scanner(System.in);                                                       // new Scanner
        String suit = "";                                                                                   // creates suits string
        String userCard = "";                                                                               // creates userCard string

        while (true) {                                                                                      // while true

            for (int i = 0; i < 5; i++) {                                                                   // for i 0 < 5
                
                System.out.println("");                                                                     // 
                System.out.print("Enter the suit (c, d, h, s): ");
                suit = userScanner.next();
                
                if (suit.equals("c") || suit.equals("d") || suit.equals("h") || suit.equals("s")) {
    
                    hand[i][0] = suit;
                    
                    while (true) {
                        System.out.print("Enter card (A, K, Q, ... , 4, 3, 2): ");
                        userCard = userScanner.next();
                        
                        switch (userCard) {
                            
                            case "A": hand[i][1] = userCard; break;
                            case "K": hand[i][1] = userCard; break;
                            case "Q": hand[i][1] = userCard; break;
                            case "J": hand[i][1] = userCard; break;
                            case "10":hand[i][1] = userCard; break;
                            case "9": hand[i][1] = userCard; break;
                            case "8": hand[i][1] = userCard; break;
                            case "7": hand[i][1] = userCard; break;
                            case "6": hand[i][1] = userCard; break;
                            case "5": hand[i][1] = userCard; break;
                            case "4": hand[i][1] = userCard; break;
                            case "3": hand[i][1] = userCard; break;
                            case "2": hand[i][1] = userCard; break;
                            default: System.out.println("You did not enter a valid card. Try again."); continue;
                        }
                        break;
                    }
                    
                }
                else {
                    System.out.println("You did not enter a valid input. Try again: ");
                    continue;
                }
            }
            break;
        }
        
        for (int i = 0; i < 5; i++) {
            
            if (hand[i][0].equals("c")) { handInts[i][0] = 0; }
            if (hand[i][0].equals("d")) { handInts[i][0] = 1; }
            if (hand[i][0].equals("h")) { handInts[i][0] = 2; }
            if (hand[i][0].equals("s")) { handInts[i][0] = 3; }
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            if (handInts[i][0] == 0) {
                    
                if (hand[i][1].equals("2")) { handIntsSingle[i] = 12; }
                if (hand[i][1].equals("3")) { handIntsSingle[i] = 11; }
                if (hand[i][1].equals("4")) { handIntsSingle[i] = 10; }
                if (hand[i][1].equals("5")) { handIntsSingle[i] = 9; }
                if (hand[i][1].equals("6")) { handIntsSingle[i] = 8; }
                if (hand[i][1].equals("7")) { handIntsSingle[i] = 7; }
                if (hand[i][1].equals("8")) { handIntsSingle[i] = 6; }
                if (hand[i][1].equals("9")) { handIntsSingle[i] = 5; }
                if (hand[i][1].equals("10")){ handIntsSingle[i] = 4; }
                if (hand[i][1].equals("J")) { handIntsSingle[i] = 3; }
                if (hand[i][1].equals("Q")) { handIntsSingle[i] = 2; }
                if (hand[i][1].equals("K")) { handIntsSingle[i] = 1;}
                if (hand[i][1].equals("A")) { handIntsSingle[i] = 0;}
                
            }
            
            if (handInts[i][0] == 1) {
                    
                if (hand[i][1].equals("2")) { handIntsSingle[i] = 25; }
                if (hand[i][1].equals("3")) { handIntsSingle[i] = 24; }
                if (hand[i][1].equals("4")) { handIntsSingle[i] = 23; }
                if (hand[i][1].equals("5")) { handIntsSingle[i] = 22; }
                if (hand[i][1].equals("6")) { handIntsSingle[i] = 21; }
                if (hand[i][1].equals("7")) { handIntsSingle[i] = 20; }
                if (hand[i][1].equals("8")) { handIntsSingle[i] = 19; }
                if (hand[i][1].equals("9")) { handIntsSingle[i] = 18; }
                if (hand[i][1].equals("10")){ handIntsSingle[i] = 17; }
                if (hand[i][1].equals("J")) { handIntsSingle[i] = 17; }
                if (hand[i][1].equals("Q")) { handIntsSingle[i] = 16; }
                if (hand[i][1].equals("K")) { handIntsSingle[i] = 15; }
                if (hand[i][1].equals("A")) { handIntsSingle[i] = 14; }
                
            }
            
            if (handInts[i][0] == 2) {
                    
                if (hand[i][1].equals("2")) { handIntsSingle[i] = 38; }
                if (hand[i][1].equals("3")) { handIntsSingle[i] = 37; }
                if (hand[i][1].equals("4")) { handIntsSingle[i] = 36; }
                if (hand[i][1].equals("5")) { handIntsSingle[i] = 35; }
                if (hand[i][1].equals("6")) { handIntsSingle[i] = 34; }
                if (hand[i][1].equals("7")) { handIntsSingle[i] = 33; }
                if (hand[i][1].equals("8")) { handIntsSingle[i] = 32; }
                if (hand[i][1].equals("9")) { handIntsSingle[i] = 31; }
                if (hand[i][1].equals("10")){ handIntsSingle[i] = 30; }
                if (hand[i][1].equals("J")) { handIntsSingle[i] = 29; }
                if (hand[i][1].equals("Q")) { handIntsSingle[i] = 28; }
                if (hand[i][1].equals("K")) { handIntsSingle[i] = 27; }
                if (hand[i][1].equals("A")) { handIntsSingle[i] = 26; }
                
            }
            
            if (handInts[i][0] == 3) {
                    
                if (hand[i][1].equals("2")) { handIntsSingle[i] = 51; }
                if (hand[i][1].equals("3")) { handIntsSingle[i] = 50; }
                if (hand[i][1].equals("4")) { handIntsSingle[i] = 49; }
                if (hand[i][1].equals("5")) { handIntsSingle[i] = 48; }
                if (hand[i][1].equals("6")) { handIntsSingle[i] = 47; }
                if (hand[i][1].equals("7")) { handIntsSingle[i] = 46; }
                if (hand[i][1].equals("8")) { handIntsSingle[i] = 45; }
                if (hand[i][1].equals("9")) { handIntsSingle[i] = 44; }
                if (hand[i][1].equals("10")){ handIntsSingle[i] = 43; }
                if (hand[i][1].equals("J")) { handIntsSingle[i] = 42; }
                if (hand[i][1].equals("Q")) { handIntsSingle[i] = 41; }
                if (hand[i][1].equals("K")) { handIntsSingle[i] = 40; }
                if (hand[i][1].equals("A")) { handIntsSingle[i] = 39; }
                
            }
        }
        
        showOneHand(handIntsSingle);
        
        
        //////////////////////////////////////////////////////////////////////////FLUSH
        int suitCounter = 0;
        
        for (int i = 0; i < 5; i++) {
            
            if (handInts[i][0] == 0) { suitCounter++; }
            
        }
        if (suitCounter == 5) { System.out.println("This is a flush."); }
        suitCounter = 0;
        
        for (int i = 0; i < 5; i++) {
            
            if (handInts[i][0] == 1) { suitCounter++; }
            
        }
        if (suitCounter == 5) { System.out.println("This is a flush."); }
        suitCounter = 0;
        
        for (int i = 0; i < 5; i++) {
            
            if (handInts[i][0] == 2) { suitCounter++; }
            
        }
        if (suitCounter == 5) { System.out.println("This is a flush."); }
        suitCounter = 0;
        
        for (int i = 0; i < 5; i++) {
            
            if (handInts[i][0] == 3) { suitCounter++; }
            
        }
        if (suitCounter == 5) { System.out.println("This is a flush."); }
        //////////////////////////////////////////////////////////////////////////
        
        
        
        
        
        
        
        
        
        
        
        
    }
}