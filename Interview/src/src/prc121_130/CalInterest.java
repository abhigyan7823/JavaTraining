package src.prc121_130;

public class CalInterest {

	public static double simpleInterest(int mon, int rate, int time) {
		return (mon * rate * time) / 100;
	}

	public static double compountInterest(double mon, int rate, int time) {
		return mon *  Math.pow(1.0+rate/100.0,time)-mon;
	}

	public static void main(String[] args) {
		System.out.println(simpleInterest(1000, 3, 2));
		System.out.println(compountInterest(1000, 3, 2));
	}
}
