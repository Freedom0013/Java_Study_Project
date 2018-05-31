package com.leetcode.easy;

import com.leetcode.utils.Utils;

/**
 * Question��#1	����֮�� 
 * 		���� nums = [2, 7, 11, 15], target = 9 
 * 		��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 * 		���Է��� [0, 1] 
 * Title: sumTwoNum_1
 * @date 2018��5��12��
 * @author Freedom0013
 */
public class SumTwoNum_1 extends Object{
	public static void main(String[] args) {
		int[] nums = { 2, 58, 33, -4 };
		int target = -2;
		int[] res = twoSum(nums, target);
		Utils.printfArray(res);
	}
	
	/**
	 * ���Һ���
	 * @param nums ����������
	 * @param target Ŀ���
	 * @return �������
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = null;
		if (nums == null || nums.length == 0) {
			return result;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result = new int[] { i, j };
					return result;
				}
			}
		}
		return result;
	}
}