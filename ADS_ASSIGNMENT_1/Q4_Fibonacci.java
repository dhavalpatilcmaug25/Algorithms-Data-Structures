/*

4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.
Test Cases:
Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13] 

*/
import java.util.*;
class Q4_Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		int a = 0, b = 1;
		
		for(int i=0; i<n; i++){
			ar.add(a);
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println(ar);
	}
}
		
		/*
		
		int prev1 = 1;
		int prev2 = 0;
		System.out.print(prev2 + " ");
		System.out.print(prev1 + " ");
		for(int i=3; i<=n; i++){
			int cur = prev1 + prev2;
			prev2 = prev1;
			prev1 = cur;
			System.out.print(cur + " " );
		}
		
		*/
		
		
		
/*
output:

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q4_Fibonacci
5
[0, 1, 1, 2, 3]

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q4_Fibonacci
8
[0, 1, 1, 2, 3, 5, 8, 13]

*/