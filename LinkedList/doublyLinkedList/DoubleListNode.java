package LinkedList.doublyLinkedList;

public class DoubleListNode {

	
	DoubleListNode prev;
	DoubleListNode next;
    Object data;
	
	
	public DoubleListNode() {
		//null constructor
	}


	public DoubleListNode(DoubleListNode prev, DoubleListNode next, Object data) {
		super();
		this.prev = prev;
		this.next = next;
		this.data = data;
	}


	public DoubleListNode getPrev() {
		return prev;
	}


	public void setPrev(DoubleListNode prev) {
		this.prev = prev;
	}


	public DoubleListNode getNext() {
		return next;
	}


	public void setNext(DoubleListNode next) {
		this.next = next;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	


	

}
