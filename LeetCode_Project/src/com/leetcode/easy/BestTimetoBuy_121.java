package com.leetcode.easy;

/**
 * #121  ������Ʊ�����ʱ��
 * Question��
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 * ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
 * ע���㲻���������Ʊǰ������Ʊ��
 * ʾ�� 1:
 * 		����: [7,1,5,3,6,4]
 * 		���: 5
 * 		����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
 * 		ע��:�������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
 * ʾ�� 2:
 * 		����: [7,6,4,3,1]
 * 		���: 0
 * 		����: �����������, û�н������, �����������Ϊ 0��
 * Title: BestTimetoBuy_121
 * @date 2018��6��21��
 * @author Freedom0013
 */
public class BestTimetoBuy_121 {
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}
	
	/**
	 * �������
	 * @param prices �۸�����
	 * @return ����
	 */
	public static int maxProfit(int[] prices) {
		//�п�
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int result = 0;
		int templow;
		int temp;
		templow = prices[0];
		for (int i = 1; i < prices.length; i++) {
			temp = prices[i];
			if (templow > temp) {
				//�ҳ���ͼ۸�
				templow = temp;
			} else {		
				//�ж��Ƿ�Ϊ�������
				temp = temp - templow;		
				result = result > temp ? result : temp;
			}
		}
		return result;
	}
}
