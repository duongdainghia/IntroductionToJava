package Chapter11InheritanceAndPolymorphism;

public class Test8 {
	public static void main(String[] arg) {
		Object o1 = new Object();
	    Object o2 = new Object();
	    System.out.println((o1==o2) + " " + o1.equals(o2));
	    String s1 = new String("Java");
	    String s2 = new String("Java");
	    //check where s1 and s2 reference to the same object
	    System.out.println((s1 == s2) + 
	    					" " + 
		//check where s1 object value equal to s2 object value
    						(s1.equals(s2)));
	}
}
