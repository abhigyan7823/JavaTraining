package src.arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		int row=3;
		int col=3;
		int k=1;
		int[][] arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = k++;
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}


}
