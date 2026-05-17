package dsa;

import java.util.Arrays;

public class Find_first_lastPosition {
	
	public static int[] searchRange(int arr[],int target) {
		int first = findIndex(arr,target,true);
		int last = findIndex(arr,target,false);
		return new int[]  {first,last};
	}
	public static int findIndex(int arr[],int target,boolean isFirst) {
		int low = 0;
		int high = arr.length-1;
		int index = -1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				index = mid;
				if(isFirst) {
					high= mid-1;
				}
				else {
					low = mid+1;
				}
			}
			else if(arr[mid]<target){
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return index;
	}


	public static void main(String[] args) {
		int arr [] = {4,5,5,6,6,6,6,7,7,8,9};
		int target = 6;
		int[] range = searchRange(arr,target);
		System.out.println(Arrays.toString(range));
		
		
	}

}
