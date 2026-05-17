package dsa;

import java.util.Arrays;

public class BubblesrtDescnd {
	
		public static void bubble(int arr[]) {
			boolean swap = false;
			int count =0;
			for(int i = 0; i<arr.length-1;i++) {
				for(int j =0;j<arr.length-i-1;j++) {
					if(arr[j]<arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
						swap = true;
						count++;
					}
					
					if(!swap) {
						
						break;
						
					}
				}
			
			}
			System.out.println(count);
		}

		public static void main(String[] args) {
			int arr[] = {1,2,3,4,5};
			bubble(arr);
			System.out.println(Arrays.toString(arr));

		}
}
	

	