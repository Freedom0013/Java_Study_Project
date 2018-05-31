package com.leetcode.nomal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * ��ת�ַ�����ĵ���
 *  Question�� 
 *  ����һ���ַ����������ת�ַ����е�ÿ�����ʡ� 
 *  ����: "the sky is blue", 
 *  ���:"blue is sky the". 
 *  ˵��: 	1.�޿ո��ַ�����һ�����ʡ� 
 *  		2.�����ַ���������ǰ����ߺ����������Ŀո񣬵��Ƿ�ת����ַ����ܰ�����
 * 			3.����������ʼ��ж���Ŀո񣬽���ת�󵥴ʼ�Ŀո���ٵ�ֻ��һ���� Title: RotateWords_151
 * @date 2018��5��30��
 * @author Freedom0013
 */
public class RotateWords_151 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ת���ַ�����");
		String target = sc.nextLine(); // ��ȡ�ַ���������
		System.out.println("������ǣ�" + target);
		System.out.println("������ǣ�" + reverseWords(target));
	}

	/**
	 * ��ת�ַ���
	 * @param s ��Ҫ��ת���ַ���
	 * @return ��ת����
	 */
	public static String reverseWords(String s) {
		String res = "";
		if (s == null || s.isEmpty()) {
			return s;
		}
		// String��split����֧��������ʽ��
		// ������ʽ\s��ʾƥ���κοհ��ַ���+��ʾƥ��һ�λ��Ρ�
		String[] temp = s.trim().split("\\s+");
		int middle = temp.length / 2;
		for (int i = 0; i < middle; i++) {
			String te = temp[i];
			temp[i] = temp[temp.length - i - 1];
			temp[temp.length - i - 1] = te;
		}
		/*
		 * ���ﾡ����Ҫʹ��StringBuffer����ַ������� leetcode���ܲ��������һ�ε�ִ�в���
		 * ��ʹÿһ�ζ�newһ��StringBuffer����StringBuffer.setLength(0);����������
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
	 * ��򷽷����������磩
	 */
	public static String reverseWords1(String s) {
		String[] words = s.trim().split(" +");
		Collections.reverse(Arrays.asList(words));	//�ַ�������תlist����תlist
		return String.join(" ", words);				//���
	}
}
