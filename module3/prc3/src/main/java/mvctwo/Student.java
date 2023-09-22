package mvctwo;

public class Student {
	private String fname;
	private String email;
	public Student(String fname, String email) {
		super();
		this.fname = fname;
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
