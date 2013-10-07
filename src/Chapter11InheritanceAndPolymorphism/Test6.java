package Chapter11InheritanceAndPolymorphism;

public class Test6 {
	public static void main(String[] args) {
		A1 a = new A1(3);
	}
}

class A1 extends B1 {
	public A1(int t) {
		System.out.println("A1's constructor is invoked");
	}
}

class B1 {
	public B1() {
		System.out.println("B1's constructor is invoked");
	}
}
