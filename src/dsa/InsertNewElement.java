package dsa;

public class InsertNewElement {

	public static void main(String[] args) {
		//declaring an array
		int arr[] = {1,2,3,4,5,6};
		//declaring another array with +1 length
		int newarr[] = new int[arr.length+1];
		//intializing the position where to insert
		int position = 2;
		//declaring the element to be inserted 
		int element = 7;
		//send before position values to newarray
		for(int i = 0;i<position;i++) {
			newarr[i] = arr[i];
		}
		//inserting the new element into the new array
		newarr[position] = element;
		//inserting remaining elements from old to new array
		for(int i = position; i<arr.length;i++) {
			newarr[i+1] = arr[i];
		}
		//traversing the newarray using enhanced loop
		for(int ele:newarr) {
			System.out.print(ele +" ");
		}

	}

}
