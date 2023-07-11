/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;

/**
 *
 * @author abhigyan_bhadoriya
 */
public class NewClass {
    public static void main(String[] args){
        String str = new String("Not Yeet");
        /*System.out.println(str.matches("(.*)ee(.*)"));
        System.out.println(str.matches("(.*)oY(.*)"));
        System.out.println(str.matches("Not"));
        System.out.println(str.matches("Not Yeet"));
        System.out.println(str.matches("N(.*)"));
        System.out.println(str.matches("(.*)t"));*/
        System.out.println(str.matches(".*[1-9].*"));
        System.out.println(str.matches(".*[a-z].*"));
        System.out.println(str.matches(".*[a-z]"));
        System.out.println(str.matches("[a-z].*"));
    }  
}
