/*

15. Delete the last node of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 10 → 20 → 30 

*/

class Q15_LLDeleteLast{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void delete(){
		Node temp = head;
		
		while(temp.next.next != null){
			temp = temp.next;
		}
		temp.next = null;
	}
	
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data);
			if(temp.next != null) System.out.print(" -> ");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]){
		Q15_LLDeleteLast l1 = new Q15_LLDeleteLast();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.delete();
		l1.display();
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q15_LLDeleteLast
10 -> 20 -> 30
*/