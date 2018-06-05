package com.leetcode.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * #13   ��������ת����
 * Question��
 * �������ְ������������ַ���
 * I�� V�� X�� L��C��D �� M��
 * �ַ�          ��ֵ
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��
 * ͨ������£�����������С�������ڴ�����ֵ��ұߡ�
 * ��Ҳ�������������� :
 * 		���� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��
 * 		���� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������
 * 			I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
 * 			X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90��
 * 			C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
 * ����һ���������֣�����ת��������������ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
 * ʾ�� 1:
 * 		����: "III"
 * 		���: 3
 * ʾ�� 2:
 * 		����: "IV"
 * 		���: 4
 * ʾ�� 3:
 * 		����: "IX"
 * 		���: 9
 * ʾ�� 4:
 * 		����: "LVIII"
 * 		���: 58
 * 		����: C = 100, L = 50, XXX = 30, III = 3.
 * ʾ�� 5:
 * 		����: "MCMXCIV"
 * 		���: 1994
 * 		����: M = 1000, CM = 900, XC = 90, IV = 4.
 * Title: RomeToInt
 * @date 2018��6��5��
 * @author Freedom0013
 */
public class RomeToInt {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫת�����������֣�");
		try {
			String target = sc.nextLine(); 
			System.out.println("������ǣ�" + target);
			System.out.println("ת���������Ϊ��" + romanToInt(target));
		} catch (InputMismatchException e) {
			System.out.println("�����ֵ����");
		}
	}
	
	/**
	 * ��������ת������
	 * @param s ���������ַ���
	 * @return ת���������
	 */
	public static int romanToInt(String s) {
		s+=" ";										//��ֹ�ַ��������±�Խ��
		int result = 0;
		for (int i = 0; i < s.length()-1; i++) {
			char roman1 = s.charAt(i);
			char roman2 = s.charAt(i+1);
			int num1 = selectRome(roman1);
			int num2 = selectRome(roman2);
			if(num1 < num2) {
				result = result - num1 + num2;
                i++;
            } else {
            	result += num1;;
            }
		}
		return result;
    }
	
	/**
	 * �������ֶ�Ӧ��������ת���б�
	 * @param c ��һ�����ַ�
	 * @return ����
	 */
	public static int selectRome(char c){
		switch (c) {
	        case 'I':
	            return 1;
	        case 'V':
	            return 5;
	        case 'X':
	            return 10;
	        case 'L':
	            return 50;
	        case 'C':
	            return 100;
	        case 'D':
	            return 500;
	        case 'M':
	            return 1000;
	        default:
	        	return 0;
		}
	}
}
