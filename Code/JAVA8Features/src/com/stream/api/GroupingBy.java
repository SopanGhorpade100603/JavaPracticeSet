package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Student1(Integer id, String cName, String name) {
}

public class GroupingBy {
	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "java", "sopan");
		Student1 s3 = new Student1(104, ".Net", "raj");
		Student1 s2 = new Student1(502, "java", "kartik");
		Student1 s4 = new Student1(301, "html", "john");
		Student1 s5 = new Student1(201, ".Net", "Abhi");
		Student1 s6 = new Student1(304, "html", "naman");
		Student1 s7 = new Student1(131, "java", "viraj");

		List<Student1> listOfStudent1s = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
		
		Map<String, List<Student1>> list = listOfStudent1s.stream().collect(Collectors.groupingBy(Student1::cName));
		list.forEach((k,v)->System.out.println(k+" "+v));
	}
}
