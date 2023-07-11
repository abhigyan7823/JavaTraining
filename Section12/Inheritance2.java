package OOPS;
class Employee{
    private String name;
    private int salary;
    private int id;
    public Employee(String name,int salary,int id){
        this.name =name;
        this.id=id;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
class SoftwareEngineer extends Employee{
    private int bonus;
    public SoftwareEngineer(int bonus){
        //super(name,salary,id);
        super("Harry",400,1001);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }
    
}
public class Inheritance2 {
    public static void main(String[] args) {
        SoftwareEngineer sw=new SoftwareEngineer(2000);
        System.out.println(sw.getSalary()+" "+sw.getBonus()+" ");
    }
}
