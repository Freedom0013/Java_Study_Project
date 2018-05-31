package com.leetcode.easy;

import com.leetcode.utils.Utils;

/**
 * Question：#1	两数之和 
 * 		给定 nums = [2, 7, 11, 15], target = 9 
 * 		因为 nums[0] + nums[1] = 2 + 7 = 9
 * 		所以返回 [0, 1] 
 * Title: sumTwoNum_1
 * @date 2018年5月12日
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
	 * 查找函数
	 * @param nums 被查找数组
	 * @param target 目标和
	 * @return 结果数组
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
