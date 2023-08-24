package section3;
@FunctionalInterface
interface Draw{
    public void draw();
    //public void draw1();
}
@FunctionalInterface
interface Draw1 extends Draw {
    public void draw();
    //public void draw1();
}
public class Lambda4 {
    public static void main(String[] args) {
      Draw d=()-> System.out.println("drawing");
      d.draw();
      /*Draw1 d1=()-> System.out.println("drawing 1");
      d1.draw1();*/
    }
}
