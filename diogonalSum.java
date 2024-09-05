public class diogonalSum {

        public static void printDiagonalSum (int matrix[][]) {
                int sum = 0;
                for (int i=0; i<matrix.length; i++) {
                        sum += matrix[i][i];

                        if (i != matrix.length-i-1) {
                                sum += matrix[i][matrix.length-i-1];
                        }
                }

                System.out.println(sum);
        }


        public static void main(String[] args) {
                int matrix[][] = {
                        {1,2,3,4,8},
                        {5,6,7,8,4},
                        {9,10,11,12,8},
                        {13,14,15,16,3},
                        {5,8,4,6,7}
                };
                printDiagonalSum(matrix);
        }
}