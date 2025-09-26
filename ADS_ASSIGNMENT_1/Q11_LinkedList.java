/*

11. Write a Java program to add, update, remove, and display elements using
LinkedList.
Testcase:
Input: ADD A
ADD B
ADD C
REMOVE 0
DISPLAY
Output: [B, C]
Input: ADD A
ADD B
ADD C
UPDATE 1 X
DISPLAY
Output: [A, X, C] 

*/

import java.util.*;
class Q11_LinkedList{
	static LinkedList<String> list = new LinkedList<>();
	
	static void add(String n){
		list.add(n);
	}
	
	static void remove(int idx){
		if(idx >= 0 && idx < list.size()) list.remove(idx);
	}
	
	static void update(int idx, String n){
		if(idx >= 0 && idx < list.size())
		list.set(idx, n);
	}
	
	static void display(){
		System.out.print(list);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String line = sc.nextLine().trim();
			
			if(line.isEmpty()) break;
			
			String[] parts = line.split(" ");
			
			if(parts[0].equals("ADD")){
				add(parts[1]);
			}
			else if(parts[0].equalsIgnoreCase("Remove")){
				remove(Integer.parseInt(parts[1]));
			}
			else if(parts[0].equalsIgnoreCase("Update")){
				update(Integer.parseInt(parts[1]), parts[2]);
			}else if(parts[0].equalsIgnoreCase("Display")){
				display();
			}
			
		}
		/*
		add('A');
		add('B');
		add('C');
		remove(0);
		display();
		*/
	}
}


/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q11_LinkedList
ADD A
ADD B
ADD C
REMOVE 0
DISPLAY
[B, C]

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q11_LinkedList
ADD A
ADD B
ADD C
UPDATE 1 X
DISPLAY
[A, X, C]
*/