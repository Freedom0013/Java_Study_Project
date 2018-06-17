package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * #389  �Ҳ�ͬ
 * Question��
 * ���������ַ��� s �� t������ֻ����Сд��ĸ��
 * �ַ��� t ���ַ��� s ������ţ�Ȼ�������λ�����һ����ĸ��
 * ���ҳ��� t �б���ӵ���ĸ��
 * ʾ��:
 * 	���룺
 * 		s = "abcd"
 * 		t = "abcde"
 * 	�����
 * 		e
 * 	���ͣ�
 * 		'e' ���Ǹ�����ӵ���ĸ��
 * Title: FindDifference_389
 * @date 2018��6��17��
 * @author Freedom0013
 */
public class FindDifference_389 {
	public static void main(String[] args) {
		String s = "";
		String t = "y";
		char res = findTheDifference(s,t);
		System.out.println(res);
	}
	
	/**
	 * ���������ַ�����ͬ
	 * @param s ԭ������Ϊ�մ���
	 * @param t �������ĸ��
	 * @return ��ͬ
	 */
	public static char findTheDifference(String s, String t) {
		//�п�
		if (t == null || t.trim().length() == 0 || t.equalsIgnoreCase(null)) {
			return ' ';
		}
		// ��ϣ��
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// ����ԭʼ�ַ���s
		for (int i = 0; i < s.length(); i++) {
			// ��ϣ����û��s��ĳ����ĸ
			if (map.containsKey(s.charAt(i)) == false) {
				// ��ϣ�������ĸ
				map.put(s.charAt(i), 1);
			} else {
				// ��ϣ����ĸ����+1
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		// ����������ĸ���ַ���t
		for (int i = 0; i < t.length(); i++) {
			// �ڹ�ϣ����û��t���ַ������ҵ�����ĸ
			if (map.get(t.charAt(i)) == null) {
				return t.charAt(i);
			} else {
				// ���ظ�����ĸ����ɸѡ�����ѳ�������-1
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				// �������С��0�����ĸ��t�ַ������г��ֵĴ�����s���򷵻�
				if (map.get(t.charAt(i)) < 0) {
					return t.charAt(i);
				}
			}
		}
		return ' ';
	}
}
