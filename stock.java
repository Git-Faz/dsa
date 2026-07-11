class Solution {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            int profit = prices[i] - buyPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int prices[] = { 1, 2, 5, 3, 7, 4 };
        System.out.println(sol.maxProfit(prices));
    }
}
