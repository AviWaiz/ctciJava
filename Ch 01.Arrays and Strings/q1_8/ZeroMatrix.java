package q1_8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZeroMatrix {
	public static void zeroMatrix(int[][] matrix) {
		ArrayList<int[]> toConvert = new ArrayList<int[]>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) toConvert.add(new int[] {i, j});
			}
		}
		
		for (int[] pos : toConvert) {
			rowToZero(pos[0], matrix);
			colToZero(pos[1], matrix);
		}
	}
	
	public static void rowToZero(int row, int[][] mat){
		for (int i = 0; i < mat[row].length; i++) mat[row][i] = 0;
	}
	
	public static void colToZero(int col, int[][] mat){
		for (int i = 0; i < mat.length; i++) mat[i][col] = 0;
	}
	
	public static void printMat(int[][] mat){
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) System.out.print(mat
					[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void printMat(ArrayList<int[]> mat){
		for (int i = 0; i < mat.size(); i++) {
			for (int j = 0; j < mat.get(0).length; j++) System.out.print(mat.get(i)[j] + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] mat = {{1,1,2,3}, {4,5,6,7}, {8,9,0,11}, {12,13,14,15}};
		printMat(mat);
		zeroMatrix(mat);
		printMat(mat);
	}
}
