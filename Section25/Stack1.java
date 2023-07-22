package Section25;
import java.util.Stack;
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        while(!st.empty()){
            System.out.print(st.pop()+" ");
        }
        System.out.println(st.isEmpty());
        //System.out.println(st.peek());
    }
}
