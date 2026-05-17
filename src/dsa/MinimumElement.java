package dsa;

import java.util.*;

public class MinimumElement {

	public static void main(String[] args) {
		int arr [] = {63,74,86,92,100,4};
		int min = arr[0];			//declaring first element as minimum value and comparing it with other elements
		
		for(int i = 0; i<=arr.length-1;i++) {
			if(arr[i]<min) {
				min = arr[i];
				System.out.println(min);
			}
			
		}
		
	}

}
