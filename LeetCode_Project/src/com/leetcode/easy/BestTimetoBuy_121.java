package com.leetcode.easy;

/**
 * #121  买卖股票的最佳时机
 * Question：
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 * 示例 1:
 * 		输入: [7,1,5,3,6,4]
 * 		输出: 5
 * 		解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 		注意:利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 * 		输入: [7,6,4,3,1]
 * 		输出: 0
 * 		解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * Title: BestTimetoBuy_121
 * @date 2018年6月21日
 * @author Freedom0013
 */
public class BestTimetoBuy_121 {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	
	/**
	 * 最大利润
	 * @param prices 价格数组
	 * @return 利润
	 */
	public static int maxProfit(int[] prices) {
		//判空
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int result = 0;
		int templow;
		int temp;
		templow = prices[0];
		for (int i = 1; i < prices.length; i++) {
			temp = prices[i];
			if (templow > temp) {
				//找出最低价格
				templow = temp;
			} else {		
				//判断是否为最大利润
				temp = temp - templow;		
				result = result > temp ? result : temp;
			}
		}
		return result;
	}
}
