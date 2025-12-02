package methods_of_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodsOfMapToConvertIntoCollection {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Sopan", 10);
		m.put("Raj", 20);
		m.put("Kartik", 30);
		m.put("Anurag", 40);
		m.put("Abhi", 50);

//	1.keySet() to convert keys into set
		Set<String> keySet = m.keySet();
		System.out.println(keySet);

//	2.values() convert values into Colletion
		Collection<Integer> values = m.values();
		System.out.println(values);

//	3.entrySet() convert key and value both in a single object
		System.out.println();
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}		

	}

}
