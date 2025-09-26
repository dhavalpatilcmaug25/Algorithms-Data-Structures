/*
11. Create a LinkedList and insert elements at the end.
Testcase:
Existing LinkedList: [5, 10, 15]
Elements to insert: [20, 25]
Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25 

*/

class Q11_LLInsertEnd{
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
		
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		last.next = new_node;
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
		Q11_LLInsertEnd l1 = new Q11_LLInsertEnd();
		l1.head = new Node(5);
		l1.head.next = new Node(10);
		l1.head.next.next = new Node(15);
		
		l1.insert(20);
		l1.insert(25);
		l1.display();
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q11_LLInsertEnd
5 -> 10 -> 15 -> 20 -> 25
*/