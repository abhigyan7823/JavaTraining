package Section20;
enum Demo{
    A,B,C,D,E;
}
public class Enum1 {
    public static void main(String[] args) {
        Demo d1=Demo.A;
        System.out.println(d1);
        System.out.println(Demo.B);
        for(Demo i:Demo.values()){
            System.out.print(i+"  ");
        }
        switch(d1){
            case A:
                System.out.println("A");
                break;
            case B:
                System.out.println("B");
                break;
            case C:
                System.out.println("C");
                break;
        }
    }
}
