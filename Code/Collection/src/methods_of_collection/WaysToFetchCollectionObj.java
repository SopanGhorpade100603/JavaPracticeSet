package methods_of_collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class WaysToFetchCollectionObj {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sopan");
		list.add("Kartik");
		list.add("anurag");
		list.add("Raj");
		list.add("John");
		list.add("Smith");
		list.add("Devid");

//		1.toString() 
		System.out.println("\u001B[31m" + "1.by using ToString");
		System.out.println(list.toString());

		
//		2.Ordinary for loop
		System.out.println("\n" + "\u001B[32m" + "2.by using Ordinary loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		
//		3.forEach loop
		System.out.println("\n" + "\u001B[33m" + "3.by using forEach");
		for (String name : list) {
			System.out.println(name);
		}
		

//		4.Enumeration interface it works only legacy class so convert to vector
		Vector<String> v = new Vector<>(list);
		System.out.println("\n" + "\u001B[34m" + "4.by using Enumeration interface");
		Enumeration<String> ele = v.elements();
		while (ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
		

//		5.Iterator interface	only forward direction
		System.out.println("\n" + "\u001B[35m" + "5.by using Iterator interface");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

//		6.ListIterator interface   provide facility to forward + backward
		System.out.println("\n" + "\u001B[36m" + "by using ListIterator interface");
		ListIterator<String> listItr = list.listIterator();
		
		System.out.println("forward direection");
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
		}

		System.out.println("\u001B[37m" + "backward direction");
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		

//		7.Spliterator interface
		System.out.println("\n" + "\u001B[31m" + "by using Spilterator interface");
		Spliterator<String> splitItr = list.spliterator();
		splitItr.forEachRemaining(System.out::println);
//		while (splitItr.tryAdvance(name -> System.out.println(name))) {}
	
		
//		8.foreach()method
		System.out.println("\n"+"\u001B[32m"+"by using forEach method");
		list.forEach(name->System.out.println(name));
	

//		9. method reference
		System.out.println("\n"+"\u001B[34m"+"by using method refernce");
		list.forEach(System.out::println);
		
		
//		10 stream() method
		System.out.println("\n"+"\u001B[36m"+"by using stream method");
		list.stream().forEach(System.out::println);
		
		
//		11 parallelStream()
		System.out.println("\n"+"\u001B[35m"+"by using parallelStream ");
		list.parallelStream().forEach(System.out::println);
	}
}
