package src.prc81_90;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class SortListByPropertie {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1,"Luffy"));
		students.add(new Student(2,"Zoro"));
		students.add(new Student(3,"Nami"));
		students.add(new Student(4, "Sanji"));
		
		List<Student> list = students.stream().sorted((a,b) -> a.getName().compareTo(b.getName()))
				.toList();
		System.out.println(list);
	}
	
}
