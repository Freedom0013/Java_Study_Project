package com.leetcode.utils;

/**
 * 程序运行时间测试类
 * Title: CodeTimer
 * @date 2018年5月29日
 * @author Freedom0013
 */
public class CodeTimer{
	/** 开始时间 */
	private static long startTime;
	/** 开结束时间 */
	private static long endTime;
	
	public static void startTimer(){
		startTime = System.nanoTime();
	}
	
	public static void stopTimer(){
		endTime = System.nanoTime();
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
	}
}
