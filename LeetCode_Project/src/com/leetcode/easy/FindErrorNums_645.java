package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.leetcode.utils.Utils;

/**
 * Question：#645	错误的集合 
 * 		集合 S 包含从1到 n的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值， 
 * 		导致集合丢失了一个整数并且有一个元素重复。给定一个数组nums 代表了集合 S 发生错误后的结果。
 * 		你的任务是首先寻找到重复出现的整数，再找到丢失的整数， 将它们以数组的形式返回。 
 * 		给定数组的长度范围是 [2,10000]。 
 * 		给定的数组是无序的。 
 * Title: findErrorNums_645
 * @date 2018年5月12日
 * @author Freedom0013
 */
public class FindErrorNums_645 {
	public static void main(String[] args) {
		int[] nums = {1,1,3,4,6,5};
		Arrays.sort(nums);
		Utils.printfArray(nums);
		Utils.printfArray(findErrorNums(nums));
	}
	
	
	/**
	 * 找出数组错误
	 * @param nums 被检查数组
	 * @return 重复的值
	 */
	public static int[] findErrorNums(int[] nums) {
		int[] result = new int[2];
		boolean[] flags = new boolean[nums.length + 1];
		//找到重复的数字
		for (int i = 0; i < nums.length; i++){
			if (flags[nums[i]] == false) {
				flags[nums[i]] = true;
			} else {
				result[0] = nums[i];
			}
		}
		//下标错位找到另一个需要被修改的数字
		for (int i = 1; i < (nums.length + 1); i++) {
			if (flags[i] == false) {
				result[1] = i;
				break;
			}
		}
		return result;
	}
	
	/**
	 * 最简方法（来自网络）
	 * @param nums 被检查数组
	 * @return 重复的值
	 */
	public static int[] findErrorNumsfromNet(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int duplicate = 0;
		int n = nums.length;
		long sum = (n * (n + 1)) / 2;
		for (int i : nums) {
			if (set.contains(i))
				duplicate = i;
			sum = sum - i;
			set.add(i);
		}
		return new int[] { duplicate, (int) sum + duplicate };
	}
}
