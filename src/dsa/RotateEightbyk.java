package dsa;

public class RotateEightbyk {
public static void reverse(int arr[],int start,int end) {
		
		while(start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			 arr[start] = temp;
			 start++;
			end--;
			
		}
	}
	public static void Rotationrightbyk(int []arr,int k) {
		k = k%arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-k-1);
		
		
	}
     
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,};
		Rotationrightbyk(arr,3);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
