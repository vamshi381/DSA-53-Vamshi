package dsa;
import java.util.*;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = arr[0];
		System.out.println("Enter "+n+" elements");
		for(int i = 0; i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("your array is "+Arrays.toString(arr));
		for(int j = 0; j < n;j++) {
			if(arr[j] > max) {
				max = arr[j];
				}
		}System.out.println("the maximum element of your array is : "+ max);
	}
		}
	
	
	


