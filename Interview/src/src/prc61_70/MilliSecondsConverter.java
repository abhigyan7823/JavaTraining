package src.prc61_70;

public class MilliSecondsConverter {
	public static void main(String[] args) {
		long milliseconds = 125000;
		long seconds = milliseconds / 1000 % 60;
		long minutes = milliseconds / (60*1000);
		System.out.println("Converted Time: " + minutes + " minutes and " + seconds + " seconds");
	}

}


