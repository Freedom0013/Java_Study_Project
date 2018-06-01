package com.leetcode.easy;

import java.util.Scanner;

/**
 * #434 �ַ����еĵ�����
 * Question��
 * ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������Ĳ��ǿո���ַ���
 * ��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
 * ʾ��:
 * 		����: "Hello, my name is John"
 * 		���: 5
 * Title: MaxWords_434
 * @date 2018��5��31��
 * @author Freedom0013
 */
public class MaxWords_434 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫͳ�Ƶ��ַ�����");
		String target = sc.nextLine(); 
		System.out.println("������ǣ�" + target);
		System.out.println("������ǣ�" + countSegments(target));
	}
	
	/**
	 * �Կո�ͳ���ַ�����������
	 * @param s Ŀ���ַ���
	 * @return ��������
	 */
	public static int countSegments(String s) {
		if (s == null || s.isEmpty() || s.trim().length() == 0) {
			return 0;
		}
		String[] temp = s.trim().split("\\s+");
		return temp.length;
    }
}
