package Section21;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author abhigyan_bhadoria
 * @since 2023
 */
@Target(value={ElementType.LOCAL_VARIABLE,ElementType.METHOD})
@interface MyAnno{
    String name();
    String project();
}

class Student {
    /**
     * @default value 10
     */
    @MyAnno(name="abhi",project="Student mang..")
    final int def=101;
    String name;
    char section;
    int rollno;
    int maths;
    int chemistry;
    int physics;
    /**
     * parameterized constructor
     * @param name
     * @param section
     * @param rollno
     * @param maths
     * @param physics
     * @param chemistry 
     */
    Student(String name, char section, int rollno, int maths,int physics,int chemistry){
        this.name=name;
        this.section=section;
        this.rollno=rollno;
        this.maths=maths;
        this.physics=physics;
        this.chemistry=chemistry;
    }
    /**
     * calculate total
     * @param a
     * @param b
     * @param c
     * @return 
     */
    @MyAnno(name="abhi",project="Student mang..")
    int total(int a,int b,int c){
        return a+b+c;
    }
    /**
     * calculate average 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    double average(int a,int b,int c){
        int to=total(a,b,c);
        return to/3;
    }
    /**
     * calculate grade
     * @param a
     * @param b
     * @param c
     * @return 
     */
    char grade(int a,int b,int c){
        double avg=average(a,b,c);
        if(avg>=60) return 'A';
        else    return 'B';
    }
    /**
     * display details 
     */
    @Deprecated
    void display(){
        System.out.println(name+"      "+section+"  "+rollno+"  "+total(maths,chemistry,physics)+"  "+average(maths,chemistry,physics)+"  "+grade(maths,chemistry,physics));
    }
}
public class Annotations1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Student s1=new Student("Harry",'A',1,85,82,71);
        //double avg=s1.average(s1.maths,s1.chemistry,s1.physics);
        //System.out.println(s1.name+"  "+s1.section+"  "+s1.roll_no+"  "+s1.total(s1.maths,s1.chemistry,s1.physics)+"  "+s1.average(s1.maths,s1.chemistry,s1.physics)+"  "+s1.grade(s1.maths,s1.chemistry,s1.physics));
        s1.display();
        Student s2=new Student("Ron",'A',2,35,35,35);
        s2.display();
        Student s3=new Student("Hermione",'A',3,85,89,75);
        s3.display();
        @MyAnno(name="abhi",project="Student mang..")
        int a=2;
    }
}
