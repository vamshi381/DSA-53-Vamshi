import java.util.Scanner;
import java.util.Arrays;

class LinearSearching{
	public static int linearSearch(int arr[],int target){
		for(int i = 0;i<arr.length;i++){
		 	if(arr[i]== target)
			return i;
	}
	return -1;
}
	public static void main(String[]args){
		int arr[] = {5,4,3,2,1};
		int target = 1;
		int result = linearSearch(arr,target);

		if (result != -1){
		System.out.println("element found at index :"+result);
		}else{
		System.out.println("element not found");
		}
	}
}