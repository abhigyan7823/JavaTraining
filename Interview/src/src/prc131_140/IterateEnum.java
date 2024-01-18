package src.prc131_140;

import java.util.EnumSet;

enum Color {
    RED,
    GREEN,
    BLUE;
}
public class IterateEnum {
	public static void main(String[] args) {
		EnumSet.allOf(Color.class).forEach(color -> System.out.println(color));
	}
}