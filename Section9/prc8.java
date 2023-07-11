
package java1;

public class prc8 {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){   
            arr[i]=i;
        }
        System.out.println(arr);
        for(int i:arr){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int[] brr=new int[5];
        for(int i:brr){
            brr[i]=i;
        }
        for(int i:brr){
            System.out.print(brr[i]+" ");
        }
    }
}
