package Chapter11InheritanceAndPolymorphism;

public class TestSimpleGeometricObject {
	public static void main(String[] arg) {
		//implicit casting from subtype to supertype
//		CircleFromSimpleGeometricObject circle1 = new CircleFromSimpleGeometricObject(5);
//		SimpleGeometricObject object1 = circle1;
		//explicit casting from supertype to subtype
		//assign to a subtype variable
		SimpleGeometricObject object2 = new SimpleGeometricObject();
		CircleFromSimpleGeometricObject circle2 = (CircleFromSimpleGeometricObject)object2;
		//explicit casting from supertype to subtype
		//assign to a supertype variable
//		Object object3 = new SimpleGeometricObject();
//		Object circle3 = (CircleFromSimpleGeometricObject)object3;
		//print
		System.out.println(circle2.toString());
		//create subclass object and assign to supertype variable 
//		Object circle1 = new CircleFromSimpleGeometricObject();		
//		Object circle2 = new CircleFromSimpleGeometricObject();
		//print result from the equals methods
//		System.out.println(circle1.equals(circle2));
	}
}
