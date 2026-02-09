package methods_of_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C");
		list.add("Python");
		list.add("C++");
		
		list.remove(1);	//index
		list.remove("C++"); //obj
		System.out.println(list);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		numbers.sort((n1,n2)->n2.compareTo(n1));
		System.out.println(numbers);
		
		numbers.remove(2);
		numbers.remove(Integer.valueOf(40));
		System.out.println(numbers);
		
	}

}
