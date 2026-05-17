package dsa;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubble(int arr[]) {
		
		for(int i = 0; i<arr.length-1;i++) {//outer loop for iteration for every element 
			for(int j =0;j<arr.length-i-1;j++) {//inner loop for comparing & swap (only element goes to end if() condition is true)
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}
			}
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,6,9,4,8,2};
		bubble(arr);
		System.out.println(Arrays.toString(arr));

	}

}
