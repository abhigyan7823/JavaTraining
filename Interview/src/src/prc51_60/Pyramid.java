package src.prc51_60;

public class Pyramid {
	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;i++) {
			for(int sp=1;sp<=rows-i;sp++) {
				System.out.print(" ");
			}
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
			System.out.println();
		}
	}
}
