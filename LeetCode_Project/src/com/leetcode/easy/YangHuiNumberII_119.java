package com.leetcode.easy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * #119   杨辉三角 II
 * Question：
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 示例:
 *		输入: 3
 *		输出: [1,3,3,1]
 * Title: YangHuiNumberII
 * @date 2018年6月8日
 * @author Freedom0013
 */
public class YangHuiNumberII_119 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入杨辉三角要显示的行数：");
		try {
			int k = sc.nextInt();
			System.out.println("输入的是：" + k);
			System.out.println("转换后的整数为：" + getRow(k).toString());
		} catch (InputMismatchException e) {
			System.out.println("输入的值过大！");
		}
	}
	
	/**
	 * 杨辉三角II
	 * @param rowIndex 输出行数
	 * @return 行数
	 */
	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> alllist = new ArrayList<List<Integer>>();
		List<Integer> singleline = new ArrayList<Integer>();
		if (rowIndex < 0 || rowIndex >= 34) {
			return singleline;
		}
		rowIndex += 1;
		alllist = generate(rowIndex);
		singleline = alllist.get(rowIndex - 1);
		return singleline;
	}
	
	
	/**
	 * 生成杨辉三角形
	 * @param numRows 行数
	 * @return 杨辉三角集合
	 */
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows <= 0) {
			return list;
		}
		int[][] nums = new int[numRows][numRows];
		for (int i = 0; i < numRows; i++) {
			nums[i][0] = nums[i][i] = 1;
			for (int j = 1; j < i; j++) {
				nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
			}
		}
		for (int[] line : nums) {
			List<Integer> linelist = new ArrayList<Integer>();
			for (int num : line) {
				if (num != 0) {
					linelist.add(num);
				}
			}
			list.add(linelist);
		}
		return list;
	}
}
