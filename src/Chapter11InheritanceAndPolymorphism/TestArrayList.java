package Chapter11InheritanceAndPolymorphism;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] arg) {
		ArrayList<String> list = new ArrayList<String>();
		List<String> test = new ArrayList<>();
		list.add("Denver");
		list.add("Austin");
		//list.add(new java.util.Date());
		String city = list.get(0);
		//list.set(3, "Dallas");
		//System.out.println(list.get(3));
		list.add("Denver");
		list.add("Austin");
		list.add("Denver");
		list.add("Austin");
		list.add("Denver");
		System.out.println("List before get distinct: ");
		System.out.println(list.toString());
		//System.out.println(city);
		//delete distinct elements from ArrayList
//		for(int i=0; i<list.size(); i++) {
//			for(int j=list.size()-1; j>i; j--) {
//				if(list.get(i).equals(list.get(j))) {
//					list.remove(j);
//				}
//			}
//		}
		ArrayList<String> result = new ArrayList<String>();
		for (int i=0; i < list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
		System.out.println("List after get distinct: ");
		System.out.println(result.toString());
	}
}
