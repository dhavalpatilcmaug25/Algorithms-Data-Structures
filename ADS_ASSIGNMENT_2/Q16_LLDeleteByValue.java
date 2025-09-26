/*

16. Delete a node by its value in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to delete: 30
Expected Output: LinkedList: 10 → 20 → 40 

*/

class Q16_LLDeleteByValue{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void delete(int value){
		Node temp = head;
		
		while(temp != null && temp.next.data != value){
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
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
		Q16_LLDeleteByValue l1 = new Q16_LLDeleteByValue();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.delete(30);
		l1.display();
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q16_LLDeleteByValue
10 -> 20 -> 40
*/