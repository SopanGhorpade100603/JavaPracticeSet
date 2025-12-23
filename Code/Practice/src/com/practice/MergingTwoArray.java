import java.util.*;
import java.util.stream.*;

public class MergingTwoArray{
public static void main(String [] args){
  int arr1[]={2,4,6,8};
       int arr2[]={10,12,14};
       int arr3[] = new int[arr1.length+arr2.length];
       for(int i=0;i<arr1.length;i++){
           arr3[i]=arr1[i];
       }
       for(int i=0;i<arr2.length;i++){
           arr3[arr1.length+i]=arr2[i];
       }
     //  System.out.println(Arrays.toString(arr3));


	int arr4[] = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
System.out.println(Arrays.toString(arr4));

}
}