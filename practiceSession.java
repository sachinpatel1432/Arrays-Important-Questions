import java.util.*;
// public class practiceSession {

//         public static void printsecoundRowSum (int matrix[][]) {
//                 int sum = 0;
                
//                 for (int j=0; j<matrix.length; j++) {
//                         sum += matrix[1][j];
//                 }
//                 System.out.println(sum);
//         }

//         public static void main(String[] args) {
//                 int matrix[][] = {
//                         {1,4,9},
//                         {11,4,3},
//                         {2,2,3}
//                 };
//                 printsecoundRowSum(matrix);
//         }
// }


// Is pelindrom 

// public class practiceSession {

//         public static int reversNumber(int num) {
//                 int reversNumber = 0;

//                 while (num > 0) {
//                         int lastDigit = num % 10;
//                         reversNumber = reversNumber * 10 + lastDigit;
//                         num /= 10;
//                 }
//                 return reversNumber;
//         }

//         public static boolean ispelindrom (int num ) {
//                 int revers =reversNumber(num);
                
//                 if (revers == num) {
//                         return true;
//                 }
//                 else {
//                         return false;
//                 }
//         }

//         public static void main(String[] args) {
//                 int num = 121;
//                 boolean ans = ispelindrom(num);
//                 System.out.println(ans);

//         }
// }

// public class practiceSession {

//         /**
//          * @param num
//          * This is my program
//          */
//         public static void printMax(int num[] ) {
//                 int left = 0; 
//                 int right = num.length-1;
//                 int max = 0;

//                 while (left < right) {
//                         int area = 0;
//                         int length = Math.min(num[left] , num[right]);
//                         int breath = Math.abs(left - right);
//                         area = length * breath;
//                         max = Math.max(area , max);
                        
//                         if (num[left] < num[right]) {
//                                 left++;
//                         }
//                         else {
//                                 right--;
//                         }
//                 }

//                 System.out.println(max);
//         }
//         public static void main(String[] args) {
//                 int height[] = {1,8,6,2,5,4,8,3,7};
//                 printMax(height);
//         }
// }

// public class practiceSession {

//         public static void containerMostWater (int num[]) {
//                 int area = 0;
//                 int maxArea = 0;

//                 for (int i=0; i<num.length; i++) {
//                         for (int j=i+1; j<num.length; j++) {
//                                 int length = Math.min(num[i] , num[j]);
//                                 int breath = Math.abs(i - j);
//                                 area = length * breath;

//                                 maxArea = Math.max(area , maxArea);
//                         }
//                 }

//                 System.out.println(maxArea);
//         }

//         public static void main(String[] args) {
//                 int height[] = {1,8,6,2,5,4,8,3,7};                 
//                 containerMostWater(height);
//         }
// }