package com.optionalclass;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalD04 {

	public static void main(String[] args) {
		ArrayList<Optional<String>> listofCity = new ArrayList<>();
		listofCity.add(Optional.of("hyd"));
		listofCity.add(Optional.of("pune"));
		listofCity.add(Optional.of("Mumbai"));
		listofCity.add(Optional.of("Nagar"));
		listofCity.add(Optional.empty());
		
		for(Optional<String> op : listofCity) {
			if(op.isPresent()) {
				System.out.println(op.get());
			}else{
				System.err.println("value is not available");
			}
		}
		
		
	}

}
