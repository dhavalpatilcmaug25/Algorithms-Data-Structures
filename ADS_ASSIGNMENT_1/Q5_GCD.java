/*
5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two
numbers.
Test Cases:
Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1 

*/

import java.util.*;

class Q5_GCD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a, b);
		int gcd = 0;
		for(int i=1; i<min; i++){
			if(a%i == 0 && b%i == 0){
				gcd = i;
			}
		}
		
		System.out.print(gcd);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q5_GCD
54 24
6
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q5_GCD
17 13
1
*/