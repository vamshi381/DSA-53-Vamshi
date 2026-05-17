package dsa;

import java.util.Arrays;

public class OodindexZero {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int newarr[] = new int[arr.length*2-1];
		int j =0;
		for(int i = 0;i<newarr.length;i++) {
			if(i %2 ==0) {
				newarr[i] = arr[j];	
				j++;
		}
		else {
			newarr[i] = 0;
			
		}

	}
		System.out.println(Arrays.toString(newarr));

	}
}
