package Chapter11InheritanceAndPolymorphism;

public class Test2 {
	public static void main(String[] args) {
		C c = new C();
		c.p(10);
		c.p(10.0);
	}
}
class D {	
	public void p(double i) {
		System.out.println(i * 2);
	}
}
class C extends D {
	// This method overloads the method in B2
	public void p(int i) {
		System.out.println(i);
	}
}