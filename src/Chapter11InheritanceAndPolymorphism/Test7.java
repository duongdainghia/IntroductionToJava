package Chapter11InheritanceAndPolymorphism;

public class Test7 {

	public static void main(String[]arg) {
		C2 c2 = new C2();
		C3 c3 = new C3();
		c2 = (C2)((C1)c3);		
	}
}

class C1 {}
class C2 extends C1 {}
class C3 extends C1 {}