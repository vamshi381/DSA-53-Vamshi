package dsa;
import java.util.*;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
	//	System.out.println(Arrays.toString(arr));
		
	/*    ENHANCED METHOD
	 * for(int newarr: arr) {
			System.out.print(newarr + " ");
		}
		*/
		for (int i =0 ;i<n ;i++) {
			System.out.println(arr[i]);
		}

	}

}
