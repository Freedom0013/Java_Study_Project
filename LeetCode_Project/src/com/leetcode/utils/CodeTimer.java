package com.leetcode.utils;

/**
 * ��������ʱ�������
 * Title: CodeTimer
 * @date 2018��5��29��
 * @author Freedom0013
 */
public class CodeTimer{
	/** ��ʼʱ�� */
	private static long startTime;
	/** ������ʱ�� */
	private static long endTime;
	
	public static void startTimer(){
		startTime = System.nanoTime();
	}
	
	public static void stopTimer(){
		endTime = System.nanoTime();
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns");
	}
}
