package Chapter11InheritanceAndPolymorphism;

public class Test3 {
	public static void main(String[] arg) {
		// 1 biến kiểu Object không thể gán vào 1 giá trị kiểu tham trị
		//Object[] o1 = new int[50];
		// 1 biến kiểu Object có thể tham chiếu đến bất cứ đối tượng kiểu tham chiếu nào vì mọi class trong Java
		// đều extends class Object
		Object[] o2 = new Integer[50];
		Object[] o3 = new String[50];
		Object[] o4 = new Object[50];
	}
}
