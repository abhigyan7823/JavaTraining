/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abhigyan_bhadoria
 */
public class prc3 {
    public static void main(String[] args){
        String n="10119101";
        if(n.matches("[01]+")){
            System.out.println("binary");
        }
        else if(n.matches("[0-7]+")){
            System.out.println("Octal");
        }
        else if(n.matches("[0-9A-F]+")){
            System.out.println("hexa");
        }
        else if(n.matches("[0-9]+")) System.out.println("decimal");
    }
    
}
