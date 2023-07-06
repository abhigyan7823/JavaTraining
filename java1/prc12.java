
package java1;
public class prc12 {
    public static void main(String[] args) {
        int[][] mat1=new int[2][2];
        int[][] mat2=new int[2][2];
        int m1=0,m2=4;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                mat1[i][j]=m1++;
                mat2[i][j]=m2++;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println("");
        }
        int[][] ans=new int[2][2];
        for(int r=0;r<2;r++){
            for(int c=0;c<2;c++){
                ans[r][c]=0;
                for(int k=0;k<2;k++){
                    ans[r][c]+=mat1[r][k]*mat2[k][c];
                }
            }
        }
   
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}
