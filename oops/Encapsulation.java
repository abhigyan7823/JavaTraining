package oops;
public class Encapsulation {
    private String name;
    private int age;
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<=0 || age>125){
            System.out.println("Enter valid Age");
            return ;
        }
        else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Encapsulation st = new Encapsulation();
        st.setName("Harry");
        st.setAge(129);
        System.out.println(st.getName()+" "+st.getAge());
    }
}

