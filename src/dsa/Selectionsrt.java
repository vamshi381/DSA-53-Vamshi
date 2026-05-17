package dsa;

import java.util.Arrays;

public class Selectionsrt {
	public static void selection(int arr[]) {
		for(int i =0;i<arr.length-1;i++) {
			int min_index  = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index] ){
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,3,1,2,6,8,9};
		selection(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
