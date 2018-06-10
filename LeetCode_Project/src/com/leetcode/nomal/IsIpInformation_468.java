package com.leetcode.nomal;

/**
 * #468  ��֤IP��ַ
 * Question��
 * ��дһ����������֤������ַ����Ƿ�����Ч�� IPv4 �� IPv6 ��ַ��
 * IPv4 ��ַ��ʮ�������͵�����ʾ��ÿ����ַ����4��ʮ���������䷶ΧΪ 0 - 255�� ��(".")�ָ
 * 		���磬172.16.254.1��
 * 		ͬʱ��IPv4 ��ַ�ڵ��������� 0 ��ͷ��
 * 		���磬��ַ 172.16.254.01 �ǲ��Ϸ��ġ�
 * IPv6 ��ַ��8��16���Ƶ���������ʾ��ÿ���ʾ 16 ���ء���Щ������ͨ�� (":")�ָ
 * 			����,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 ��һ����Ч�ĵ�ַ��
 * 		���ң����ǿ��Լ���һЩ�� 0 ��ͷ�����֣���ĸ����ʹ�ô�д��Ҳ������Сд��
 * 			���ԣ� 2001:db8:85a3:0:0:8A2E:0370:7334 Ҳ��һ����Ч�� IPv6 address��ַ (�������� 0 ��ͷ�����Դ�Сд)��
 * 		Ȼ�������ǲ�����Ϊĳ�����ֵΪ 0����ʹ��һ���յ��飬�����ڳ��� (::) ������� 
 * 			���磬 2001:0db8:85a3::8A2E:0370:7334 ����Ч�� IPv6 ��ַ��
 * 		ͬʱ���� IPv6 ��ַ�У������ 0 Ҳ�ǲ�������ġ�
 * 			���磬 02001:0db8:85a3:0000:0000:8a2e:0370:7334 ����Ч�ġ�
 * 		˵��: �������Ϊ�������ַ�����û�пո�������������ַ���
 * ʾ�� 1:
 * 		����: "172.16.254.1"
 * 		���: "IPv4"
 * ����: ����һ����Ч�� IPv4 ��ַ, ���Է��� "IPv4"��
 * ʾ�� 2:
 * 		����: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * 		���: "IPv6"
 * ����: ����һ����Ч�� IPv6 ��ַ, ���Է��� "IPv6"��
 * ʾ�� 3:
 * 		����: "256.256.256.256"
 * 		���: "Neither"
 * ����: �����ַ�Ȳ��� IPv4 Ҳ���� IPv6 ��ַ��	
 * Title: IsIpInformation_468
 * @date 2018��6��10��
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
	 * ƥ��ip��ַ
	 * @param IP IP��ַ
	 * @return ƥ���Ƿ�ɹ�
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
