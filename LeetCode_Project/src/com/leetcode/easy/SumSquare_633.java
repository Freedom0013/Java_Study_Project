package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #633   ƽ����֮��
 * Question��
 * ����һ���Ǹ����� c ����Ҫ�ж��Ƿ������������ a �� b��ʹ�� a^2 + b^2 = c��
 * ʾ��1:
 * 		����: 5
 * 		���: True
 * 		����: 1 * 1 + 2 * 2 = 5
 * ʾ��2:
 * 		����: 3
 * 		���: False
 * Title: SumSquare_633
 * @date 2018��6��3��
 * @author Freedom0013
 */
public class SumSquare_633 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�ķǸ�������");
		try {
			int targetNum = sc.nextInt();
			System.out.println("������ǣ�" + targetNum);
			System.out.println("�����" + judgeSquareSum(targetNum));
		} catch (InputMismatchException e) {
			System.out.println("�����ֵ����");
		}
	}
	
	public static boolean judgeSquareSum(int c) {
		if (c < 0) {
			return false;
		}
		int max = (int) Math.sqrt(c); 						
		for (int i = 0; i <= max; i++) { 					
			double test = Math.sqrt(c - i * i);
			System.out.println(test+","+i);
			if (test - (int) test == 0) {
				System.out.println("--"+test+","+i);
				return true;
			}
		}
		return false;
	}
}
