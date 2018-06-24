package com.leetcode.easy;

/**
 * #268  ȱʧ����
 * Question��
 * ����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����
 * ʾ�� 1:
 * ����: [3,0,1]
 * ���: 2
 * ʾ�� 2:
 * ����: [9,6,4,2,3,5,7,0,1]
 * ���: 8
 * ˵��:
 * ����㷨Ӧ��������ʱ�临�Ӷȡ����ܷ��ʹ�ö��ⳣ���ռ���ʵ��?
 * Title: MissingNumber_268
 * @date 2018��6��24��
 * @author Freedom0013
 */
public class MissingNumber_268 {
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
	
	/**
	 * �ҳ�ȱʧ����
	 * @param nums ����������
	 * @return ȱʧ����
	 */
	public static int missingNumber(int[] nums) {
		int res = 0;
		for (int i = 1; i <= nums.length; i++) {
			res += (i - nums[i - 1]);
		}
		return res;
	}
	
	/**
	 * �ҳ�ȱʧ����2��������㣩
	 * @param nums ����������
	 * @return ȱʧ����
	 */
	public int missingNumber2(int[] nums) { 
	    int res = nums.length;
	    for(int i=0; i<nums.length; i++){
	        res ^= i;
	        res ^= nums[i];
	    }
	    return res;
	}
}
