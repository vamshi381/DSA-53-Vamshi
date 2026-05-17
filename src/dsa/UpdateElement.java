package dsa;
import java.util.Arrays;
import java.util.Scanner;
public class UpdateElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number the elements in array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	 
	System.out.print("enter the array elements: ");
	for(int i = 0; i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("your old array is: "+Arrays.toString(arr));
	System.out.print("ener the position: ");
	int pos = sc.nextInt();
	if(pos<0 || pos>=n) {
		System.out.println("invalid position");
	}
	else {
	System.out.print("enter the element to update: ");
	int element = sc.nextInt();
	arr[pos] = element;
	System.out.print("your new array is: "+ Arrays.toString(arr));
	}
	
	}
}
