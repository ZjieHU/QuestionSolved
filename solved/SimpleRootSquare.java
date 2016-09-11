package com.solved;

import java.util.Scanner;

/*
 *4. Simple root square
 *
 *Implement int sqrt(int x).
 *
 *Compute and return the square root of x.
 */

public class SimpleRootSquare {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			double num = s.nextDouble();
			double result = 0;
			
			while((result * result) < num) {
				result += 0.1;
			}
			
			System.out.println(result - 0.1);
		}
		
	}

}
