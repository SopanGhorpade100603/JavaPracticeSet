package methods_of_list;

import java.util.ArrayList;
import java.util.List;

/* basically it is Collection(I)method used to keep only
	common elements b/w 2 collections.*/
public class RetainAllMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("Java");
		list.add("Python");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Java");
		list2.add("C++");
		list2.add("Python");
		list.retainAll(list2);
		System.out.println(list);
		
	}

}
