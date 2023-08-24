package section4;
interface inf1{
    public void print();
    public void show();
}
public class Anno1 {
    public static void main(String[] args) {
        //inf1 in1=()->System.out.println("print");
        inf1 in2=new inf1(){
            public void print(){
                System.out.println("print");;
            }
            public void show(){
                System.out.println("show");
            }
        };
        //in1.print();
        in2.print();
        in2.show();
    }
}
