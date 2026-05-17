package dsa;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// SORTING ELEMENTS IN A ARRAY
		
		int srt[] = {5,2,3,4,1};
		Arrays.sort(srt);
		System.out.println(Arrays.toString(srt));
		
		//searching an element ina array
		
		int index = Arrays.binarySearch(srt, 4);
		System.out.println(index);
		
		//check both arrays equal or not
		int arr[] = {5,2,3,4,1};
		
		boolean isequal = Arrays.equals(srt, arr);
				System.out.println(isequal);
				
				//copyof values into a new array
		int cpy[] = new int[10];
		int newarr[] = Arrays.copyOf(srt,10);
		System.out.println(Arrays.toString(newarr));
		   		//copyof Range values into a new array
				//syntax : [Arrays.copyofRange(array,fromindex ,to index);
		int cpy1[] = Arrays.copyOfRange(arr, 2, 5);
		System.out.println(Arrays.toString(cpy1));
		
		
		//fill specific elements into an array
		int arr1[] = new int[4];
		Arrays.fill(arr1, 40);
		System.out.println(Arrays.toString(arr1));
	}

}
