/*
13. Insert a new node at a given position in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Node to insert: 25 at position 2
Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40 

*/

class Q13_LLinsertPosition{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void insertAtPos(int data, int pos){
		Node new_node = new Node(data);
		
		if(pos == 0){
			new_node.next = head;
			head = new_node;
			return;
		}
		
		Node temp = head;
		for(int i=0; temp != null && i < pos - 1; i++){
			temp = temp.next;
		}
		
		if(temp == null){
			System.out.println("position out of range");
			return;
		}
		
		new_node.next = temp.next;
		temp.next = new_node;
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
		Q13_LLinsertPosition l1 = new Q13_LLinsertPosition();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.insertAtPos(25, 2);
		l1.display();
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q13_LLinsertPosition
10 -> 20 -> 25 -> 30 -> 40
*/