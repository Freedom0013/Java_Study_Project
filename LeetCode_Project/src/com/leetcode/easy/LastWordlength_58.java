package com.leetcode.easy;

import java.util.Scanner;

/**
 * #58   ���һ�����ʵĳ���
 * Question��
 * ����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
 * ������������һ�����ʣ��뷵�� 0 ��
 * ˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����
 * ʾ��:
 * ����: "Hello World"
 * ���: 5
 * Title: LastWordlength_58
 * @date 2018��6��2��
 * @author Freedom0013
 */
public class LastWordlength_58 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ���ַ�����");
		String target = sc.nextLine(); 
		System.out.println("������ǣ�" + target);
		System.out.println("������ǣ�" + lengthOfLastWord(target));
	}
	
	/**
	 * �������һ������λ��
	 * @param s Ҫ�����ַ���
	 * @return λ��
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
	 * ���򷽷����������磩
	 * @param s Ҫ�����ַ���
	 * @return λ��
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
