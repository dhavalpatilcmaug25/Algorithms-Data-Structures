/*

12. Write a Java program to add, search, remove, and display elements using
HashSet.
Testcase:
Input: Add duplicates ignored
 ADD A
ADD A
ADD B
DISPLAY
Output: [A, B]

Input: Search present vs absent
 ADD A
ADD B
SEARCH A
SEARCH C
Output: true
False 

*/

import java.util.*;
class Q12_HashSet{
	static HashSet<String> set = new HashSet<>();
	
	static void Add(String n){
		set.add(n);
	}
	
	static void display(){
		System.out.print(set);
	}
	
	static void Check(String n){
		System.out.print(set.contains(n));
	}
	
		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			
			if(line.isEmpty()) break;
			
			String parts[] = line.split(" ");
			
			if(parts[0].equalsIgnoreCase("Add")){
				Add(parts[1]);
			}
			else if(parts[0].equalsIgnoreCase("Display")){
				display();
			}
			else if(parts[0].equalsIgnoreCase("Search")){
				Check(parts[1]);
			}
		}
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q12_HashSet
ADD A
ADD B
SEARCH A
trueSEARCH C
false

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q12_HashSet
ADD A
ADD B
ADD C
DISPLAY
[A, B, C]
*/