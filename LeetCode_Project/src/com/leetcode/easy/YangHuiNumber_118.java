package com.leetcode.easy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * #118		杨辉三角
 * Question：
 * 示例:
 * 输入: 5
 * 输出:[
 * [1],								00
 * [1,1],						10		11
 * [1,2,1],					20		21		22
 * [1,3,3,1],			30		31		32		33
 * [1,4,6,4,1]		40		41		42		43		44
 * ]
 * Title: YangHuiNumber
 * @date 2018年6月7日
 * @author Freedom0013
 */
public class YangHuiNumber_118 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入杨辉三角的行数：");
		try {
			int numRows = sc.nextInt();
			System.out.println("输入的是：" + numRows);
			System.out.println("转换后的整数为：" + generate(numRows).toString());
		} catch (InputMismatchException e) {
			System.out.println("输入的值过大！");
		}
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
			nums[i][0] = nums[i][i] = 1; 							// 第一列和最后一列均为1
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
