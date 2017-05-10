package q1_7;

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
// indices to loop through are the layer count which goes from zero to matrix.length / 2
// this is because a NxN matrix has N/2 layers. for a 4x4 the layer count is 2
// the second index is hard to understand it comes down to reducing the iteration range every loop.
// for a 4x4 matrix on the first iteration the second index must go through
// a full row or column so the range is 0->3
// for the second iteration the index needs to only loop the inner layer lengths 
// since the size of the rows and columns in the inner layer are size 2
// and range from 1->2 the the inner index was incremented by a value of 1
// and was limited by the same amount minus the length of the previous range

public class RotateMatrix {
	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j  - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
		}
		return true;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) System.out.print(matrix[i][j] + " ");
		    System.out.println();
		}		
	}
	
	public static int[][] buildMatrix(int size) {
		int[][] mat = new int[size][size];
		int count = 1;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = count;
				count++;
			}
		}
		return mat;
	}
	
	public static void main(String[] args) {
		int[][] matrix = buildMatrix(4);
		printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		printMatrix(matrix);
	}
}
