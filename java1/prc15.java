
package java1;
public class prc15 {
    void sort(int[] nums,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=nums[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=nums[mid+1+j];
        }
        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                nums[k]=l[i];
                i++;
            }
            else{
                nums[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=r[j];
            j++;
            k++;
        }
        
    }
    void mergesort(int[] nums,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);
            sort(nums,l,mid,r);
        }
    }
    public static void main(String[] args) {
        
        prc15 pr=new prc15();
        int[] nums={45,47,22,34,714,84,8};
        pr.mergesort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
