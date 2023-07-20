package Section24;
public class Generics5 <T>{
    T[] t=(T[]) new Object[10];
    int len=0;
    public void append(T v){
        t[len++]=v;
    }
    public void display(){
        for(int j=0;j<len;j++){
            System.out.println(t[j]); 
        }
    }
    public static void main(String[] args) {
       Generics5<Integer> g=new Generics5<>();
       
    }
}
