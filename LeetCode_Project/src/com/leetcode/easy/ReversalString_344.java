package com.leetcode.easy;

import java.util.Scanner;

/**
 * #344   反转字符串
 * Question：
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 * 示例：
 * 		输入：s = "hello"
 * 		返回："olleh"
 * Title: ReversalString_344
 * @date 2018年6月13日
 * @author Freedom0013
 */
public class ReversalString_344 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要反转的字符串：");
		String target = sc.nextLine();
		System.out.println("输入的是：" + target);
		System.out.println("反转后为：" + reverseString(target));
	}
	
	/**
	 * 翻转字符串
	 * @param s 被反转的字符串
	 * @return 结果
	 */
	public static String reverseString(String s) {
		char[] array = s.toCharArray();
		//头指针
		int i = 0;
		//尾指针
		int j = s.length() - 1;
		char temp;
		while (i < j) {
			//交换
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return new String(array);
	}
	
	/**
	 * 方式2
	 */
	public static String reverseString2(String s) {
		if(s == null || s.trim().length() == 0){
			return s;
		}
		char[] chs = s.toCharArray();
		int middle = chs.length/2;
		char temp;
		for (int i = 0; i < middle; i++) {
			temp = chs[i];
			chs[i] = chs[chs.length-i-1];
			chs[chs.length-i-1] = temp;
		}
		return new String(chs);
	}
}
