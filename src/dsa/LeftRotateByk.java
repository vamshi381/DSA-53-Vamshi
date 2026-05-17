package dsa;

public class LeftRotateByk {
	public static void reverse(int arr[],int start,int end) {
		
		for(int i = start;i<=end;i++) {
			int temp = arr[start];
			arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			end--;
			
		}
	}
	public static void Rotationleftbyk(int []arr,int k) {
		k = k%arr.length;
		reverse(arr, 0, arr.length- 1);     // Step 1
        reverse(arr, 0, arr.length-k);     // Step 2
        reverse(arr, k, arr.length - 1); 
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Rotationleftbyk(arr,3);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
