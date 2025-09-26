/*

15. Write a Java program to add, update, remove, and display login details using
LinkedHashMap.
TestCases:
Input: Add, update, display (insertion order preserved)
 ADD alice a1
ADD bob b1
UPDATE alice a2
DISPLAY
Output: true
{alice=a2, bob=b1}
Input: Remove, re-add (reinserted at end)
 ADD alice a1
ADD bob b1
ADD carol c1
REMOVE bob
ADD bob b2
DISPLAY
Output: true
{alice=a1, carol=c1, bob=b2} 

*/


import java.util.*;

class Q15_LinkedHashMap{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			
			if(line.isEmpty()) break;
			
			String parts[] = line.split(" ", 3);
			String action = parts[0];
			
			switch(action){
				case "ADD":
					if(parts.length >= 3){
						String key = parts[1];
						String value = parts[2];
						map.put(key, value);
					}
					break;
					
				case "UPDATE":
					if(parts.length >= 3){
						String key = parts[1];
						
						if(map.containsKey(key)){
							String value = parts[2];
							map.put(key, value);
							System.out.println(true);
						}
						else{
							System.out.println(false);
						}
					}
					break;
					
				case "REMOVE":
					if(parts.length >=2 ){
						String key = parts[1];
						if(map.containsKey(key)){
							map.remove(key);
							System.out.println(true);
						}
						else{
							System.out.println(false);
						}
					}
					break;
				
				case "DISPLAY":
					System.out.println(map);
					break;
					
			}
		}
	}
}

/*

C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q15_LinkedHashMap
ADD alice a1
ADD bob b1
ADD carol c1
REMOVE bob
true
ADD bob b2
DISPLAY
{alice=a1, carol=c1, bob=b2}


C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_1>java Q15_LinkedHashMap
ADD alice a1
ADD bob b1
UPDATE alice a2
true
DISPLAY
{alice=a2, bob=b1}

*/