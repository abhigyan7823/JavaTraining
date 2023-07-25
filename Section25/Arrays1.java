package Section25;
import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        int[] arr={5,1,2,3,4,7,8,9};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println(Arrays.binarySearch(arr, 6));
        
    }
}
