package com.leetcode.hard;

/**
 * 
 * Question��
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧�����Ĺ�Ʊ�ڵ� i ��ļ۸�
 * ���һ���㷨�����������ܻ�ȡ�������������������� ���� ���ס�
 * ע��: �㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����
 * ʾ�� 1:
 * ����: [3,3,5,0,0,3,1,4]
 * ���: 6
 * ����: �ڵ� 4 �죨��Ʊ�۸� = 0����ʱ�����룬�ڵ� 6 �죨��Ʊ�۸� = 3����ʱ����������ʽ������ܻ������ = 3-0 = 3 ��
 * ����ڵ� 7 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 8 �� ����Ʊ�۸� = 4����ʱ����������ʽ������ܻ������ = 4-1 = 3 ��
 * ʾ�� 2:
 * ����: [1,2,3,4,5]
 * ���: 4
 * ����: �ڵ� 1 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �� ����Ʊ�۸� = 5����ʱ������, ��ʽ������ܻ������ = 5-1 = 4 ��   
 * ע���㲻���ڵ� 1 ��͵� 2 ����������Ʊ��֮���ٽ�����������   
 *  ��Ϊ��������ͬʱ�����˶�ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ��
 *  ʾ�� 3:
 *  ����: [7,6,4,3,1] 
 *  ���: 0 
 *  ����: ����������, û�н������, �����������Ϊ 0��
 * Title: BestTimetoBuyIII_123
 * @date 2018��6��27��
 * @author Freedom0013
 */
public class BestTimetoBuyIII_123 {
	public static void main(String[] args) {
		int[] prices = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));
	}
	
	/**
	 * �����������
	 * @param prices ÿ�ռ۸�����
	 * @return �������
	 */
	public static int maxProfit(int[] prices) {
		if (prices == null) {
			return 0;
		}
		if (prices.length < 2) {
			return 0;
		}
		int result = 0;
		int Max = 0;
		for (int i = 0; i < prices.length; i++) {
			int pricesMin = prices[0];
			int pricesMax = 0;
			for (int j = 1; j < i; j++) {
				pricesMax = Math.max(pricesMax, prices[j] - pricesMin);
				pricesMin = Math.min(pricesMin, prices[j]);
			}

			Max = pricesMax;
			pricesMin = prices[i];
			pricesMax = 0;
			for (int k = i + 1; k < prices.length; k++) {
				pricesMax = Math.max(pricesMax, prices[k] - pricesMin);
				pricesMin = Math.min(pricesMin, prices[k]);
			}

			Max += pricesMax;
			result = Math.max(Max, result);
		}
		return result;
	}
}
