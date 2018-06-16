package com.leetcode.easy;

import java.util.Scanner;

/**
 * #520  Detect Capital
 * Question��
 * ����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
 * ���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
 * ȫ����ĸ���Ǵ�д������"USA"��
 * ������������ĸ�����Ǵ�д������"leetcode"��
 * ������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google"��
 * �������Ƕ����������û����ȷʹ�ô�д��ĸ��
 * ʾ�� 1:
 * 		����: "USA"
 * 		���: True
 * ʾ�� 2:
 * 		����: "FlaG"
 * 		���: False
 * ע��: �������ɴ�д��Сд������ĸ��ɵķǿյ��ʡ�
 * Title: DetectCapital_520
 * @date 2018��6��16��
 * @author Freedom0013
 */
public class DetectCapital_520 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���ĵ��ʣ�");
		String target = sc.nextLine(); 
		System.out.println("������ǣ�" + target);
		boolean res = detectCapitalUse(target);
		System.out.println("������ǣ�" + (res == true?"True":"False"));
	}
	
	/**
	 * �ж���ĸ��Сд��ȷ
	 * @param word ���ж��ַ���
	 * @return �Ƿ�Ϊ�Ϸ�����
	 */
	public static boolean detectCapitalUse(String word) {
		if (word == null || word.trim().length() == 0 || word.equalsIgnoreCase("null")) {
			return false;
		}
		// ��д��ĸ����
		int count = 0;
		System.out.println(word.charAt(0));
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				count++;
			}
		}
		// ȫΪ��д
		if (count == word.length()) {
			return true;
		}
		// ����ĸ��д
		if (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
			return true;
		}
		// ȫΪСд
		if (count == 0) {
			return true;
		}
		return false;
    }
}
