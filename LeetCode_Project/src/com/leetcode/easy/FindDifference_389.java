package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * #389  找不同
 * Question：
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 示例:
 * 	输入：
 * 		s = "abcd"
 * 		t = "abcde"
 * 	输出：
 * 		e
 * 	解释：
 * 		'e' 是那个被添加的字母。
 * Title: FindDifference_389
 * @date 2018年6月17日
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
	 * 查找两个字符串不同
	 * @param s 原串（可为空串）
	 * @param t 被添加字母串
	 * @return 不同
	 */
	public static char findTheDifference(String s, String t) {
		//判空
		if (t == null || t.trim().length() == 0 || t.equalsIgnoreCase(null)) {
			return ' ';
		}
		// 哈希表
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// 遍历原始字符串s
		for (int i = 0; i < s.length(); i++) {
			// 哈希表当中没有s的某个字母
			if (map.containsKey(s.charAt(i)) == false) {
				// 哈希表添加字母
				map.put(s.charAt(i), 1);
			} else {
				// 哈希表字母数量+1
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		// 遍历插入字母后字符串t
		for (int i = 0; i < t.length(); i++) {
			// 在哈希表当中没有t的字符，则找到此字母
			if (map.get(t.charAt(i)) == null) {
				return t.charAt(i);
			} else {
				// 从重复的字母当中筛选，并把出现数量-1
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				// 如果数量小于0则此字母在t字符串当中出现的次数比s多则返回
				if (map.get(t.charAt(i)) < 0) {
					return t.charAt(i);
				}
			}
		}
		return ' ';
	}
}
