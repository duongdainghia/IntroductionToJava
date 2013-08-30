package Chapter8ObjectsAndClasses.PassingObjectToMethod;

import java.util.Date;
public class Test8 {
public static void main(String[] args) {
Date date = null;
m1(date);
System.out.println(date);
}
public static void m1(Date date) {
date = new Date();
}
}
