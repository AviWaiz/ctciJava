package q1_7;

import javax.swing.text.iedHighlighter;

// The idea is to save the value of the top row
// and swap the left(col) with the top row 
// then swap bottom(row) left(col)
// right(col) with bottom(row)
// temp val with right(col)
// the index to loop through is halved 

//4x4 => [
//		[1,2,3,4], 
//      [5,6,7,8],
//      [9,10,11,12],
//      [13,14,15,16],
// i 0,1,2,3   i 0, 1
// the logic is that the amount of is that are iterated through is always half the number of rows
// the indices to swap inside will be the length of the array minus the i minus 1 
public class RotateMatrix {
	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				int temp = matrix[i][j];
				 matrix[i][j] = matrix[n - j - 1][i];
				 matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				 matrix[n - i - 1][n - j - 1] = matrix[i][n - j - 1];
				 matrix[i][n - j - 1] = temp;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		    	matrix[i][j] = count;
		    	count++;
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}
}
