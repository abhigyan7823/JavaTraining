package src.prc51_60;

public class LexicographicalOrder {
	public static void main(String[] args) {
		String[] words = { "I", "AM Going", "to be ", "King Of Priates" };
	    for(int i = 0; i < words.length-1; i++) {
	      for (int j = i + 1; j < words.length; j++) {      
	        if (words[i].compareTo(words[j]) > 0) {
	          String temp = words[i];
	          words[i] = words[j];
	          words[j] = temp;
	        }
	      }
	    }	    
	    for(int i = 0; i < 4; i++) {
	      System.out.println(words[i]);
	    }
	}
}
