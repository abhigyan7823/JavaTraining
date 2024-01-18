package src.prc111_120;

class Student {
	private String name;
	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}
public class PrintObject {
	public static void main(String[] args) {
		Student st = new Student("Luffy");
		System.out.println(st);
	}
}
