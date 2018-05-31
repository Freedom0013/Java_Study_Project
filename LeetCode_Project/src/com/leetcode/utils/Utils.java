package com.leetcode.utils;

/**
 * ������
 * Title: Utils
 * @date 2018��5��29��
 * @author Freedom0013
 */
public class Utils {
	/**
	 * ��ӡ����(int)
	 * @param nums ����ӡ����
	 */
	public static void printfArray(final int[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("����Ϊ�ջ����鳤��Ϊ0");
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
	 * ��ӡ����(boolean)
	 * @param nums ����ӡ����
	 */
	public static void printfArray(final boolean[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("����Ϊ�ջ����鳤��Ϊ0");
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
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param string �ַ���
	 * @return ���
	 */
	public static boolean isNullOrEmpty(final String string) {
		return string == null || string.trim().length() == 0;
	}
}
