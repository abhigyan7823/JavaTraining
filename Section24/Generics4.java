package Section24;
import java.util.Arrays;
import java.util.List;
public class Generics4 {
    static void print(List<?> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
        print(list1);
	print(list2);
    }
}
