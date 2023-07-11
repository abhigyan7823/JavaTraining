/*package java1;
public class prc18 {
    static void print(int...b){
        System.out.println("print");
    }
    public static void main(String[] args) {
        print(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
    }
}*/
public class prc18{
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int...a){
        return a[0]+a[1]+a[2]+a[3]+a[4];
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2)+" ");
        System.out.println(sum(1,2,3)+" ");
        System.out.println(sum(1,2,3,4,5)+" ");
    }
}
