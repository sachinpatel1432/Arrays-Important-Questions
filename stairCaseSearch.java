public class stairCaseSearch {

        public static boolean stairCaseSearch(int matrix[][], int key) {
                int Row = matrix[0].length-1; 
                int Col = 0;

                while(Row >= 0 && Col < matrix.length) {

                        if (matrix[Row][Col] == key) {
                                System.out.println("Key is Found at index : " + "(" + Row + "," + Col + ")");
                                return true;
                        } else if (key < matrix[Row][Col]) {
                                Row--;
                        } else {
                                Col++;
                        }
                }

                System.out.println("Key is not foud !");
                return false;
        }

        public static void main (String[] args) {
                int matrix[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                };

                int key = 7;
                stairCaseSearch(matrix , key);
        }
}