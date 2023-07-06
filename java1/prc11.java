
package java1;
public class prc11 {
    static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    static int secondmax(int[] nums){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
            }
            /*else if(nums[i]>max2){
                max2=nums[i];
            }*/
            
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] nums={4,4,61,714,11,14,47,4};
        System.out.println(max(nums)+" ");
        System.out.println(secondmax(nums)+"");
    }
}
