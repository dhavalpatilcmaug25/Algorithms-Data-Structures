/*
6. Find Square Root
Problem: Write a Java program to find the square root of a given number (using
integer approximation).
Test Cases:
Input: x = 16
Output: 4
Input: x = 27
Output: 5 
*/

import java.util.*;
class Q6_SquareRoot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int root = (int)Math.sqrt(x);
		
		System.out.println(root);
	}
}


/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q6_SquareRoot
16
4

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q6_SquareRoot
27
5
*/