package com.leetcode.utils;

/**
 * 工具类
 * Title: Utils
 * @date 2018年5月29日
 * @author Freedom0013
 */
public class Utils {
	/**
	 * 打印数组(int)
	 * @param nums 被打印数组
	 */
	public static void printfArray(final int[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("数组为空或数组长度为0");
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				System.out.print("[" + nums[i]);
			} else if (i < nums.length - 1) {
				System.out.print("," + nums[i]);
			} else if (i == nums.length - 1) {
				System.out.println("," + nums[i] + "]");
			}
		}
	}
	
	/**
	 * 打印数组(boolean)
	 * @param nums 被打印数组
	 */
	public static void printfArray(final boolean[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("数组为空或数组长度为0");
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				System.out.print("[" + nums[i]);
			} else if (i < nums.length - 1) {
				System.out.print("," + nums[i]);
			} else if (i == nums.length - 1) {
				System.out.println("," + nums[i] + "]");
			}
		}
	}
	
	/**
	 * 判断字符串是否为空
	 * @param string 字符串
	 * @return 结果
	 */
	public static boolean isNullOrEmpty(final String string) {
		return string == null || string.trim().length() == 0;
	}
}
