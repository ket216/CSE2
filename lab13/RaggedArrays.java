/*  Kevin Trinh
    CSE 2
    lab13 - RaggedArrays
    Novemer 23, 2014
    
    This code is an exercise in sorting.
*/

// import Arrays utility
import java.util.Scanner;
import java.util.Arrays;

// add public class
public class RaggedArrays {
   
    public static void main(String[] args) {
        
        System.out.println("The array before sorting: ");
        int[][] ragged = new int[5][];
        
        for (int i = 0; i < 5; i++) {
            
            ragged[i] = new int[i*3 + 5];
            
        }
        
        for (int i = 0; i < ragged.length; i++) {
            
            for (int j = 0; j < ragged[i].length; j++) {

                ragged[i][j] = (int)(Math.random()*40);
                System.out.print(ragged[i][j] + ", ");
                    
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("The array after sorting: ");
        
        for (int i = 0; i < ragged.length; i++) {
            
            Arrays.sort(ragged[i]);
            
        }
        
        for (int i = 0; i < ragged.length; i++) {
            
            for (int j = 0; j < ragged[i].length; j++) {

                System.out.print(ragged[i][j] + ", ");
                    
            }
            System.out.println();
        }
        
    }
    
}