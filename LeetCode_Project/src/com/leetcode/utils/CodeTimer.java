package com.leetcode.utils;

/**
 * 程序运行时间测试类
 * Title: CodeTimer
 * @date 2018年5月29日
 * @author Freedom0013
 */
public class CodeTimer{
	/** 开始时间 */
	private long startTime;
	/** 开结束时间 */
	private long endTime;
	/** 单例 */
	private static CodeTimer __Instance = null;
	
	/**
	 * 获取计时器单例
	 * @return 计时器
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
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
	}
}
