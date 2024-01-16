package src.prc51_60;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiffBwTimeInter {
	public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss"); 
  
        Date date1 = simpleDateFormat.parse("18:00:00"); 
        Date date2 = simpleDateFormat.parse("7:30:50"); 
  
        long diffInMilliSeconds  = Math.abs(date2.getTime() - date1.getTime()); 
  
        long diffInHours = (diffInMilliSeconds / (60 * 60 * 1000)) % 24; 
  
        long diffInMinutes  = (diffInMilliSeconds / (60 * 1000)) % 60; 
  
        long diffInSeconds  = (diffInMilliSeconds / 1000) % 60; 
  
        System.out.println( "Difference " + diffInHours+" "+ diffInMinutes+" "+ diffInSeconds); 
	}
}
