/*
12. Insert a new node at the beginning of a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30]
Node to insert: 5
Expected Output: LinkedList: 5 → 10 → 20 → 30 


*/

class Q12_LLinsertFront{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void insert(int data){
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
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
		Q12_LLinsertFront l1 = new Q12_LLinsertFront();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		
		l1.insert(5);
		l1.display();
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q12_LLinsertFront
5 -> 10 -> 20 -> 30
*/