package com.leetcode.nomal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.leetcode.utils.CodeTimer;


/**
 * #15   ����֮��
 * Question��
 * ����һ������ n ������������ nums���ж� nums ���Ƿ��������Ԫ�� a��b��c ��ʹ�� a + b + c = 0 ���ҳ��������������Ҳ��ظ�����Ԫ�顣
 * ע�⣺���в����԰����ظ�����Ԫ�顣
 * ����, �������� nums = [-1, 0, 1, 2, -1, -4]������Ҫ�����Ԫ�鼯��Ϊ��
 * [
 * 		[-1, 0, 1],
 * 		[-1, -1, 2]
 * ]	
 * Title: ThreeNumSum_15
 * @date 2018��6��9��
 * @author Freedom0013
 */
public class ThreeNumSum_15 {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> list = threeSum(nums);
		CodeTimer timer = CodeTimer.getInstance();
		timer.startTimer();
		System.out.println(list.toString());
		timer.stopTimer();
	}
	
	/**
	 * ����֮�ͣ���ʱ��
	 * @param nums �����nums
	 * @return ��Ԫ�鼯��
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) {
			return new ArrayList<List<Integer>>();
		}
		Arrays.sort(nums);
		Set<List<Integer>> resset = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					System.out.println(nums[i] +","+ nums[j] +","+ nums[k]+"\t\t==="+(nums[i] + nums[j] + nums[k]));
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> line = new ArrayList<Integer>();
						line.add(nums[i]);
						line.add(nums[j]);
						line.add(nums[k]);
						resset.add(line);
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(resset);
    }
	
//	List<List<Integer>> ans = new ArrayList<List<Integer>>();
//	/**
//	 * ����֮�ͣ�ͨ�����������磩
//	 * @param nums ��������
//	 * @return �͵�0����
//	 */
//	public List<List<Integer>> threeSum(int[] nums) {
//		int length = nums.length;
//		if (nums == null || length < 3)
//			return ans;
//		Arrays.sort(nums);
//		for (int i = 0; i < length - 2; ++i) {
//			if (i > 0 && nums[i] == nums[i - 1])
//				continue;
//			findTwoSum(nums, i + 1, length - 1, nums[i]);
//		}
//		return ans;
//	}
//
//	public void findTwoSum(int[] num, int begin, int end, int target) {
//		while (begin < end) {
//			if (num[begin] + num[end] + target == 0) {
//				List<Integer> list = new ArrayList<Integer>();
//				list.add(target);
//				list.add(num[begin]);
//				list.add(num[end]);
//				ans.add(list);
//				while (begin < end && num[begin + 1] == num[begin])
//					begin++;
//				begin++;
//				while (begin < end && num[end - 1] == num[end])
//					end--;
//				end--;
//			} else if (num[begin] + num[end] + target > 0)
//				end--;
//			else
//				begin++;
//		}
//	}
}
