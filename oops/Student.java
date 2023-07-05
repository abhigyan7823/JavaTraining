package oops;
public class Student {
    String name;
    char section;
    int rollno;
    int maths;
    int chemistry;
    int physics;
    Student(String name, char section, int rollno, int maths,int physics,int chemistry){
        this.name=name;
        this.section=section;
        this.rollno=rollno;
        this.maths=maths;
        this.physics=physics;
        this.chemistry=chemistry;
    }
    int total(int a,int b,int c){
        return a+b+c;
    }
    double average(int a,int b,int c){
        int to=total(a,b,c);
        return to/3;
    }
    char grade(int a,int b,int c){
        double avg=average(a,b,c);
        if(avg>=60) return 'A';
        else    return 'B';
    }
    void display(){
        System.out.println(name+"      "+section+"  "+rollno+"  "+total(maths,chemistry,physics)+"  "+average(maths,chemistry,physics)+"  "+grade(maths,chemistry,physics));
    }
    public static void main(String[] args) {
        Student s1=new Student("Harry",'A',1,85,82,71);
        //double avg=s1.average(s1.maths,s1.chemistry,s1.physics);
        //System.out.println(s1.name+"  "+s1.section+"  "+s1.roll_no+"  "+s1.total(s1.maths,s1.chemistry,s1.physics)+"  "+s1.average(s1.maths,s1.chemistry,s1.physics)+"  "+s1.grade(s1.maths,s1.chemistry,s1.physics));
        s1.display();
        Student s2=new Student("Ron",'A',2,35,35,35);
        s2.display();
        Student s3=new Student("Hermione",'A',3,85,89,75);
        s3.display();
    }
}
