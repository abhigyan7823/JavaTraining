
package java1;
public class prc13 {
    static int update(int x){
        x=8;
        return x;
    }
    static void up(int x){
        x=2;
    }
    static void up(int[] num){
        num[2]=0;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(update(a)+"");
        int b=3;
        up(b);
        System.out.println(b+"");
        int[] arr={1,11,4,45,4};
        up(arr[3]);
        System.out.println(arr[3]+" ");
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        up(arr);
        System.out.println(arr[2]+" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
