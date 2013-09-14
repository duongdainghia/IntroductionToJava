package Chapter02ElementaryProgramming;
 // Scanner is in the java.util package
import java.util.Scanner;
import java.math.*;
import javax.swing.JOptionPane;
public class examples {
public static void main(String[] args) {
	// Create a Scanner object
	//Scanner input = new Scanner(System.in);
	//Prompt the user to enter a radius
	//System.out.print("Enter 3 numbers: ");
	//double num1 = input.nextDouble();
	//double num2 = input.nextDouble();
	//double num3 = input.nextDouble();
	// Compute area
	//double average = (num1 + num2 + num3) / 3;
	
	// Display results
	 //System.out.println("The average of " +
	 //num1 + ", " + num2 + ", " + num3 + " is " + average);
	 final int SIZE = 20; //constant
	 int newNumbers; //variable
	 double miles = 100;
	 final double KILOMETERS_PER_MILE = 1.609;
	 double kilometers = miles * KILOMETERS_PER_MILE;
	 System.out.println(kilometers);
	 System.out.println(56 % 6);
	 System.out.println(78 % -4);
	 System.out.println(-34 % 5);
	 System.out.println(-34 % -5);
	 System.out.println(5 % 1);
	 System.out.println(1 % 5);
	 System.out.println((2+100)%7);
	 System.out.println(25.0/4);
	 System.out.println("3 * 2/4 is " + 3 * 2 / 4);
	 System.out.println("3.0 * 2/4 is " + 3.0 * 2 / 4);
	 System.out.println(Math.pow(2, 3.5));
	 int m,r;
	 m = 5;
	 r = 9;
	 System.out.println(m*Math.pow(r, 2));
	 System.out.println("Casting int to byte: ");
	 int i = 100;
	 byte b = (byte)i;
	 System.out.println(b);
	 System.out.println("Casting int to float: ");
	 int n = 100000;
	 float f = n;
	 System.out.println(f);
	 System.out.println("Casting double to int: ");
	 double d = 123.456;
	 int z = (int)d;
	 System.out.println(z);
	 System.out.println("Casting double to float: ");
	 double d2 = 1234567.899999;
	 float f2 = (float)d2;
	 System.out.println(f2);
	 System.out.println("Casting float to int: ");
	 float f3 = 12.5F;
	 int i3 = (int)f3;
	 System.out.println("f is " + f3);
	 System.out.println("i is " + i3);
	 System.out.println(1185 / 100); 
	 /*JOptionPane.showMessageDialog(null,
	 "\u6B22\u8FCE \u03b1 \u03b2 \u03b3",
	 "\u6B22\u8FCE Welcome",
	 JOptionPane.INFORMATION_MESSAGE);*/
	 System.out.println("Increment operator with char:");
	 char text = 'x';
	 System.out.println(++text);	 
	 char ch = (char) 130;	 
	 System.out.println("Casting float into char:");
	 System.out.println(ch);
	 int in = '\uFFF4';
	 System.out.println("Casting char into float:");
	 System.out.println(in);
	 System.out.println("Numeric operator with char:");	 
	 int t = '6' + '8';
	 System.out.println("'6' + '8' = " + t);
	 int t2 = 2 + 'a';
	 System.out.println("2 + 'a' = " + t2);
	 System.out.println(t2 + " is the Unicode for character " + (char) t2);
	 System.out.println("uppercase of z is " + (char)('A' + ('z' - 'a')));
	 System.out.println("ASCII of 1 is " + (int)'1');
	 System.out.println("ASCII of A is " + (int)'A');
	 System.out.println("ASCII of B is " + (int)'B');
	 System.out.println("ASCII of a is " + (int)'a');
	 System.out.println("ASCII of b is " + (int)'b');
	 System.out.println("character of 40 is " + (char)40);
	 System.out.println("character of 59 is " + (char)59);
	 System.out.println("character of 79 is " + (char)79);
	 System.out.println("character of 85 is " + (char)85);
	 System.out.println("character of 90 is " + (char)90);
	 System.out.println("character of hexadecimal 40 is " + (char)'\u0040');
	 System.out.println("character of hexadecimal 5A is " + (char)'\u005A');
	 System.out.println("character of hexadecimal 71 is " + (char)'\u0071');
	 System.out.println("character of hexadecimal 72 is " + (char)'\u0072');
	 System.out.println("character of hexadecimal 7A is " + (char)'\u007A');
	 System.out.println("Java is \"fun\"\\");
	 System.out.println((int)'1');
	 System.out.println((int)('1' + '2' * ('4' - '3') + 'b' / 'a'));
	 System.out.println((int)'a');
	 System.out.println((char)90);
	 System.out.println((int)'A');
	 float f1 = 1000.34f;
	 System.out.println((int)f1);
	 double d5 = 1000.34; 
	 System.out.println((int)d5);
	 System.out.println((char)97);
	 char x6 = 'a';
	 char x7 = 'c';
	 System.out.println(++x6);
	 System.out.println(x7++);
	 System.out.println(x6 - x7);
	 /*Scanner input2 = new Scanner(System.in);
	 System.out.println("Enter three words seperated by spaces: ");
	 String s1 = input2.next();
	 String s2 = input2.next();
	 String s3 = input2.next();
	 System.out.println("s1 is " + s1);
	 System.out.println("s2 is " + s2);
	 System.out.println("s3 is " + s3);
	 Scanner input3 = new Scanner(System.in);
	 System.out.println("Enter a line: ");
	 String s4 = input3.nextLine();
	 System.out.println("The line entered is " + s4);*/
	 System.out.println("\"1\" + 1 is " + ("1" + 1));
	 System.out.println("'1' + 1 is " + ('1' + 1));
	 System.out.println("\"1\" + 1  + 1 is " + ("1" + 1 + 1));
	 System.out.println("\"1\" + (1 + 1) is " + ("1" + (1 + 1)));
	 System.out.println("'1' + 1 + 1 is " + ('1' + 1 + 1));
	 System.out.println("1 + \"Welcome \" + 1 + 1 is " + 1 + "Welcome " + 1 + 1);
	 System.out.println("1 + \"Welcome \" + (1 + 1) is " + 1 + "Welcome " + (1 + 1));
	 System.out.println("1 + \"Welcome \" + ('\u0001' + 1) is " + 1 + "Welcome " + ('\u0001' + 1));
	 System.out.println("1 + \"Welcome \" + 'a' + 1 is " + 1 + "Welcome " + 'a' + 1);
	 System.out.println("1 + \"Welcome \" + ('a' + 1) is " + 1 + "Welcome " + ('a' + 1));	 
	 //Overflow
	 int s = 10000 * 10000 * 10000;
	 System.out.println("Overflow value of 1.000.000.000.000 in int type is " + s);
	 System.out.println("-24 % -5 is "+ -24 % -5);
	 System.out.println("4 raised to the power of 1/2 is " + Math.pow(4, 1.0/2));	 
	 int x = 1;
    int y = x + x++;
    System.out.println("y is " + y);
    System.out.println((int)5.6);
    int t1 = (int)4.5;
    System.out.println('z' - 'a');
    char c = 100;
    System.out.println('3' + '2' + 'm' / 'n');
    int rs = '3' + '2' + 'm' / 'n';
    System.out.println(rs);
    System.out.println("Java "+1+2+3);
    System.out.println(Math.pow(2, 4));
    
}
}