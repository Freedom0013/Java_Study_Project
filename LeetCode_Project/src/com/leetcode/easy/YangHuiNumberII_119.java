package com.leetcode.easy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * #119   ������� II
 * Question��
 * ����һ���Ǹ����� k������ k �� 33������������ǵĵ� k �С�
 * ʾ��:
 *		����: 3
 *		���: [1,3,3,1]
 * Title: YangHuiNumberII
 * @date 2018��6��8��
 * @author Freedom0013
 */
public class YangHuiNumberII_119 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������Ҫ��ʾ��������");
		try {
			int k = sc.nextInt();
			System.out.println("������ǣ�" + k);
			System.out.println("ת���������Ϊ��" + getRow(k).toString());
		} catch (InputMismatchException e) {
			System.out.println("�����ֵ����");
		}
	}
	
	/**
	 * �������II
	 * @param rowIndex �������
	 * @return ����
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
	 * �������������
	 * @param numRows ����
	 * @return ������Ǽ���
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
