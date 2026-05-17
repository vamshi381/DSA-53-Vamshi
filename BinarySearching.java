import java.util.Scanner;
import java.util.Arrays;

class BinarySearching{
	public static int BinarySearch(int arr[],int target){
		int left = 0;
		int right = arr.length-1;
		while(left<=right){
		for(int i =0;i<arr.length;i++ ){
		int mid = (left+right)/2;
		if(arr[mid]==target){
		return mid;
		}else if(arr[mid]<target){
		left = mid +1;
		}else{
		right = mid-1;
		}
		}
		}
return -1;
}
	public static void main(String[] args){
	int arr[] = {66,73,23,46,90,21};
	int target = 23;
int result = BinarySearch(arr,target);
if(result != -1){
System.out.println("element found at index: "+result);
}
else{
System.out.println("element not found");
}
}
}