/**
 * 
 */



public class Day15LinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	 public static  Node insert(Node head,int data) {
	        //Complete this method
	        Node newNode=new Node(data);
	        if(head==null) return newNode;
	       Node node=head;
	        while(node.next!=null){
	            node=node.next;
	        }
	        node.next=newNode;
	        return head;

	    }

}
