package dsa;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements: ");
		//declaring an array
		int arr[] = new int[6];
		//taking array inputs from user
		for(int num = 0;num<=arr.length-1;num++) {
			arr[num] = sc.nextInt();
		}
		
		
		//reversing an array
		for(int i = arr.length-1 ;i>=0;i--) {
			
			System.out.print(arr[i]+",");
			
		}
	}
}


