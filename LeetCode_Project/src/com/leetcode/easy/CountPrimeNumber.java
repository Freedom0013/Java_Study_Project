package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #204   ��������
 * Question��
 * ͳ������С�ڷǸ����� n ��������������
 * ʾ��:
 * 		����: 10
 * 		���: 4
 * 		����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
 * Title: CountPrimeNumber
 * @date 2018��6��6��
 * @author Freedom0013
 */
public class CountPrimeNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ������������");
		try {
			int target = sc.nextInt(); 
			System.out.println("������ǣ�" + target);
			System.out.println("����������Ϊ��" + countPrimes(target));
		} catch (InputMismatchException e) {
			System.out.println("�����ֵ����");
		}
	}
	
	/**
	 * ͳ��С��n����������
	 * @param n ��ͳ�Ƶ���
	 * @return ��������
	 */
	public static int countPrimes(int n) {
		if (n <= 1) {
			return 0;
		}
		boolean[] flag = new boolean[n]; 		// Ĭ�����е�Ԫ��ֵ��������Ϊfalse
		flag[0] = true;
		flag[1] = true;
		// ���i��һ��������i��i�ı�������Ϊ������������i��һ�������������ض��Ѿ�����Ϊtrue�ˣ���Ϊ�Ǵ�2��ʼ�����
		for (int i = 2; i * i < n; i++) {
			if (!flag[i]) {
				for (int j = 2 * i; j < n; j += i) {
					System.out.println(i+","+j);
					flag[j] = true;
				}
			}
		}
		int res = 0;
		for (boolean b : flag) {
			if (!b) {
				res++;
			}
		}
		return res;
    }
}
