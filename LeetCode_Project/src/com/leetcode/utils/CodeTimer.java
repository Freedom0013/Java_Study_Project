package com.leetcode.utils;

/**
 * ��������ʱ�������
 * Title: CodeTimer
 * @date 2018��5��29��
 * @author Freedom0013
 */
public class CodeTimer{
	/** ��ʼʱ�� */
	private long startTime;
	/** ������ʱ�� */
	private long endTime;
	/** ���� */
	private static CodeTimer __Instance = null;
	
	/**
	 * ��ȡ��ʱ������
	 * @return ��ʱ��
	 */
	public static CodeTimer getInstance() {
 		if (__Instance == null) {
 			synchronized (CodeTimer.class) {
 				if (__Instance == null) {
 					__Instance = new CodeTimer();
 				}
 			}
 		}
 		return __Instance;
 	}
	
	public void startTimer(){
		startTime = System.nanoTime();
	}
	
	public void stopTimer(){
		endTime = System.nanoTime();
		System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ns");
	}
}
