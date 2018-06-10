package com.leetcode.utils;

/**
 * 工具类
 * Title: Utils
 * @date 2018年5月29日
 * @author Freedom0013
 */
public class Utils {
	/**
	 * 打印数组(int)
	 * @param nums 被打印数组
	 */
	public static void printfArray(final int[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("数组为空或数组长度为0");
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				System.out.print("[" + nums[i]);
			} else if (i < nums.length - 1) {
				System.out.print("," + nums[i]);
			} else if (i == nums.length - 1) {
				System.out.println("," + nums[i] + "]");
			}
		}
	}
	
	/**
	 * 打印数组(boolean)
	 * @param nums 被打印数组
	 */
	public static void printfArray(final boolean[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("数组为空或数组长度为0");
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				System.out.print("[" + nums[i]);
			} else if (i < nums.length - 1) {
				System.out.print("," + nums[i]);
			} else if (i == nums.length - 1) {
				System.out.println("," + nums[i] + "]");
			}
		}
	}
	
	/**
	 * 判断字符串是否为空
	 * @param string 字符串
	 * @return 结果
	 */
	public static boolean isNullOrEmpty(final String string) {
		return string == null || string.trim().length() == 0;
	}
	
	/**
	 * 匹配ip地址
	 * @param IP IP地址
	 * @return 匹配是否成功
	 */
	public static boolean IsIP(String IP) {
		if (IP == null || IP.isEmpty())
			return false;
		if (IP.contains(":")) {
			return (isIPv6(IP) ? true : false);
		} else {
			return (isIPv4(IP) ? true : false);
		}
	}
	
	/**
	 * 判断是否为IPv6
	 * @param ip ip地址
	 * @return 结果
	 */
	private static boolean isIPv6(String ip) {
		int dotCount = 0;
		for (int i = 0; i < ip.length(); i++)
			if (ip.charAt(i) == ':')
				dotCount++;
		if (dotCount != 7)
			return false;
		String gr[] = ip.split(":");
		if (gr.length != 8)
			return false;
		for (String g : gr) {
			if (g.isEmpty())
				return false;
			if (g.length() > 4) {
				return false;
			}
			for (int i = 0; i < g.length(); i++) {
				char ch = g.charAt(i);
				if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')))
					return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断是否为IPv4
	 * @param ip ip地址
	 * @return 结果
	 */
	private static boolean isIPv4(String ip) {
		int dotCount = 0;
		for (int i = 0; i < ip.length(); i++)
			if (ip.charAt(i) == '.')
				dotCount++;
		if (dotCount != 3)
			return false;
		String gr[] = ip.split("\\.");
		if (gr.length != 4)
			return false;
		for (String g : gr) {
			if (g.isEmpty())
				return false;
			try {
				int val = Integer.parseInt(g);
				// 检查是否0开头
				if ((val + "").equals(g) == false)
					return false;
				if (val > 255 || val < 0)
					return false;
				if (g.charAt(0) == '0' && (val != 0 || g.length() != 1))
					return false;
			} catch (NumberFormatException ex) {
				return false;
			}

		}
		return true;
	}
}
