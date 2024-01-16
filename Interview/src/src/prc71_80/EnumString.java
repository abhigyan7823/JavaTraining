package src.prc71_80;

public class EnumString {
    public enum TextStyle {
        BOLD, ITALICS
    }

    public static void main(String[] args) {
        String style = "Bold";
        TextStyle textStyle = TextStyle.valueOf(style.toUpperCase());
        System.out.println(textStyle);
    }

}
