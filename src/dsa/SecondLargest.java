package dsa;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
				
			}else {                         //else block is for if array contain same n number of elements{23,23,23,23,23}
				if(arr[i]>secondlargest && arr[i]!=secondlargest) {
					secondlargest = arr[i];
				}
			}
		}
		System.out.println(secondlargest);

	}

}
