package com.vector;

import java.util.Vector;

//Store some manager Object, sort the Object based on ID, filter all the manager
//Object whose salary is > 50000

record Manager(Integer id, String name, Double salary) {

}

public class VectorD07 {

	public static void main(String[] args) {
		Vector<Manager> listofManagers = new Vector<>();
		listofManagers.add(new Manager(323, "Sopan", 56000D));
		listofManagers.add(new Manager(121, "kartik", 66000D));
		listofManagers.add(new Manager(212, "raj", 52000D));
		listofManagers.add(new Manager(512, "john", 40000D));
		listofManagers.add(new Manager(412, "smith", 44000D));

		listofManagers.sort((m1, m2) -> m1.id().compareTo(m2.id()));
		listofManagers.forEach(System.out::println);

		System.out.println("\u001B[33m" + "\nmanager whose having salary greter than 50K");
		listofManagers.forEach(man -> {
			if (man.salary() >= 50000) {
				System.out.println(man);
			}
		});

	}

}
