package Chapter08ObjectsAndClasses.TestObject;

public class TestObject {
	protected static int val = 10;
	protected boolean b;
	private double d = 1;
	protected char c;
	protected String s;
	public TestObject (int val) {
		val = val;
	}
	public TestObject() {
		
	}
	
	public static void testMethod() {
		val = 20;
		//b = true; // can not call instance attributes directive in static methods
		TestObject t = new TestObject();
		t.b = true;
	}
	public static void main(String[]arg) {
		TestObject t = new TestObject();
		System.out.println("d is " + t.d);
	}
}

class Test {
	  public static void main(String[] args) {
	    double radius;
	    final double PI= 3.15169;
	    //double area = radius * radius * PI;
	    //System.out.println("Area is " + area);
	  }
	}
