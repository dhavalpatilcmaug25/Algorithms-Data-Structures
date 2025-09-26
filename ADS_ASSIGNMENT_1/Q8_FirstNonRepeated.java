/*
8. First Non-Repeated Character
Problem: Write a Java program to find the first non-repeated character in a string.
Test Cases:
Input: "stress"
Output: 't'
Input: "aabbcc"
Output: null
*/
import java.util.*;
class Q8_FirstNonRepeated{
	
	static Character NonRepeated(String str){
		int a[] = new int[256];
		
		for(int i=0; i<str.length(); i++){
			a[str.charAt(i)] += 1;
		}
		
		for(int i=0; i<str.length(); i++){
			if(a[str.charAt(i)] == 1){
				return str.charAt(i);
			}
		}
		return null;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		
		System.out.println(NonRepeated(str));
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q8_FirstNonRepeated
aabbcc
null

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q8_FirstNonRepeated
stress
t
*/