package src.prc41_50;

//Mean Deviation = 1/n∑in (xi – x̄)^2

public class StandardDeviation {
	
	public static void main(String[] args) {
		int[] arr = {8,2,9,5,7,4};
		double standardDeviation = 0.0;
	    double mean = 0.0;
	    double res = 0.0;
	    double sq = 0.0;
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = arr[i];
		}
		mean = sum/arr.length;
		for(int i=0;i<arr.length;i++) {
			standardDeviation += Math.pow((arr[i]-mean),2);
		}
		sq = standardDeviation/arr.length;
		res = Math.sqrt(sq);
		System.out.println(res);
	}
}
