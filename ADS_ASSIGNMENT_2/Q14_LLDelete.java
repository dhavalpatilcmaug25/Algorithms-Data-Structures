/*

14. Delete the first node of a LinkedList
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 20 → 30 → 40 


*/

class Q14_LLDelete{
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
		head = head.next;
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
		Q14_LLDelete l1 = new Q14_LLDelete();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.delete();
		l1.display();
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q14_LLDelete
20 -> 30 -> 40
*/