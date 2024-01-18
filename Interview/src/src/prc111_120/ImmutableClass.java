package src.prc111_120;

final class Employee { 
	
	private final String name;

	public String getName() {
		return name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
}

public class ImmutableClass {
	public static void main(String[] args) {
		Employee ep = new Employee("Luffy");
		System.out.println(ep);
	}
}
