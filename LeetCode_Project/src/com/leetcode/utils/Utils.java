package com.leetcode.utils;

/**
 * ������
 * Title: Utils
 * @date 2018��5��29��
 * @author Freedom0013
 */
public class Utils {
	/**
	 * ��ӡ����(int)
	 * @param nums ����ӡ����
	 */
	public static void printfArray(final int[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("����Ϊ�ջ����鳤��Ϊ0");
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
	 * ��ӡ����(boolean)
	 * @param nums ����ӡ����
	 */
	public static void printfArray(final boolean[] nums) {
		if (nums == null || nums.length == 0) {
			System.out.println("����Ϊ�ջ����鳤��Ϊ0");
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
	 * �ж��ַ����Ƿ�Ϊ��
	 * @param string �ַ���
	 * @return ���
	 */
	public static boolean isNullOrEmpty(final String string) {
		return string == null || string.trim().length() == 0;
	}
	
	/**
	 * ƥ��ip��ַ
	 * @param IP IP��ַ
	 * @return ƥ���Ƿ�ɹ�
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
	 * �ж��Ƿ�ΪIPv6
	 * @param ip ip��ַ
	 * @return ���
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
	 * �ж��Ƿ�ΪIPv4
	 * @param ip ip��ַ
	 * @return ���
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
				// ����Ƿ�0��ͷ
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
