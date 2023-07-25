package Section25;
import java.io.*;
import java.util.*;
public class PropertiesClass1 {
    public static void main(String[] args) throws Exception{
        FileReader reader=new FileReader("/home/abhigyan_bhadoriya/NetBeansProjects/java1/src/Section25/db");  
        Properties p=new Properties();  
        p.load(reader);  
        System.out.println(p.getProperty("user"));  
        System.out.println(p.getProperty("password"));
        Properties p1=new Properties();  
        p1.setProperty("name","abhi");  
        p1.setProperty("email","abhi@.com");  
        p1.store(new FileWriter("info.properties"),"Practice"); 
    }
}
