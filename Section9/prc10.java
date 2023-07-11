
package java1;
public class prc10 {
    public static void main(String[] args) {
        /*int[][] matrix=new int[5][5];
        int k=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=k++;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("  ");
        }
        
        for(int[] i:matrix){
            for(int j:i){
                   System.out.print(j+" ");
            }
            System.out.println("   ");
        }*/
        int[][] mat={{1,2,3},{4,5},{9,4,5,7}};
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
