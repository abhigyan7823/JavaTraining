package src.prc41_50;

public class MatrixAddition {
	public static void main(String[] args) {
		int row = 3, col = 3;
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int a = 1, b = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr1[i][j] = a++;
				arr2[i][j] = b++;
			}
		}
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
	}
}
