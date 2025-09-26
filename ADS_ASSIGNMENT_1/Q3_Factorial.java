/*
3. Factorial
Problem: Write a Java program to compute the factorial of a given number.
Test Cases:
Input: 5
Output: 120
Input: 0
Output: 1 
*/

import java.util.Scanner;

class Q3_Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=num; i++){
			fact *= i;
		}
		
		System.out.println(fact);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q3_Factorial
5
120

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q3_Factorial
6
720

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q3_Factorial
0
1
*/