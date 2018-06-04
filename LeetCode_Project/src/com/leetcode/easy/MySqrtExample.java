package com.leetcode.easy;

import java.util.Scanner;

/**
 * #69   x ��ƽ����
 * Question��
 * ʵ�� int sqrt(int x) ������
 * ���㲢���� x ��ƽ���������� x �ǷǸ�������
 * ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 * ʾ�� 1:
 * ����: 4
 * ���: 2
 * ʾ�� 2:
 * ����: 8
 * ���: 2
 * ˵��: 8 ��ƽ������ 2.82842..., ���ڷ���������������С�����ֽ�����ȥ��
 * Title: MySqrtExample
 * @date 2018��6��4��
 * @author Freedom0013
 */
public class MySqrtExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�����������");
		try {
			int targetNum = sc.nextInt();
			System.out.println("������ǣ�" + targetNum);
			System.out.println("ƽ����Ϊ��" + mySqrt(targetNum));
		} catch (Exception e) {
			System.out.println("�����ֵ����");
		}
	}

	/**
	 * ����ƽ����
	 * 
	 * ţ�ٵ�����ʽ
	 * 		��r��f(x) = 0�ĸ���ѡȡx0��Ϊr��ʼ����ֵ������(x0,f(x0))������y = f(x)������L
	 * 		L�ķ���Ϊ:y = f(x0) + f'(x0)(x-x0)
	 * 		���L��x�ύ��ĺ����� x1 = x0-f(x0)/f'(x0)��x1Ϊr��һ�ν���ֵ��
	 * 		����(x1,f(x1))������y = f(x)������
	 * 		�����������x�ύ��ĺ����� x2 = x1-f(x1)/f'(x1)����x2Ϊr�Ķ��ν���ֵ��
	 *		�ظ����Ϲ��̣���r�Ľ���ֵ���У�����x(n+1��=x(n)��f(x(n))/f'(x(n))����Ϊr��n+1�ν���ֵ����ʽ��Ϊţ�ٵ�����ʽ��
	 * 
	 * @param x Ҫ�������
	 * @return ƽ����
	 */
	public static int mySqrt(int x) {
		double pre = 0;
		double cur = x; 			
		while (Math.abs(cur - pre) > 0.000001) {
			pre = cur;
			cur = (pre / 2 + x / (2 * pre));
		}
		return (int) cur;
    }
}
