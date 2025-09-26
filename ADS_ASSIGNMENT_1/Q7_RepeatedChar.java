/*
7. Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.
Test Cases:
Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l'] 

*/

import java.util.*;

class Q7_RepeatedChar{
	
	public static List<Character> findRepeated(String str){
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()){
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		List<Character> repeated = new ArrayList<>();
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() > 1){
				repeated.add(entry.getKey());
			}
		}
		return repeated;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(findRepeated(str));
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q7_RepeatedChar
programming
[r, g, m]

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q7_RepeatedChar
hello
[l]
*/