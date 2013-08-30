package Chapter8ObjectsAndClasses.TestObject;

public class Main {
	public static void main(String[]arg) {
		TestObject t = new TestObject();
		System.out.println(t.val);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.s);
		//Main m = new Main();
		System.out.println("Main.t.val = " + Main.t.val);
	}
	static TestObject t = new TestObject();
}
