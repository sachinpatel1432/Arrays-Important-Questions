import java.util.*;
public class creationTwoDArray {
        public static boolean search(int matrix[][] , int key){
                int n = matrix.length; 
                int m = matrix[0].length;
                for (int i=0; i<n; i++){
                        for (int j=0; j<m; j++){
                                if(matrix[i] [j] == key){
                                        System.err.println("("+ i + "," + j + ")");
                                        return true;
                                }      
                        }
                }
                System.err.println("Key is not found!");
                return false;
        }
        public static void main(String[] args) {
                int matrix[][] = { {1,2,3,4} , {4,5,6,7} , {7,8,9,11} , {10,11,12,13}};
                
                int n = matrix.length; 
                int m = matrix[0].length;
                int key = 5;

                // Input 
                // Scanner sc = new Scanner(System.in);
                // for (int i=0; i<n; i++){
                //         for (int j=0; j<m; j++){
                //                 matrix[i][j] = sc.nextInt();
                //         }
                // }

                // Outpur
                search(matrix, key);
                twodarray(matrix);
        }       
        public static void twodarray(int matrix[][]){
                int n = matrix.length; 
                int m = matrix[0].length;
                for (int i=0; i<n; i++){
                        for (int j=0; j<m; j++){
                                System.err.print(matrix[i][j] + " ");
                        }
                        System.err.println();
                }
        }
}