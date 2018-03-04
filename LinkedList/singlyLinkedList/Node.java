package LinkedList.singlyLinkedList;

public class Node {
	
	 Node next;
	 int data;
	// private Object data
	 
	//overloaded constructors
	 public Node(){
	 }
	 public Node(int data){
		this.data= data;
	 }
	 
	 
	//getter and setters 
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	 	 

}
