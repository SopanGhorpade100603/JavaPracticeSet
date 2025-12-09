package com.stream.api;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*retrieve all the names which starts from Character A using Stream API and 
Convert the Stream into set*/

public class RetrieveNames {

	public static void main(String[] args) {
		List<String> nameOfStudents = List.
				of("Ajay","Sopan","Raj","Ajay","Kartik","Rahul","aryan","Aman");
		
		Set<String> std = nameOfStudents.stream().
								filter(str->str.toLowerCase().startsWith("a")).
														collect(Collectors.toSet());
		std.forEach(System.out::println);
	}

}
