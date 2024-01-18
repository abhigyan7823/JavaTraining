package src.prc121_130;

interface A {
	void method1();
}

interface B {
	void method2();
}
public class MultipleInheritance implements A,B {

	@Override
	public void method2() {
		System.out.println("Method2");
	}

	@Override
	public void method1() {
		System.out.println("Method1");
	}
	
	public static void main(String[] args) {
		MultipleInheritance ml = new MultipleInheritance();
		ml.method1();
		ml.method2();
	}
	
}
