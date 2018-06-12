package com.leetcode.hard;

import java.util.Scanner;
import java.util.Stack;

/**
 * #224  Basic Calculator
 * Question��
 * ʵ��һ�������ļ�����������һ���򵥵��ַ������ʽ��ֵ��
 * �ַ������ʽ���԰��������� ( �������� )���Ӻ� + ������ -���Ǹ������Ϳո�
 * ʾ�� 1:
 * 		����: "1 + 1"
 * 		���: 2
 * ʾ�� 2:
 * 		����: " 2-1 + 2 "
 * 		���: 3
 * ʾ�� 3:
 * 		����: "(1+(4+5+2)-3)+(6+8)"
 * 		���: 23
 * Title: BasicCalculator_224
 * @date 2018��6��12��
 * @author Freedom0013
 */
public class BasicCalculator_224 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ����ı��ʽ��");
		String target = sc.nextLine();
		System.out.println("����ı��ʽΪ��" + target);
		System.out.println("������Ϊ��" + calculate(target));
	}
	
	/**
	 * ����������
	 * @param s ������ʽ
	 * @return ���
	 */
	public static int calculate(String s) {
		if (s == null || s.trim().length() == 0) {
			return 0;
		}
		char[] chs = s.toCharArray();
		// ����ջӦ���������ȼ���
		Stack<Integer> stack = new Stack<>();
		// ������
		int result = 0;
		// ���ַ��ű��
		int operator = 1;
		stack.push(1);
		for (int i = 0; i < chs.length; i++) {
			// �ж��Ƿ�Ϊ����
			if (Character.isDigit(chs[i])) {
				int num = chs[i] - '0';
				int next = i + 1;
				while (next < chs.length && Character.isDigit(chs[next])) {
					num = num * 10 + chs[next] - '0';
					next++;
				}
				// ��Ϊֻ�мӼ�������ȥ�������ڼ��ϸ���
				result += operator * stack.peek() * num;
				i = next - 1;
			} else if (chs[i] == '+') {
				operator = 1;
			} else if (chs[i] == '-') {
				operator = -1;
			} else if (chs[i] == '(') {
				// ��ջ����Ԫ��
				stack.push(operator * stack.peek());
				// ��ʼ����
				operator = 1;
			} else if (chs[i] == ')') {
				// ���Ž�����ջ
				stack.pop();
			} else {
				// �ո�
			}
		}
		return result;
	}
}
