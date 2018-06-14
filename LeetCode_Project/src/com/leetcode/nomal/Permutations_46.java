package com.leetcode.nomal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #46  全排列
 * Question：
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 * 		[1,2,3],
 * 		[1,3,2],
 * 		[2,1,3],
 * 		[2,3,1],
 * 		[3,1,2],
 * 		[3,2,1]
 * ]
 * Title: Permutations_46
 * @date 2018年6月14日
 * @author Freedom0013
 */
public class Permutations_46 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums).toString());
	}
	
	/**
	 * 全排列
	 * @param nums 要排列的数组
	 * @return 排列完毕
	 */
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> reslist = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0){
			return reslist;
		}
		Arrays.sort(nums);
		findLine(reslist, nums, 0);
		return reslist;
	}
	
	/**
     * 123、132在第一个数为1时交换后两个数
     * 213、231把第二个数提到第一位，之后交换数组中后面两位数
     * 以此类推：每一次吧数组中的元素提至数组头不变，其他数组元素进行互换，之后在反复进行操作即可得出全排列
     */
	/**
	 * 递归朝查找行
	 * @param res 全排列结果集合
	 * @param nums 被排列数组
	 * @param flag 递归限制
	 */
	private static void findLine(List<List<Integer>> res, int[] nums, int flag) {  
		//限制递归次数，并生成行
        if (flag == nums.length) {  
            List<Integer> line = new ArrayList<Integer>();  
            for (int num : nums) {
            	line.add(num);  
            }
            res.add(line);  
        }  
        for (int i = flag; i < nums.length; i++) {
            swap(nums, i, flag);  
            findLine(res, nums, flag+1);  
            swap(nums, i, flag);
        }  
    }  
	
	/**
	 * 交换数组nums下标为m、n元素
	 * @param nums 被交换数所在数组
	 * @param m 下标
	 * @param n 下标
	 */
    private static void swap(int[] nums, int m, int n) {  
        int temp = nums[m];  
        nums[m] = nums[n];  
        nums[n] = temp;  
    } 
}
