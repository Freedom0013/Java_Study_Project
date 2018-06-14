package com.leetcode.nomal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #46  ȫ����
 * Question��
 * ����һ��û���ظ����ֵ����У����������п��ܵ�ȫ���С�
 * ʾ��:
 * ����: [1,2,3]
 * ���:
 * [
 * 		[1,2,3],
 * 		[1,3,2],
 * 		[2,1,3],
 * 		[2,3,1],
 * 		[3,1,2],
 * 		[3,2,1]
 * ]
 * Title: Permutations_46
 * @date 2018��6��14��
 * @author Freedom0013
 */
public class Permutations_46 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums).toString());
	}
	
	/**
	 * ȫ����
	 * @param nums Ҫ���е�����
	 * @return �������
	 */
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> reslist = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0){
			return reslist;
		}
		Arrays.sort(nums);
		findLine(reslist, nums, 0);
		return reslist;
	}
	
	/**
     * 123��132�ڵ�һ����Ϊ1ʱ������������
     * 213��231�ѵڶ������ᵽ��һλ��֮�󽻻������к�����λ��
     * �Դ����ƣ�ÿһ�ΰ������е�Ԫ����������ͷ���䣬��������Ԫ�ؽ��л�����֮���ڷ������в������ɵó�ȫ����
     */
	/**
	 * �ݹ鳯������
	 * @param res ȫ���н������
	 * @param nums ����������
	 * @param flag �ݹ�����
	 */
	private static void findLine(List<List<Integer>> res, int[] nums, int flag) {  
		//���Ƶݹ��������������
        if (flag == nums.length) {  
            List<Integer> line = new ArrayList<Integer>();  
            for (int num : nums) {
            	line.add(num);  
            }
            res.add(line);  
        }  
        for (int i = flag; i < nums.length; i++) {
            swap(nums, i, flag);  
            findLine(res, nums, flag+1);  
            swap(nums, i, flag);
        }  
    }  
	
	/**
	 * ��������nums�±�Ϊm��nԪ��
	 * @param nums ����������������
	 * @param m �±�
	 * @param n �±�
	 */
    private static void swap(int[] nums, int m, int n) {  
        int temp = nums[m];  
        nums[m] = nums[n];  
        nums[n] = temp;  
    } 
}
