package com.solved;

import java.util.Scanner;

/*
 * Question:
 * Given an array nums, write a function to move all 
 * non-zero numbers to the head of it while maintaining the 
 * relative order of the non-zero numbers.
 * 
 * For example, given nums = [0, 1, 0, 3, 12], 
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 * 
 * Note: You must do this in-place without making a copy of the array. 
 * Minimize the total number of operations.
 */

public class NumberFirst {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			int n = s.nextInt();
			int[] array = new int[n];
			
			for(int i = 0; i < n; i++) {
				array[i] = s.nextInt();
			}
			
			int index = 0;
			
			for(int i = 0; i < n; i++) {
				if(array[i] != 0) {
					int tmp = array[i];
					int j = i + 1;
					
					for(;j < n; j++) {
						array[j - 1] = array[j];
					}
					
					array[j - 1] = 0;
					array[index ++] = tmp;
				}
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
