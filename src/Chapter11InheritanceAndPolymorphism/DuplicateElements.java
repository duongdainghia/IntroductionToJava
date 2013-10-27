package Chapter11InheritanceAndPolymorphism;

import java.util.ArrayList;

public class DuplicateElements {
	public static void main(String[] arg) {
		ArrayList a = new ArrayList();
		a.add("Hanoi");
		a.add("Saigon");
		a.add("Hanoi");
		a.add("Saigon");
		a.add("Hanoi");
		a.add("Saigon");
		ArrayList result = new ArrayList();
//		for(int i = 0; i < a.size(); i++) {
//			if(!result.contains(a.get(i))){
//				result.add(a.get(i));
//			}
//		}
//		System.out.println(result);
		for(int i = 0; i < a.size(); i++) {
			for(int j = a.size() - 1; j > i; j--) {
				if ((a.get(i)).equals(a.get(j))) {
					a.remove(j);					
				}
			}
		}
		System.out.println(a);
		//ArrayList<Double> list = new ArrayList<>(); list.add(3.0);
	}
}
