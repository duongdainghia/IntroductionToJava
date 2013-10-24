package Chapter11InheritanceAndPolymorphism;

public class TestSimpleGeometricObject {
	public static void main(String[] arg) {
		//implicit casting from subtype to supertype
//		CircleFromSimpleGeometricObject circle1 = new CircleFromSimpleGeometricObject(5);
//		SimpleGeometricObject object1 = circle1;
		//explicit casting from supertype to subtype
		//assign to a subtype variable
		Object object2 = new CircleFromSimpleGeometricObject();
		Object circle2 = (CircleFromSimpleGeometricObject)object2;
		Object object3 = new CircleFromSimpleGeometricObject(3);
		SimpleGeometricObject circle3 = (SimpleGeometricObject)object3;
		Object object4 = new CircleFromSimpleGeometricObject(4);
		CircleFromSimpleGeometricObject circle4 = (CircleFromSimpleGeometricObject)object4;
		//explicit casting from supertype to subtype with real type is superclass
		//assign to a supertype variable
		//ClassCastException occur when print circle5
		Object object5 = new SimpleGeometricObject();
		CircleFromSimpleGeometricObject circle5 = (CircleFromSimpleGeometricObject)object5;
		//print
		System.out.println(circle3.toString());
		circle4.printCircle();
		//create subclass object and assign to supertype variable 
//		Object circle1 = new CircleFromSimpleGeometricObject();		
//		Object circle2 = new CircleFromSimpleGeometricObject();
		//print result from the equals methods
//		System.out.println(circle1.equals(circle2));
	}
}
