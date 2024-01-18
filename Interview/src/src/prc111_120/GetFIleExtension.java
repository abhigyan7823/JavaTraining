package src.prc111_120;

import java.io.File;

public class GetFIleExtension {
	public static void main(String[] args) {
		File file = new File("/home/abhigyan_bhadoria/P.txt");
		String filename = file.toString();
		int ind = filename.lastIndexOf('.');
		if(ind>0) {
			String str = filename.substring(ind+1);
			System.out.println(str);
		}	
	}
}
