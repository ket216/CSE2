/*  Kevin Trinh
    CSE 2
    December 5, 2014
    hw11 - MatrixSorter

    This code is an exercise in sorting.
*/

// add public class
public class MatrixSorter {
    
    // add sort method
    public static void sort(int[][] mat3d) {
        
        // not enough time to code this :(
        
    }
    
    // add findMin method
    public static int findMin (int[][][] mat3d) {
        
        int min = mat3d[0][0][0];                                               // set min as first index
        
        for (int i = 0; i < 3; i++) {                                           // for ith slab
            
            for (int j = 0; j < 2*i + 3; j++) {                                 // for jth row
                
                for (int k = 0; k < i + j + 1; k++) {                           // for kth column
                    
                    if (mat3d[i][j][k] < min) {                                 // if i,j,kth value is less than min
                        
                        min = mat3d[i][j][k];                                   // min is updated
                        
                    }
                    
                }
            }
        }
        return min;                                                             // return min value
        
    }
    
    // add show method
    public static void show(int[][][] mat3d) {
        
        for (int i = 0; i < 3; i++) {                                           // for ith slab
            
            for (int j = 0; j < 2*i + 3; j++) {                                 // for jth row
                
                for (int k = 0; k < i + j + 1; k++) {                           // for kth column
                    
                    System.out.print(mat3d[i][j][k] + ", ");                    // prints value
                    
                }
                System.out.println();                                           // prints break
            }
            System.out.println("---------------------------------------- Slab " + (i + 1)); // prints slab number
        }
        

    }
    
    // add buildMat3d method
    public static int[][][] buildMat3d() {
        
        int[][][] mat3d= new int[3][][];                                        // create 3D array
        
        for (int s = 0; s < 3; s++) {                                           // for slab 0 < 3
                    
            mat3d[s] = new int[2*s + 3][s + (2*s + 3) + 1];                     // slab has this many rows and columns
                    
        }
        
        for (int i = 0; i < 3; i++) {                                           // for ith slab
            
            for (int j = 0; j < 2*i + 3; j++) {                                 // for jth row
                
                for (int k = 0; k < i + j + 1; k++) {                           // for kth column
                    
                    mat3d[i][j][k] = (int)(Math.random()*99 + 1);               // assigns random number 1-99
                    
                }
                
            }
            
        }
        
        return mat3d;                                                           // returns mat3d array
    }
    
    // add main method
    public static void main(String arg[]) {
        
        int mat3d[][][];                                                        // initialize array
        mat3d = buildMat3d();                                                   // mat3d arry is buildMat3d method
        show(mat3d);                                                            // shows mat3d array
        System.out.println("The smallest entry in the 3D matrix is " + findMin(mat3d)); // prints min
        System.out.println("After sorting the 3rd matrix we get");                      // prints after sorting
        sort(mat3d[2]);                                                                 // sorts mat3d[2]
        show(mat3d);                                                                    // shows sorted mat3d array
    }
}
