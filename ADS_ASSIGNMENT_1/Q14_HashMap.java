/*

14. Write a Java program to add, update, remove, and display books using
HashMap.
TestCases:
Input: Basic add & sorted display
 ADD 205 Refactoring
ADD 101 Clean_Code
ADD 150 Effective_Java
DISPLAY
Output: {101=Clean_Code, 150=Effective_Java, 205=Refactoring}
Input: Update, remove, and verify
 ADD 1 Alpha
ADD 2 Beta
UPDATE 2 Beta_2nd_Ed
REMOVE 1
DISPLAY
Output: true
true
{2=Beta_2nd_Ed}

*/

import java.util.*;

class Q14_HashMap{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> books = new HashMap<>();
		
		while(sc.hasNextLine()){
			String command = sc.nextLine().trim();
			
			if(command.isEmpty()) break;
			
			String parts[] = command.split(" ", 3);
			String action = parts[0].toUpperCase();
			
			switch(action){
				case "ADD":
					if(parts.length >= 3){
						int id = Integer.parseInt(parts[1]);
						String title = parts[2];
						books.put(id, title);
					}
					break;
					
				case "UPDATE":
					if(parts.length >= 3){
						int id = Integer.parseInt(parts[1]);
						if(books.containsKey(id)){
							books.put(id, parts[2]);
							System.out.println(true);
						}
						else{
							System.out.println(false);
						}
					}
					break;
					
				case "REMOVE":
					if(parts.length >= 2){
						int id = Integer.parseInt(parts[1]);
						if(books.containsKey(id)){
							books.remove(id);
							System.out.println(true);
						}
						else {
							System.out.println(false);
						}
					}
					break;
					
				case "DISPLAY":
					TreeMap<Integer, String> sortedBooks = new TreeMap<>(books);
					System.out.println(sortedBooks);
					break;
				
				default:
					System.out.println("Unkown Command: " + action);
			}
		}
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q14_HashMap
ADD 205 Refactoring
ADD 101 Clean_Code
ADD 150 Effective_Java
DISPLAY
{101=Clean_Code, 150=Effective_Java, 205=Refactoring}


C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q14_HashMap
ADD 1 Alpha
ADD 2 Beta
UPDATE 2 Beta_2nd_Ed
true
REMOVE 1
true
DISPLAY
{2=Beta_2nd_Ed}

*/