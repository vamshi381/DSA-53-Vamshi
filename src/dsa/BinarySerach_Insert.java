package dsa;

public class BinarySerach_Insert {

	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		
		int target = 6;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == target) {
				System.out.println("element foud at: "+mid);
				return;
			}
			else if(arr[mid] < target) {
					low = mid+1;
				}else {
					high = mid -1;
				}
				
			}
		System.out.println("the element should be placed at index: "+low);
		}
	}


