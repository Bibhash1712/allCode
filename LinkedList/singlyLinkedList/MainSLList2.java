package LinkedList.singlyLinkedList;

public class MainSLList2 {
	
	public static void main(String[] args) throws Exception {
		
		BasicSLListOp slList=new BasicSLListOp();
		
		
			
			slList.insertAtBegin(99);
			slList.insertAtEnd(7);
			slList.insertAtEnd(20);
			slList.insertAtEnd(0);
			
			slList.traverseList();
			
			slList.swapNodes(7, 20);
			//slList.swapNodesFromGFG(99, 20);
			
			System.out.println("List after Swapping :");
			

			slList.traverseList();
	}

}
