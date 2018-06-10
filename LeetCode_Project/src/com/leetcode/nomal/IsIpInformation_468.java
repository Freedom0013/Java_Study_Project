package com.leetcode.nomal;

/**
 * #468  验证IP地址
 * Question：
 * 编写一个函数来验证输入的字符串是否是有效的 IPv4 或 IPv6 地址。
 * IPv4 地址由十进制数和点来表示，每个地址包含4个十进制数，其范围为 0 - 255， 用(".")分割。
 * 		比如，172.16.254.1；
 * 		同时，IPv4 地址内的数不会以 0 开头。
 * 		比如，地址 172.16.254.01 是不合法的。
 * IPv6 地址由8组16进制的数字来表示，每组表示 16 比特。这些组数字通过 (":")分割。
 * 			比如,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 是一个有效的地址。
 * 		而且，我们可以加入一些以 0 开头的数字，字母可以使用大写，也可以是小写。
 * 			所以， 2001:db8:85a3:0:0:8A2E:0370:7334 也是一个有效的 IPv6 address地址 (即，忽略 0 开头，忽略大小写)。
 * 		然而，我们不能因为某个组的值为 0，而使用一个空的组，以至于出现 (::) 的情况。 
 * 			比如， 2001:0db8:85a3::8A2E:0370:7334 是无效的 IPv6 地址。
 * 		同时，在 IPv6 地址中，多余的 0 也是不被允许的。
 * 			比如， 02001:0db8:85a3:0000:0000:8a2e:0370:7334 是无效的。
 * 		说明: 你可以认为给定的字符串里没有空格或者其他特殊字符。
 * 示例 1:
 * 		输入: "172.16.254.1"
 * 		输出: "IPv4"
 * 解释: 这是一个有效的 IPv4 地址, 所以返回 "IPv4"。
 * 示例 2:
 * 		输入: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * 		输出: "IPv6"
 * 解释: 这是一个有效的 IPv6 地址, 所以返回 "IPv6"。
 * 示例 3:
 * 		输入: "256.256.256.256"
 * 		输出: "Neither"
 * 解释: 这个地址既不是 IPv4 也不是 IPv6 地址。	
 * Title: IsIpInformation_468
 * @date 2018年6月10日
 * @author Freedom0013
 */
public class IsIpInformation_468 {
	String ip4 = "^(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}$";
	public static void main(String[] args) {
		String testip = "2001:db8:85a3:0::8a2E:0370:7334";
		String testip1 = "::";
		String testip2 = "2001:0db8:85a3:0:0:8A2E:0370:7334";
		System.out.println(validIPAddress(testip));
		System.out.println(validIPAddress(testip1));
		System.out.println(validIPAddress(testip2));
	}
	
	/**
	 * 匹配ip地址
	 * @param IP IP地址
	 * @return 匹配是否成功
	 */
	public static String validIPAddress(String IP) {
		if (IP == null || IP.isEmpty())
			return "Neither";
		if (IP.contains(":")) {
			return (isIPv6(IP) ? "IPv6" : "Neither");
		} else {
			return (isIPv4(IP) ? "IPv4" : "Neither");
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
