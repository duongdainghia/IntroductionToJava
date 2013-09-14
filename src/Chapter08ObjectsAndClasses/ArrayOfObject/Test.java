package Chapter08ObjectsAndClasses.ArrayOfObject;

public class Test {
public static void main(String[] args) {
	java.util.Date[] dates = new java.util.Date[10];
	System.out.println(dates[0]);
	//NullPointerException with Date obj
	System.out.println(dates[0].toString());
}
}