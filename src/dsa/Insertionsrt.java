package dsa;

import java.util.Arrays;

public class Insertionsrt {
	public static void insertion(int arr[]) {
		for(int i =1;i<arr.length-1;i++){
			int key = arr[i];
			int j = i-1;
				while(j>=0 && arr[j]>key) {
					arr[j+1] =arr[j];
					j--;
				}
				arr[j+1] = key;
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {44,26,72,84,56,90};
		insertion(arr);
		for (int num : arr) {
			System.out.print(num +" ");
		}
	}
}