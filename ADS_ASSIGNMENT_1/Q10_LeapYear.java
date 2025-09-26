/*
10. Leap Year
Problem: Write a Java program to check if a given year is a leap year.

Test Cases:

Input: 2020
Output: true
Input: 1900
Output: false
*/

import java.util.*;

class Q10_LeapYear{
	
	public static boolean leapyear(int year){
		
		if(( year%4 == 0 && year%100 != 0) || year % 400 == 0){
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println(leapyear(year));
	}
}
/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q10_LeapYear
2020
true

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q10_LeapYear
1900
false

*/