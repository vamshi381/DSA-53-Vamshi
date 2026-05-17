package dsa;

public class MinimumElements {

	public static void main(String[] args) {
		int arr[] = {1,3,4,1,6,7,9,1};
		int min = arr[0];
		int count = 0;
		for(int i= 0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(min == arr[i]) {
				count++;
			}
		}
		System.out.println("the mimimum element is : "+min);
		System.out.println("the no of minimum elements in this array are: "+count);

	}

}
