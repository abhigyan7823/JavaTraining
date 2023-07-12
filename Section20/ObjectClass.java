package Section20;
public class ObjectClass {
    @Override
    public String toString(){
        return "myObject1";
    }
    public int hashCode(){
        return 1001;
    }
    /*public boolean equals(ObjectClass ob1){
        return ob1.hashCode()==this.hashCode();
    }*/
    public static void main(String[] args) {
        ObjectClass ob=new ObjectClass();
        System.out.println(ob.getClass()+"");
        System.out.println(ob.hashCode()+"");
        System.out.println(ob.toString()+"");
       // System.out.println("");
        ObjectClass ob1=new ObjectClass();
        System.out.println(ob1.equals(ob)+"");
        ObjectClass ob2=ob1;
        System.out.println(ob1.equals(ob2)+"");
        
    }
}
