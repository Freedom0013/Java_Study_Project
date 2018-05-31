package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.leetcode.utils.Utils;

/**
 * Question��#645	����ļ��� 
 * 		���� S ������1�� n�����������ҵ��ǣ���Ϊ���ݴ��󣬵��¼�������ĳһ��Ԫ�ظ����˳��˼������������һ��Ԫ�ص�ֵ�� 
 * 		���¼��϶�ʧ��һ������������һ��Ԫ���ظ�������һ������nums �����˼��� S ���������Ľ����
 * 		�������������Ѱ�ҵ��ظ����ֵ����������ҵ���ʧ�������� ���������������ʽ���ء� 
 * 		��������ĳ��ȷ�Χ�� [2,10000]�� 
 * 		����������������ġ� 
 * Title: findErrorNums_645
 * @date 2018��5��12��
 * @author Freedom0013
 */
public class FindErrorNums_645 {
	public static void main(String[] args) {
		int[] nums = {1,1,3,4,6,5};
		Arrays.sort(nums);
		Utils.printfArray(nums);
		Utils.printfArray(findErrorNums(nums));
	}
	
	
	/**
	 * �ҳ��������
	 * @param nums ���������
	 * @return �ظ���ֵ
	 */
	public static int[] findErrorNums(int[] nums) {
		int[] result = new int[2];
		boolean[] flags = new boolean[nums.length + 1];
		//�ҵ��ظ�������
		for (int i = 0; i < nums.length; i++){
			if (flags[nums[i]] == false) {
				flags[nums[i]] = true;
			} else {
				result[0] = nums[i];
			}
		}
		//�±��λ�ҵ���һ����Ҫ���޸ĵ�����
		for (int i = 1; i < (nums.length + 1); i++) {
			if (flags[i] == false) {
				result[1] = i;
				break;
			}
		}
		return result;
	}
	
	/**
	 * ��򷽷����������磩
	 * @param nums ���������
	 * @return �ظ���ֵ
	 */
	public static int[] findErrorNumsfromNet(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int duplicate = 0;
		int n = nums.length;
		long sum = (n * (n + 1)) / 2;
		for (int i : nums) {
			if (set.contains(i))
				duplicate = i;
			sum = sum - i;
			set.add(i);
		}
		return new int[] { duplicate, (int) sum + duplicate };
	}
}
