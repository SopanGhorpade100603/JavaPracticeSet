
package com.sortedset_treeset;

import java.util.TreeSet;

record Employee(Integer id,String name,Double salary)  {


}
public class TreeSetD04 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<>((l1,l2)->l1.name().compareTo(l2.name()));
		ts.add(new Employee(333, "Soapn", 15000D));
		ts.add(new Employee(111, "Kartik", 12000D));
		ts.add(new Employee(222, "Anurag", 17000D));
		System.out.println("original");
		ts.forEach(System.out::println);
		
		System.out.println();
		TreeSet<Employee> ts1 = new TreeSet<>((l1,l2)->l1.name().compareTo(l2.name()));
		ts1.add(new Employee(333, "Soapn", 15000D));
		ts1.add(new Employee(111, "Kartik", 12000D));
		ts1.add(new Employee(222, "Anurag", 17000D));
		System.out.println("Based on name");
		ts1.forEach(System.out::println);

		System.out.println();
		TreeSet<Employee> ts2 = new TreeSet<>((l1,l2)->l1.salary().compareTo(l2.salary()));
		ts2.add(new Employee(333, "Soapn", 15000D));
		ts2.add(new Employee(111, "Kartik", 12000D));
		ts2.add(new Employee(222, "Anurag", 17000D));
		System.out.println("Based on salary");
		ts2.forEach(System.out::println);
		
	}

}
