package com.practice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumberRemove {
	public static void main(String[] args) {
		int arr [] = {2,2,3,3,3,4,5,5};
		
		Arrays.stream(arr).
						boxed().
								distinct().
											forEach(System.out::println);
		
//		another approach
//		Set<Integer> collect = Arrays.stream(arr).
//												boxed().
//														collect(Collectors.toSet());
//								 				
//		System.out.println(collect);
		 
		
//		another approach
	       /* Set<Integer> set = new HashSet<>();
	        for(Integer ele: arr){
	            set.add(ele);
	        }
	        System.out.println(set);
	        */
	        
	}

}
