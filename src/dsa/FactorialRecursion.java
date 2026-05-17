package dsa;
import java.util.Scanner;
public class FactorialRecursion {
	static int factorial (int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
			return n = n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int fact = FactorialRecursion.factorial(n);
		System.out.println("the factorial of " +n +" is: " +fact );
		
		

	}

}
