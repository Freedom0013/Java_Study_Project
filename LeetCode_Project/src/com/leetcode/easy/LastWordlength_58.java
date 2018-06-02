package com.leetcode.easy;

import java.util.Scanner;

/**
 * #58   最后一个单词的长度
 * Question：
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 * Title: LastWordlength_58
 * @date 2018年6月2日
 * @author Freedom0013
 */
public class LastWordlength_58 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的字符串：");
		String target = sc.nextLine(); 
		System.out.println("输入的是：" + target);
		System.out.println("结果的是：" + lengthOfLastWord(target));
	}
	
	/**
	 * 计算最后一个单词位数
	 * @param s 要计算字符串
	 * @return 位数
	 */
	public static int lengthOfLastWord(String s) {
		if (s == null || s.trim().length() == 0) {
			return 0;
		}
		String[] temp = s.trim().split("\\s+");
		String last = temp[temp.length - 1];
		return last.length();
	}

	/**
	 * 更简方法（来自网络）
	 * @param s 要计算字符串
	 * @return 位数
	 */
	public int lengthOfLastWord1(String s) {
		int result = 0, i = s.length() - 1;
		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}
		while (i >= 0 && s.charAt(i) != ' ') {
			result++;
			i--;
		}
		return result;
	}
}
