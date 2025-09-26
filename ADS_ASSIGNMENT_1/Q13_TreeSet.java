/*
13. Write a Java program to insert, delete, and display employee names in sorted
order using TreeSet.
TestCases:
Input: Basic insert, sorted display, and delete
 INSERT Zara
INSERT Aman
INSERT Neha
DISPLAY
DELETE Neha
DISPLAY
Output: [Aman, Neha, Zara]
true
[Aman, Zara]
Input: Duplicates ignored & case sensitivity
 INSERT Meera
INSERT meera
INSERT Arjun
INSERT Arjun
DISPLAY
DELETE Rahul
DELETE Meera
DISPLAY
Output: [Arjun, Meera, meera]
false
true
[Arjun, meera]
*/


import java.util.*;

class Q13_TreeSet{
	
	static TreeSet<String> set = new TreeSet<>();
	
	static void Insert(String n){
		set.add(n);
	}
	
	static void Delete(String n){
		if(set.contains(n)){
			System.out.println(true);
			set.remove(n);
		}
		else{
			System.out.println(false);
		}
	}
	
	static void Display(){
		System.out.println(set);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// System.out.println("Basic insert, sorted display, and delete");
		/*
		Insert("Zara");
		Insert("Aman");
		Insert("Neha");
		Display();
		Delete("Neha");
		Display();
		*/
		// System.out.println("Duplicates ignored & case sensitivity");
		
		Insert("Meera");
		Insert("meera");
		Insert("Arjun");
		Insert("Arjun");
		Display();
		Delete("Rahul");
		Delete("Meera");
		Display();
		
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q13_TreeSet
[Aman, Neha, Zara]
true
[Aman, Zara]


C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q13_TreeSet
[Arjun, Meera, meera]
false
true
[Arjun, meera]

*/