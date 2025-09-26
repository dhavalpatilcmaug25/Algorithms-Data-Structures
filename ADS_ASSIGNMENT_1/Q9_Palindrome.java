/*
9. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.
Test Cases:
Input: 121
Output: true
Input: -121
Output: false 
*/

import java.util.*;

class Q9_Palindrome{
	
	public static boolean palindrome(int num){
		
		int rev = 0;
		int orignal = num;
		while(num > 0){
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		
		if(rev == orignal)return true;
		
		return false;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean p = palindrome(n);
		
		System.out.println(p);
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q9_Palindrome
-121
false

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q9_Palindrome
121
true
*/