package oops;
public class Rectangle1 {
    private int len;
    private int wid;
    public Rectangle1(int len,int wid){
        this.len=len;
        this.wid=wid;
    }
    private int getArea(/*int len,int wid*/){
        return len*wid;
    }
    public static void main(String[] args) {
        Rectangle1 r[] = new Rectangle1[4];
        //r[0]=new Rectangle1(1,2);
        int i=0;
        int l=4,w=5;
        for(Rectangle1 r1:r){
          r[i++]=new Rectangle1(l++,w++);  
        }
        i=0;
        //System.out.println(r[3].getArea()+"");
        for(Rectangle1 r2:r){
            System.out.println(r[i++].getArea());
        }
        
        
        //System.out.println(r[0].getArea()+"");
        
        /*for(Rectangle1 r1:r){
            System.out.println(r.getArea());
        }*/
        
    }
}
