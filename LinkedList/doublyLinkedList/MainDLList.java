package LinkedList.doublyLinkedList;

public class MainDLList {

	public static void main(String[] args) {
		
		BasicDLListOp dlList=new BasicDLListOp();
		
		dlList.insertAtBegin("bibhash");
	//	dlList.insertAtBegin(100);
		dlList.insertAtEnd("kumar");
		dlList.traverseList();
		System.out.println(dlList.listLength());
		

	}

}
