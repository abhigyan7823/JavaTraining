package src.prc101_110;

@FunctionalInterface
interface TestInterface {
	boolean Test(int a);
}

class Test{
	static boolean check(TestInterface t, int b) {
		return t.Test(b);
	}
}

public class LambdaExpression {
	public static void main(String[] args) {
		System.out.println(Test.check((a) -> a%2 == 0, 11));
	}
}
