package dsa;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int newarr[] = new int[arr.length-1];
		int position = 3;
		int j = 0;
		for(int i = 0;i<arr.length;i++) {
			if (i == position) {
				continue;
			}
			newarr[j] = arr[i];
			j++;
		}
		
		System.out.println(Arrays.toString(newarr));
	}

}
