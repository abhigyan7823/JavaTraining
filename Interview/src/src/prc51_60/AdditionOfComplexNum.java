package src.prc51_60;

public class AdditionOfComplexNum {
	double real;
	double img;
	public AdditionOfComplexNum(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}
	public static AdditionOfComplexNum add(AdditionOfComplexNum a, AdditionOfComplexNum b) {
		AdditionOfComplexNum temp = new AdditionOfComplexNum(0.0, 0.0);
		temp.real = a.real+b.real;
		temp.img = b.real+b.img;
		return temp;
	}
	
	public static void main(String[] args) {
		AdditionOfComplexNum num1 = new AdditionOfComplexNum(2.5, 4.5);
		AdditionOfComplexNum num2 = new AdditionOfComplexNum(3.4, 2.6);
		
		AdditionOfComplexNum add = add(num1,num2);
		System.out.printf("%.1f + %.1fi ",add.real,add.img);
	}
	
}
