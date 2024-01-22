package src.prc151_160;

class Student{
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private void print() {
		System.out.println("Hello");
	}
	public void display() {
		print();
	}
}

public class PrivateMember {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(1);
		System.out.println(st.getId());
		st.display();
	}
}
