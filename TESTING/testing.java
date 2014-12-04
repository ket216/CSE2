import java.util.Scanner;

public class testing {

    public static void main(String args[]) {
        
        int[] array = new int[10];
        Scanner userInput = new Scanner(System.in);
        String arrayString = "{ ";
        
        System.out.println("Enter 10 ints: ");
        
        for (int i = 0; i < 10; i++) {
            
            array[i] = userInput.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            arrayString += array[i];
            arrayString += " ";
            
        }
        arrayString += "}";
        System.out.println("");
        System.out.println(arrayString);
        
        
        int max = array[0];
        int min = array[0];
        
        for (int i = 0; i < 9; i++) {
            
            if (min > array[i+1]) {
                
                min = array[i+1];
                
            }
            
            if (max < array [i+1]) {
                
                max = array[i+1];
                
            }
            
        }
        System.out.println("");
        System.out.println("The max value in the array is: " + max);
        System.out.println("The min value in the array is: " + min);
        
        System.out.println("");
        System.out.print("Enter an int [1,10]: ");
        int userAnswer = userInput.nextInt()-1;
        
        System.out.println("The int at position " + userAnswer + " is: " + array[userAnswer]);
        
        System.out.println("");
        System.out.println("Enter 2 ints [1,10]: ");
        int first = userInput.nextInt()-1;
        int second = userInput.nextInt()-1;
        
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
        
        arrayString = "{ ";
        for (int i = 0; i < 10; i++) {
            
            arrayString += array[i];
            arrayString += " ";
            
        }
        arrayString += "}";
        System.out.println("The new array is: " + arrayString);
        
        
    }
}