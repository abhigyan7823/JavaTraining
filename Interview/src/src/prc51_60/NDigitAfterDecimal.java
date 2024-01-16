package src.prc51_60;

import java.text.DecimalFormat;

public class NDigitAfterDecimal {
	public static void main(String[] args) {
		double d = 1.414213562;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println(df.format(d));
		System.out.format("%.2f",d);
	}
}
