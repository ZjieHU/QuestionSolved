package com.solved;

/*
 * According to the Wikipedia's article: "The Game of Life, also known 
 * simply as Life, is a cellular automaton devised by the British mathematician 
 * John Horton Conway in 1970."
 * Given a board with m by n cells, each cell has an initial state 
 * live (1) or dead (0). Each cell interacts with its eight neighbors
 *  (horizontal, vertical, diagonal) using the following four rules 
 *  (taken from the above Wikipedia article):
 *  
 *  Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 *  Any live cell with two or three live neighbors lives on to the next generation.
 *  Any live cell with more than three live neighbors dies, as if by over-population..
 *  Any dead cell with exactly three live neighbors becomes a live cell,
 *   as if by reproduction. Write a function to compute the next state (after one update)
 *    of the board given its current state.
 *    Follow up:
 *    
 *    Could you solve it in-place? Remember that the board needs to be updated
 *    at the same time: You cannot update some cells first and then use their updated 
 *    values to update other cells.
 *    In this question, we represent the board using a 2D array. 
 *    In principle, the board is infinite, which would cause problems when 
 *    the active area encroaches the border of the array. How would you address these problems?
 */

public class GameOfLife {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		int[][] array = new int[][] {
				{ 1, 0, 1, 1, 0 },
				{ 0, 1, 0, 0, 1 },
				{ 1, 0, 1, 1, 0 },
				{ 1, 0, 1, 0, 1 }
		};  //随机矩阵
		int m = array.length;
		int n = array[0].length;
		
		for(int i = 0; i < m; i ++) {
			for(int j = 0; j < n; j++) {
				array[i][j] = isDied(i,j,n,m,array) % 2;
			}
		}
	}
	
	public static int isDied(int i, int j, int col, int row, int[][] array) {
		int result = 1;
		int count = 0;
		int x = i, y = j;
		int m = i + 1;
		int n = j + 1;
		
		for(i = i - 1; i <= m; i++) {
			for(j = j - 1; j <= n; j ++) {
				if(i >= 0 && i <= row && j >= 0 && j <= col) {
					if(array[i][j] == 1 && x != i && y != j) 
						count ++;
				}
			}
		}
		
		if(count == 3 && array[x][y] == 0) result = 3;  //重新复活，取余数又为1
		if((count < 2 || count > 3 ) && array[x][y] == 1) result = 2; //死亡状态，取余数为0
		
		return result;
	}
	
}
