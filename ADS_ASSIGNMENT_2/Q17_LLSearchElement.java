/*

17. Search for an element in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Element to search: 30
Expected Output: Element found at index 2 


*/

class Q17_LLSearchElement{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void search(int value){
		Node temp = head;
		int idx = 0;
		while(temp != null && temp.data != value){
			idx++;
			temp = temp.next;
		}
		
		System.out.println("Element found at index "+ idx);
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
		Q17_LLSearchElement l1 = new Q17_LLSearchElement();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		l1.search(30);
		
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q17_LLSearchElement
Element found at index 2
*/