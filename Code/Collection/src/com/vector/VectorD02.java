package com.vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorD02 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
//		adding array into vector 
		int arr[] = {10,20,70,45,12,36};
		for(int ele : arr) {
			v.add(ele);
		}
		
		v.forEach(ele->System.out.println(ele));

//		Collections.sort(v); //old technique
		
//		v.sort((n1,n2)->n1.compareTo(n2));	// new approach  OR
		v.sort((n1,n2)->Integer.compare(n1,n2));
		System.out.println("sorting element: "+v);
		
		System.out.println("minimum element: "+Collections.min(v));
		System.out.println("maximum element: "+Collections.max(v));
		Collections.reverse(v);
		System.out.println("reverse element: "+v.toString());
		
//		Convert Collection to array
		Object[] array = v.toArray();
		System.out.println("Array: "+Arrays.toString(array));
	}

}
