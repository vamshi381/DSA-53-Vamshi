package dsa;

public class SecondMinimum {

	public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
		
		int minimum = Integer.MAX_VALUE;
		int secondminimum = Integer.MAX_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<minimum) {
				secondminimum = minimum;
				minimum = arr[i];
				
			}else {                         //else block is for if array contain same n number of elements{23,23,23,23,23}
				if(arr[i]<secondminimum && arr[i]!=secondminimum) {
					secondminimum = arr[i];
				}
			}
		}
		System.out.println(secondminimum);


	}

}
