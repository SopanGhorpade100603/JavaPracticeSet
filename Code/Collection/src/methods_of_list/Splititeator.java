package methods_of_list;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterator.OfInt;

//it was introduces in java8 for do parallel execution on collection objects or arrays and also split them
public class Splititeator {

	public static void main(String[] args) {
	List<String> list = List.of("Sopan","ram","Arun","raghav");
	Spliterator<String> itr = list.spliterator();
//	itr.forEachRemaining(System.out::println);
//	for split
	Spliterator<String> split2 = itr.trySplit();
	split2.forEachRemaining(System.out::println);

	
	int num[]={10,20,30,40};
	OfInt arrSplit = Arrays.spliterator(num);
//	for print array
//	arrSplit.forEachRemaining((IntConsumer)System.out::println); //OR
//	arrSplit.forEachRemaining((int ele)->System.out.println(ele));
	
//	for split array
	OfInt split = arrSplit.trySplit();
	split.forEachRemaining((int ele)->System.out.println(ele));
	
	
	String [] arr = {"Sopan","ram","Arun","raghav"};
	Spliterator<String> arrItr = Arrays.spliterator(arr);
//	arrItr.forEachRemaining(System.out::println);
	}

}
