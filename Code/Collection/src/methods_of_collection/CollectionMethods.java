package methods_of_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class CollectionMethods {
	public static void main(String[] args) {
		Collection v = new Vector();
//		1.add() Method
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		
		Collection v2 = new Vector();
//		2.addAll(Collection c) method
		v2.add(22);
		v2.addAll(v);
		System.out.println(v2);
		
//		3.retainAll to return common element
		v2.retainAll(v);
		System.out.println("common ele: "+v2);

//		4.removeAll  to remove all element
//		v.removeAll(v2);
//		System.out.println(v);

//		5.remove(Object ele) delete an element obj from collection
		v2.remove((Integer)20);
		System.out.println("After remove 20 obj ele: "+v2);

//		6.size() to find size of collection return type is int
		int size = v2.size();
		System.out.println("size of collection: "+size);

//		7.clear() to delete all elements 
		v2.clear();
		System.out.println(v2);

		ArrayList<Integer> c = new ArrayList();
		c.add(5);
		c.add(7);
		c.add(10);
		c.add(22);
		c.add(43);
		c.add(25);
		c.add(20);
		
//		8.removeIf(Predicate<T>p) remove element based on given predicate boolean expression
		System.out.println("after adding new ele: "+c);

		c.removeIf(ele -> ele % 5 == 0);
		System.out.println("apple removeIf(): "+c);

//		9.contains(object obj) to serach obj in collection return type is boolean
		boolean is22available = c.contains(22);
		System.out.println("22 available in collection: "+is22available);
		System.out.println("25 available in collection: "+c.contains(25));

	}

}
