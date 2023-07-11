
package java1;
public class prc9 {
    static void insert(int[] nums,int n,int pos,int data){
        for(int i=n-1;i>=pos;i--){
            nums[i+1]=nums[i];
        }
        n++;
        nums[pos]=data;
        //System.out.println(nums[n]);
        for(int j=0;j<n;j++){
            System.out.print(nums[j]+" ");
        }
    }
    static void delete(int[] nums,int n,int pos){
        for(int i=pos;i<n;i++){
            nums[i]=nums[i+1];
        }
        
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        //int[] arr={2,4,6,8,9,10};
        int[] nums = new int[5];
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            nums[i]=i*2;
        }
        for(int i=0;i<n-1;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
        int pos=1,data=1;
        insert(nums,n-1,pos,data);
        System.out.println(" ");
        delete(nums,n-1,pos);
    }
}
