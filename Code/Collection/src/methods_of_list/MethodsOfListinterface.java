package methods_of_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MethodsOfListinterface {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
//		1.isEmpty()
		System.out.println("list is empty?: "+al.isEmpty());
		
//		2.clear()
//		al.clear();
//		System.out.println(al);
		
//		3.int size() to get size of list
		int size = al.size();
		System.out.println("size of list: "+size);
		
//		4.add(int index, E element) to add element based on index
		al.add(2,22);
		System.out.println(al);
		
//		5.addAll(int index,Collection c)
		List<Integer> al2 = new ArrayList<>();
		al2.add(23);
		al2.add(23);
		al2.addAll(1,al);
		System.out.println(al2);

//		6.get(int index) to retrieve/get element based on index
		System.out.println("element at position 2: "+al2.get(2));
		System.out.println("element at position 4: "+al2.get(4));

//		7.set(int index, object o) to override or replace the existing element
		al.set(0, 25);
		System.out.println("override oth index ele: "+al);
		
//		8.remove(int index) 
		al.remove(3);
		System.out.println("after removing 3rd index element: "+al);
	
//		9.remove(object obj)
		al.remove((Integer)25);
		System.out.println("after removing object 25 ele: "+al);
		
//		10.iterator()
		System.out.println();
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nlistIterator: forward direction");
//		11. listIterator()
		ListIterator<Integer> listItr = al.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("\nlistIterator backward direction: ");

		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
	}
}
