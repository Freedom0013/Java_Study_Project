package com.leetcode.easy;

import java.util.Scanner;

/**
 * #344   ��ת�ַ���
 * Question��
 * ���дһ���������书���ǽ�������ַ�����ת������
 * ʾ����
 * 		���룺s = "hello"
 * 		���أ�"olleh"
 * Title: ReversalString_344
 * @date 2018��6��13��
 * @author Freedom0013
 */
public class ReversalString_344 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ת���ַ�����");
		String target = sc.nextLine();
		System.out.println("������ǣ�" + target);
		System.out.println("��ת��Ϊ��" + reverseString(target));
	}
	
	/**
	 * ��ת�ַ���
	 * @param s ����ת���ַ���
	 * @return ���
	 */
	public static String reverseString(String s) {
		char[] array = s.toCharArray();
		//ͷָ��
		int i = 0;
		//βָ��
		int j = s.length() - 1;
		char temp;
		while (i < j) {
			//����
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return new String(array);
	}
	
	/**
	 * ��ʽ2
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
