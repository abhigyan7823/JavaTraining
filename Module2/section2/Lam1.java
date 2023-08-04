package section2;
interface Drawable{  
    public void draw();  
}  
public class Lam1 {
    public static void main(String[] args) {
        int width=10;  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw(); 
    }
 
}
