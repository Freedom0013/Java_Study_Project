package com.leetcode.easy;

/**
 * #371  ������֮��
 * Question��
 * ��ʹ������� + ��-������������a ��b֮�͡�
 * ʾ����
 * �� a = 1 ��b = 2������ 3��
 * Title: SumofTwoIntegers_371
 * @date 2018��6��19��
 * @author Freedom0013
 */
public class SumofTwoIntegers_371 {
	public static void main(String[] args) {
		System.out.println(getSum(1, 2));
	}
	
	/**
	 * ������֮��(�����������)
	 * @param a ����1
	 * @param b ����2
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
