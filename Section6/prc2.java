/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;
public class prc2{ 
        public static void main(String[] args){
            String s1=new String("abhi");
            String s2="abhi";
            String s3="abhi";
            System.out.println(s1==s2);
            System.out.println(s3==s2);
            System.out.println(s1.equals(s2));
            System.out.println(s2.equals(s3));
            
            String str = "Captain Yami";
            System.out.println(str.toUpperCase());
            System.out.println(str.toLowerCase());
            System.out.println(str.substring(3,6));
            System.out.println(str.replace('n','u'));
            System.out.println(str.replace('u','n'));
            String str2="Black Bulls";
            System.out.println(str.concat(str2));
            String str3="bu";
            System.out.println(str2.contains(str3));
            System.out.println(str2.matches("bs"));
            System.out.println(str2.matches("Bu"));
            System.out.println(str2.matches("^z"));
            System.out.println(str2.matches("B|l"));
            System.out.println(str2.matches("[a-zA-Z]"));
            //System.out.println(str2.matches("(.*)ll(.*)"));
            
            
    }
    
}
