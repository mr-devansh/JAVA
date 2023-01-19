package Greedy;

public class BestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,6,4};

        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buy>prices[i]) {
                buy = prices[i];
            }
            else if (prices[i]-buy>profit) {
                profit = prices[i]-buy;
            }
        }
        System.out.println(profit);
    }
}
