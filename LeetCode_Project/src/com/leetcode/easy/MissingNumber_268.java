package com.leetcode.easy;

/**
 * #268  缺失数字
 * Question：
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 示例 1:
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 * Title: MissingNumber_268
 * @date 2018年6月24日
 * @author Freedom0013
 */
public class MissingNumber_268 {
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
	
	/**
	 * 找出缺失数字
	 * @param nums 被查找数组
	 * @return 缺失数字
	 */
	public static int missingNumber(int[] nums) {
		int res = 0;
		for (int i = 1; i <= nums.length; i++) {
			res += (i - nums[i - 1]);
		}
		return res;
	}
	
	/**
	 * 找出缺失数字2（异或运算）
	 * @param nums 被查找数组
	 * @return 缺失数字
	 */
	public int missingNumber2(int[] nums) { 
	    int res = nums.length;
	    for(int i=0; i<nums.length; i++){
	        res ^= i;
	        res ^= nums[i];
	    }
	    return res;
	}
}
