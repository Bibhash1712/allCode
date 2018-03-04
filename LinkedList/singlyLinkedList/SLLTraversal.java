package LinkedList.singlyLinkedList;

public class SLLTraversal {
	
	public void traverseList(Node head){
			
			
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.getData()+ " ");
				
				temp=temp.next;
			}	
	
	}
}	
