package dsa;

import java.util.Arrays;

public class Merge_Sort {
	private static void mergesort(int[] arr, int n) {
		//edge case
		if (n<2) {
			return;
		}
		//find the mid element to partiion the array left & right
		int mid = n/2;
		int larr[] = new int[mid];
		int rarr[] = new int[n-mid];
		//fill the elements into array
		for(int i = 0;i<mid;i++) {
			larr[i] = arr[i];
		}
		for(int i = mid;i<n;i++) {
			rarr[i-mid] = arr[i];
		}
		//apply merge sort on leftarray
		mergesort(larr,mid);
		//apply merge sort on right array
		mergesort(rarr,n-mid);
		//merge all the elements based on the comparision
		merge(arr,larr,rarr,mid,n-mid);
		
	}
	private static void merge(int[] arr, int[] larr, int[] rarr, int left, int right) {
		int i = 0,j= 0,k= 0;
		while(i<left && j<right) {
			if(larr[i]<=rarr[j]) {
				arr[k++] = larr[i++];
				
				
			}else {
				arr[k++] = rarr[j++];
				
			}
		}
			while(i<left) {
				arr[k++] = larr[i++];
				
			}
			while(j<right) {
				arr[k++] = rarr[j++];
			}
		}
	public static void main(String[] args) {
		int arr[] = {5,8,9,5,10,20};
		int n = arr.length;
		mergesort(arr,n);
		System.out.println(Arrays.toString(arr));
	}

	
    
    }
