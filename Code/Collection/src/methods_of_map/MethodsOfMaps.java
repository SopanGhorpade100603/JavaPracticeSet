package methods_of_map;

import java.util.HashMap;
import java.util.Map;

public class MethodsOfMaps {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();

//		1.put(Object key, Object value)
		m.put("Soapn", "Sambhajinagar");
		m.put("Kartik", "Amravati");
		m.put("Raj", "Pune");

//		m.forEach((key,value)->System.out.println(key+" "+value));

//		2.putIfAbsent(Object key, Object value) insert an entry only key is unique not available
		m.putIfAbsent("Rahul", "Mumbai");
		m.putIfAbsent("Sopan", "Hyd");
		m.forEach((key, value) -> System.out.println(key + " " + value));

//		3.get(Object key) if key is present return corresponding value else return null
		String value = m.get("Sopan");
		System.out.println("city is: " + value);

//		4.getOrDefault(Object key, Object DefaultValue) to avoid null value introduce in jdk 1.8
		String orDefault = m.getOrDefault("Sopaan", "not available");
		System.out.println(orDefault);

//		5.containsKey(Object key) to search a particular key
		boolean containsKey = m.containsKey("Raj");
		System.out.println("raj key is available: "+containsKey);
		boolean containsKey2 = m.containsKey("raja");
		System.out.println("raja key is available: "+containsKey2);
		
//		6.containValue(Object value) to search a particular value
		boolean containsValue = m.containsValue("Pune");
		System.out.println("Pune value is available: "+containsValue);
		
//		7.size()
//		System.out.println(m.size());
		
//		8.remove(Object key) one complete entry will be removed
//		String remove = m.remove("Raj");
//		System.out.println(remove);
//		System.out.println(m.size());
		
//		9.clear()  to clear the map
//		m.clear();
//		System.out.println(m);
		
//		10.isEmpty() to verify map is emptyor not
//		boolean empty = m.isEmpty();
//		System.out.println(empty);
		
//		11.putAll(map m) merging of two map
		
//		12.forEach(BiConsumer<T,U> con) used to fetch key and value from map jdk 1.8
		System.out.println();
		m.forEach((name,city)->System.out.println(name+" "+city));

//		13.computeIfAbsent(k key,function<T,R> mapper) compute and insert a value for a key only if that key is not already present in the map.
		Map<String, String> mm = new HashMap<>();
		mm.computeIfAbsent("sopan", k->"HYD");
		mm.computeIfAbsent("sopan", k->"Pune");
		
		System.out.println("\n"+mm.toString());
		
//		14.computeIfPresent(k key, BiFunction<T,U,R> mapper) it update the value for a key only if that key is present
		Map<String, Integer> mmm = new HashMap<>();
		mmm.put("Apple", 10);
		mmm.put("Banana", 10);
		mmm.computeIfPresent("Apple", (k,v)->v+10);
		mmm.computeIfPresent("mango", (k,v)->v+10);
		System.out.println(mmm);
		
	}

}
