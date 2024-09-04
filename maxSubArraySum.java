import java.util.Scanner;

public class maxSubArraySum {

        public static void maxSubArraySum(int numbers[]) {
                int curr = 0;
                int maxSum = Integer.MIN_VALUE;
                int prifix[] = new int[numbers.length];

                prifix[0] = numbers[0];
                for (int i=1; i<numbers.length; i++) {
                        prifix[i] = prifix[i-1] + numbers[i];
                }

                for (int i=0; i<numbers.length; i++){
                        for (int j=i; j<numbers.length; j++) {
                                curr = i == 0 ? prifix[j] : prifix[j] - prifix[i-1];
                                if (maxSum < curr) {
                                        maxSum = curr;
                                }
                        }
                }
                System.out.println(maxSum);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Please, enter your array size : ");
                int n = sc.nextInt();

                int prices[] = new int [n];

                System.out.print("Please, enter your prices : ");
                for (int i=0; i<n; i++) {
                        prices[i] = sc.nextInt();
                }
                maxSubArraySum(prices);

        }
}
