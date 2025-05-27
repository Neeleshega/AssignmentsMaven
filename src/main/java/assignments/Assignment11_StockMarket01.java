package assignments;

public class Assignment11_StockMarket01 {

	public static void main(String[] args) {
		
		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int maxProfit = 0;
		int purchaseDay = 0;
		int soldDay = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				int profit = prices[j] - prices[i];

				if (profit > maxProfit) {

					maxProfit = profit;

					purchaseDay = i + 1;
					soldDay = j + 1;
				}
			}
		}

		if (maxProfit > 0) {

			System.out.println("Maximum Profit is " + maxProfit);
			System.out.println("Day of purchase shares on: Day-" + purchaseDay);
			System.out.println("Day of shares Sold on: Day-" + soldDay);
		} else {

			System.out.println("You will lose your money, don't buy this share");
		}

	}

}
