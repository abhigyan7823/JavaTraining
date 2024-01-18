package src.prc121_130;

public class UppercaseToFirstChar {
	public static void main(String[] args) {
		String str = "I am going to be king of the pirates";
		String[] words  = str.split(" ");
		String ch,rem;
		for(String word : words) {
			ch = word.substring(0,1).toUpperCase() + word.substring(1);
//			rem = word.substring(1);
			System.out.print(ch +" ");
		}
	}
}
