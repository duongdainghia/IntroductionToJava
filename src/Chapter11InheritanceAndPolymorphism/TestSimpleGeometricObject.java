package Chapter11InheritanceAndPolymorphism;

public class TestSimpleGeometricObject {
	public static void main(String[] arg) {
		CircleFromSimpleGeometricObject circle1 = new CircleFromSimpleGeometricObject(5);
		SimpleGeometricObject object1 = circle1;
		SimpleGeometricObject object2 = new SimpleGeometricObject();
		CircleFromSimpleGeometricObject circle2 = (CircleFromSimpleGeometricObject)object2;
		Object object3 = new SimpleGeometricObject();
		Object circle3 = (CircleFromSimpleGeometricObject)object3;
		CircleFromSimpleGeometricObject circle4 = (CircleFromSimpleGeometricObject)object3;
		System.out.println(circle2.toString());		 
	}
}
