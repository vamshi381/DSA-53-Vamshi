package dsa;

public class BinarySearch {
	

	public static void main(String[] args) {
		
			
			String name[] = {"bahu","deva","soma","tarun"};
			String target = "soma";
			int left = 0;
			int right = name.length-1;
			
			while (left<= right) {
				int mid = (left+right )/2;
				int cmp = name[mid].compareTo(target);
				if (cmp ==0)
				{
					System.out.println("found at: "+mid);
					return;
				}
				else if(cmp<0)
				{
					left = mid+1;
				}
				else
				{
					right = mid -1;
				}
			}
			System.out.println("element not found");
			
		

	}

}
