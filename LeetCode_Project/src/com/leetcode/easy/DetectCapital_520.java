package com.leetcode.easy;

import java.util.Scanner;

/**
 * #520  Detect Capital
 * Question：
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 * 示例 1:
 * 		输入: "USA"
 * 		输出: True
 * 示例 2:
 * 		输入: "FlaG"
 * 		输出: False
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 * Title: DetectCapital_520
 * @date 2018年6月16日
 * @author Freedom0013
 */
public class DetectCapital_520 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要检查的单词：");
		String target = sc.nextLine(); 
		System.out.println("输入的是：" + target);
		boolean res = detectCapitalUse(target);
		System.out.println("结果的是：" + (res == true?"True":"False"));
	}
	
	/**
	 * 判断字母大小写正确
	 * @param word 被判断字符串
	 * @return 是否为合法单词
	 */
	public static boolean detectCapitalUse(String word) {
		if (word == null || word.trim().length() == 0 || word.equalsIgnoreCase("null")) {
			return false;
		}
		// 大写字母计数
		int count = 0;
		System.out.println(word.charAt(0));
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				count++;
			}
		}
		// 全为大写
		if (count == word.length()) {
			return true;
		}
		// 首字母大写
		if (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
			return true;
		}
		// 全为小写
		if (count == 0) {
			return true;
		}
		return false;
    }
}
