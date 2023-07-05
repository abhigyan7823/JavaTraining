package oops;
class Employee{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    String name;
    int id;
    
}
class SoftwareEngineer extends Employee{
    int bonus;
}
public class Inheritance1 {
    public static void main(String[] args) {
        SoftwareEngineer se=new SoftwareEngineer();
        se.setSalary(200000);//=200000;
        se.name="Harry";
        se.id=1001;
        se.bonus=10000;
        System.out.println(se.bonus+" "+se.id+" "+se.getSalary());
        /*Inheritance1 in=new Inheritance1();
        in.setSaray(200);*/
    }
    
}
