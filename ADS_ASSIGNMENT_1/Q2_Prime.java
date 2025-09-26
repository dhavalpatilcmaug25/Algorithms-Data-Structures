/*
2. Prime Number
Problem: Write a Java program to check if a given number is prime.
Test Cases:
Input: 29
Output: true
Input: 15
Output: false 

*/

import java.util.*;
class Q2_Prime{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2; i<Math.sqrt(num); i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime);
		
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q2_Prime
29
true

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q2_Prime
15
false
*/