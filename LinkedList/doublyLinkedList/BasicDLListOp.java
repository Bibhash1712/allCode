package LinkedList.doublyLinkedList;

public class BasicDLListOp {

	DoubleListNode head;
	private int length = 0;

	// insert at end
	// insert at begin
	// insert at position
	// reverse list
	// is head null
	// length of list

	public void insertAtBegin(Object data) {

		DoubleListNode dllNode = new DoubleListNode(null, null, data);

		if (head == null)
			head = dllNode;
		else {
			dllNode.setNext(head);
			head = dllNode;
		}
		length++;

	}

	public void insertAtEnd(Object data) {

		DoubleListNode dllNode = new DoubleListNode(null, null, data);

		if (head == null)
			head = dllNode;
		else {
			DoubleListNode temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=dllNode;

		}

	}

	public void insertAtPos(DoubleListNode head, int position) {

	}

	public int listLength() {
		return length;
	}

	public DoubleListNode reverseList(DoubleListNode head) {

		DoubleListNode dllNode = new DoubleListNode();
		return dllNode;
	}

	public void traverseList() {

		DoubleListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
		System.out.println();

	}

}
