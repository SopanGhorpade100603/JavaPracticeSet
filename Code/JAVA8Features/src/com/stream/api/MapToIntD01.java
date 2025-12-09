package com.stream.api;

import java.util.Arrays;
import java.util.List;

/*convert stream of object into intStram doubleStream,longStream*/

public class MapToIntD01 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sun","Orange","Pen","Apple","Nose");
		names.stream().
						mapToInt(str->str.length()).
													forEach(System.out::println);
	}

}
