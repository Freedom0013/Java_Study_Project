package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #9  ������
 * Question��
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 * ʾ�� 1:
 * 		����: 121
 * 		���: true
 * ʾ�� 2:
 * 		����: -121
 * 		���: false
 * 		����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
 * ʾ�� 3:
 * 		����: 10
 * 		���: false
 * 		����: ���������, Ϊ 01 �����������һ����������
 * Title: PalindromeNumber_9
 * @date 2018��6��11��
 * @author Freedom0013
 */
public class PalindromeNumber_9 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�жϵ�������");
		try {
			int target = sc.nextInt(); 
			System.out.println("������ǣ�" + target);
			System.out.println("�Ƿ�Ϊ��������" + isPalindrome(target));
		} catch (InputMismatchException e) {
			System.out.println("�����ֵ����");
		}
	}
	
	/**
	 * �жϻ�����
	 * @param x ��������
	 * @return ���
	 */
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		if (x == overthrow(x)) {
			return true;
		}
		return false;
	}
	
	/**
	 * ��ת����
	 * @param input ����
	 * @return ��ת���
	 */
	public static int overthrow(int input) {
		int output = 0;
		while (input > 0) {
			output = output * 10 + input % 10;
			input = input / 10;
		}
		return output;
	} 
}
