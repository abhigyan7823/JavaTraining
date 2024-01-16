package src.prc41_50;

public class MatrixMultipicationFun {
	
	public static void multiMatrix(int[][] arr1,int[][] arr2,int[][] mul,int row,int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mul[i][j] = 0;
				for (int k = 0; k < row; k++) {
					mul[i][j] += arr1[i][k] * arr2[k][j];
				}
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int row = 3, col = 3;
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] mul = new int[row][col];
		int a = 1, b = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = a++;
				arr2[i][j] = b++;
			}
		}
		multiMatrix(arr1, arr2, mul, row, col);
	}
}
