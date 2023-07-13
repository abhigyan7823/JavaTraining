package Section20;
enum Demo{
    AB("a","b"),BC("b","c"),CD("c","d");
    String first,last;
    private Demo(String first,String last){
        this.first=first;
        this.last=last;
    }
    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
}
public class Enum2 {
    public static void main(String[] args) {
        Demo de=Demo.BC;
        de.display();
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
    }
}
