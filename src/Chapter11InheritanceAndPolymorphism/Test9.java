package Chapter11InheritanceAndPolymorphism;

import java.util.ArrayList;

public class Test9 {
	public static void main(String[] arg) {
		ArrayList a = new ArrayList();
		a.add("a1");
		a.add("a2");
		//get Error
		a.set(2, "a3");		
	}
}
