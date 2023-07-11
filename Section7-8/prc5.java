/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;
public class prc5 {
    public static void main(String[] args){
        int n=12;
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+"-->");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
        int i=1;
        a=0;
        b=1;
        while(i<=n){
            System.out.print(a+"-->");
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}
