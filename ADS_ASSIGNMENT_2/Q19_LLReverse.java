/*

19. Reverse a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: LinkedList: 40 → 30 → 20 → 10
Existing LinkedList: []
Expected Output: LinkedList: (empty) 

*/

class Q19_LLReverse{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void revrse(){
		Node temp = head;
		Node prev = null;
		Node curr = null;
		
		if(temp == null){
			System.out.println("(empty)");
			return;
		}
		
		while(temp != null){
			curr = temp.next;
			temp.next = prev;
			prev = temp;
			temp = curr;
		}
		head = prev;
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
		Q19_LLReverse l1 = new Q19_LLReverse();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.revrse();
		l1.display();
		
	}
}

/*
Test Case 1:
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q19_LLReverse
40 -> 30 -> 20 -> 10

Test Case 2:
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q19_LLReverse
(empty)

*/