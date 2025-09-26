/*

1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong
number.
Test Cases:
Input: 153
Output: true
Input: 123
Output: false 

*/

import java.util.*;

class Q1_Armstrong{
	
	public void Armstrong(int n){
		
		return 
	}
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/* Brute force
		int target = n;
		int sum = 0; 
		while(n > 0){ 
			int temp = n % 10;
			int cube = temp * temp * temp;
			sum += cube;
			n = n / 10;
		}
		
		if(sum == target){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		*/
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q1_Armstrong
153
true

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q1_Armstrong
123
false
*/