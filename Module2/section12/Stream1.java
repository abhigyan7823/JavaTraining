package section12;

import java.util.*;
import java.util.stream.*;

public class Stream1 {
    public static void main(String[] args) {
        String[] name = {"Luffy", "Zoro", "Nami", "Ussop", "Sanji", "Robin", "Chopper Chopper"};
        List<String> al = Arrays.asList(name);
        System.out.println(al);
        List<String> l1 = al.stream().filter(s -> s.length() <= 4).collect(Collectors.toList());
        System.out.println(l1);
        int count=(int)al.stream().filter(s->s.length() <=4).count();
        System.out.println(count);
        List<String> l3 = al.stream().filter(s -> s.length() < 5).map(s -> s + " ").collect(Collectors.toList());
        System.out.println(l3);
        List<String> l4=al.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l4);
        List<String> l5=al.stream().sorted().collect(Collectors.toList());
        System.out.println(l5);
    }      
}
