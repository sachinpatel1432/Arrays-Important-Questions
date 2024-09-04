import java.util.Scanner;

public class buyAndSellStocks {

        public static int buyAndSellStocks(int prices[]) {
                int n = prices.length;
                int buyPrice = Integer.MAX_VALUE;
                int maxProfit = 0;

                for (int i=0; i<n; i++) {
                        if (buyPrice < prices[i]) {
                                int profit =  prices[i] - buyPrice ;
                                maxProfit = Math.max(maxProfit, profit);
                        } else {
                                buyPrice = prices[i];
                        }

                }
                return maxProfit;
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

                for (int i=0; i<n; i++) {
                        System.out.print(prices[i] + " , ");
                }

                System.out.println();
                
                int maxProfit = buyAndSellStocks(prices);
                System.out.println("Your Maximum profit is : " + maxProfit);
        }
}
