package Chapter01ProgrammingStyleAndDocumentation;

public class apples {
	public static void main(String arg[]){		
		System.out.println("    J    A    V     V    A");
		System.out.println("    J   A A    V   V    A A");
		System.out.println("J   J  AAAAA    V V    AAAAA");
		System.out.println(" J J  A     A    V    A     A");
		
		//Compute expression
		System.out.println((9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5));
		//Sum of a series
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		//Approximate pi
		System.out.println(4*(1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11));
		System.out.println(4*(1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
		double radius = 5.5;
		System.out.print("circle perimeter: ");
		System.out.println(2 * radius * 3.14);
		System.out.print("circle area: ");
		System.out.println(radius * radius * 3.14);
		double height = 7.9;
		double width = 4.5;
		System.out.print("rectangle area: ");
		System.out.println(width * height);
		System.out.print("average speed in miles: ");
		double time = 45.5;
		double km = 14.0;
		double mile = km / 1.6;
		System.out.println(mile / time * 60);
		int current = 312032486;
		int sec = 5 * 365 * 24 * 3600;
		System.out.println(sec);
		System.out.print("American population in the next 5 years: ");
		System.out.println(current + (sec / 7) + (sec / 45) - (sec / 13));
		System.out.println((24 * 1.6 / 100.51) * 60);
	}
}
