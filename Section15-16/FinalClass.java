package OOPS;
final class FClass{
  final void display() {
    System.out.println("FClass");
  }
}
class FClass2 extends FClass {
  public void display() {
    System.out.println("FClass 2");
  }
}
public class FinalClass{
    public static void main(String[] args) {
        FClass2 f = new FClass2();
        f.display();
        final int a=5;
        a=6;
        a++;
    }
}
