package com.leetcode.easy;

import java.util.Scanner;

/**
 * #434 字符串中的单词数
 * Question：
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * 示例:
 * 		输入: "Hello, my name is John"
 * 		输出: 5
 * Title: MaxWords_434
 * @date 2018年5月31日
 * @author Freedom0013
 */
public class MaxWords_434 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要统计的字符串：");
		String target = sc.nextLine(); 
		System.out.println("输入的是：" + target);
		System.out.println("结果的是：" + countSegments(target));
	}
	
	/**
	 * 以空格统计字符串单词数量
	 * @param s 目标字符串
	 * @return 单词数量
	 */
	public static int countSegments(String s) {
		if (s == null || s.isEmpty() || s.trim().length() == 0) {
			return 0;
		}
		String[] temp = s.trim().split("\\s+");
		return temp.length;
    }
}
