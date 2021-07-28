package easy;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuySellStock {
	//Brute Force Method
	public static int maxProfit1(int[] prices) {
		int profit = 0;
		for(int i = 0 ; i < prices.length;i++) {
			for(int j = i+1 ; j < prices.length;j++) {
				if(prices[j] > prices[i] && (prices[j] - prices[i] > profit)) {
					profit = prices[j] - prices[i];
				}
			}
		}
		return profit;
	}
	
	public static int maxProfit2(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
	
	
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int profit = maxProfit1(prices);
		System.out.println(profit);
		
	}
}
