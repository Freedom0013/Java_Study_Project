package com.leetcode.easy;

/**
 * #371  两整数之和
 * Question：
 * 不使用运算符 + 和-，计算两整数a 、b之和。
 * 示例：
 * 若 a = 1 ，b = 2，返回 3。
 * Title: SumofTwoIntegers_371
 * @date 2018年6月19日
 * @author Freedom0013
 */
public class SumofTwoIntegers_371 {
	public static void main(String[] args) {
		System.out.println(getSum(1, 2));
	}
	
	/**
	 * 两整数之和(不适用运算符)
	 * @param a 参数1
	 * @param b 参数2
	 * @return 
	 */
	public static int getSum(int a, int b) {
		int result = a ^ b;
		int carry = (a & b) << 1;
		if (carry != 0) {
			return getSum(result, carry);
		}
		return result;
	}
}
