package com.solved;

import java.util.Scanner;

/*
 * Question:
 * Given an array of n integers where n > 1, nums, 
 * return an array output such that output[i] is equal to the 
 * product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 */

public class ProductArray {

	public static void main(String[] args) {
		run();
	}
	
	/*
	 * Function:�ⷨһ
	 */
	public static void run() {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			int n = s.nextInt();
			int[] array = new int[n];
			
			int resultSum = 1;
			
			for(int i = 0; i < n; i++) {
				array[i] = s.nextInt();
				resultSum *= array[i];
			}
			
			for(int i = 0; i < n; i++) {
				array[i] = resultSum / array[i];
			}
			
			print(array);
		}
	}
	
	public static void print(int[] array) {
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
