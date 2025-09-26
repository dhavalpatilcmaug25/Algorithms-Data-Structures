/*

18. Count the total number of nodes in a LinkedList.
Testcase:
Existing LinkedList: [10, 20, 30, 40]
Expected Output: Total nodes: 4


*/

class Q18_LLCountTotal{
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	int totalNode(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		
		return count;
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
		Q18_LLCountTotal l1 = new Q18_LLCountTotal();
		l1.head = new Node(10);
		l1.head.next = new Node(20);
		l1.head.next.next = new Node(30);
		l1.head.next.next.next = new Node(40);
		
		System.out.println("Total Nodes: " + l1.totalNode());
		
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\ADS\ADS_ASSIGNMENT_2>java Q18_LLCountTotal
Total Nodes: 4
*/