package src.prc1_10;
//x = (-b ± √ (b^2 - 4ac) )/2a.
public class RootsofQuadratic {
	public static void main(String[] args) {
		double a = 1;
		double b = -7;
		double c = 10;
		
		double powb = Math.pow(b, 2);
		
		double temp = powb -(4*a*c);
		
		double sqrt = Math.sqrt(temp);
		
		double divpos = -b + sqrt;
		double divneg = -b - sqrt;
		
		double first = divpos / (2*a);
		double sec = divneg / (2*a);
		
		System.out.println(first);
		System.out.println(sec);
		
	}
}
