package oops;

public class Circle {
    int radius;
    double area(int radius){
        return 3.14*radius*radius;
    }
    double perimeter(int radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println(c1.area(5)+"");
        System.out.println(c2.area(4)+"");
        System.out.println(c1.perimeter(0)+"");
        System.out.println(c2.perimeter(1)+"");
    }
}
