package OOPS;
public class Encapsulation1 {
    private int length;
    private int width;
    public Encapsulation1(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int getlength(){
        return length;
    }
    public int getwidth(){
        return width;
    }
    public int getArea(){
        return length*width;
    }
    
    
    public static void main(String[] args) {
        Encapsulation1  e1=new Encapsulation1(4,2);
        System.out.println(e1.getArea()+"");
        
    }
}
