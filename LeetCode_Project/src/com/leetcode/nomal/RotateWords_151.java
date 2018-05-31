package com.leetcode.nomal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 翻转字符串里的单词
 *  Question： 
 *  给定一个字符串，逐个翻转字符串中的每个单词。 
 *  输入: "the sky is blue", 
 *  输出:"blue is sky the". 
 *  说明: 	1.无空格字符构成一个单词。 
 *  		2.输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 			3.如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 Title: RotateWords_151
 * @date 2018年5月30日
 * @author Freedom0013
 */
public class RotateWords_151 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要反转的字符串：");
		String target = sc.nextLine(); // 读取字符串型输入
		System.out.println("输入的是：" + target);
		System.out.println("结果的是：" + reverseWords(target));
	}

	/**
	 * 翻转字符串
	 * @param s 需要翻转的字符串
	 * @return 翻转后结果
	 */
	public static String reverseWords(String s) {
		String res = "";
		if (s == null || s.isEmpty()) {
			return s;
		}
		// String的split方法支持正则表达式；
		// 正则表达式\s表示匹配任何空白字符，+表示匹配一次或多次。
		String[] temp = s.trim().split("\\s+");
		int middle = temp.length / 2;
		for (int i = 0; i < middle; i++) {
			String te = temp[i];
			temp[i] = temp[temp.length - i - 1];
			temp[temp.length - i - 1] = te;
		}
		/*
		 * 这里尽量不要使用StringBuffer输出字符串数组 leetcode可能不会清空上一次的执行残留
		 * 即使每一次都new一个StringBuffer或者StringBuffer.setLength(0);依旧有问题
		 */
		for (int i = 0; i < temp.length; i++) {
			if (i < temp.length - 1) {
				res += temp[i] + " ";
			} else {
				res += temp[i];
			}
		}
		return res;
	}
	
	/**
	 * 最简方法（来自网络）
	 */
	public static String reverseWords1(String s) {
		String[] words = s.trim().split(" +");
		Collections.reverse(Arrays.asList(words));	//字符串数组转list，翻转list
		return String.join(" ", words);				//输出
	}
}
