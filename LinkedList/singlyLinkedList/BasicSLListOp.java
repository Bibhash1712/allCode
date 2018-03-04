package LinkedList.singlyLinkedList;

public class BasicSLListOp {
	
	private int length=0;
	Node head;
	
	
	public int listLength(){
		
		Node temp=head;
		while(temp!=null){
			temp=temp.next;
			length++;
		}
		return length;
	}

	public int listLengthRecursively(Node node){
		
		Node temp =node;
		if(temp == null){
			return 0;
		}else
			return 1 + listLengthRecursively(temp.next);
	}
	
	public void insertAtBegin(int data){
		
		if(head==null){
			head=new Node(data);
		}
		else{
			Node currentNode=new  Node(data);
			currentNode.next=head;
			head=currentNode;
		}
	}
	
	public void insertAtEnd(int data){
		
		Node temp;
		if(head==null){
			head=new Node(data);
		}
		else{
			temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			Node currentNode=new Node(data);
			temp.next=currentNode;
		}
		
		
		
	}
	
	public void insertAfterNode(Node prev_node, int data){
		
		Node temp = head;
		while(temp != null && temp == prev_node){
			if(prev_node == temp){
				
				Node new_node = new Node(data);
				new_node.next = prev_node.next;
				prev_node.next = new_node;
			}else{
				temp = temp.next;
			}
		
		}
	}
	
	public void traverseList(){
		
		
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.getData()+ " ");
			length++;
			temp=temp.next;
		}	
	}

	public Node insertAtEndRecursively(Node head){
	int length=1;
	if(head==null){
		head=new Node(1);
	}
	Node temp=head;
	while(temp!=null){
		temp=temp.getNext();
		length++;
		}
	Node currentNode=new Node(length);
	head.next=currentNode;
	currentNode.next=null;
		
	
	if(length<=5)
	return insertAtEndRecursively(head);
	else 
		return head;
}

	public void delete(int data) throws Exception{
		
		Node temp = head;
		boolean flag= false;
		if(temp == null){
			throw new Exception("LinkedList is null");
		}
		while(temp !=null  && flag ==false){
			temp= temp.next;
			if(temp.next.getData()==data){
				Node p =temp;
				Node q= temp.next.next;
				temp.next = null;
				p.next = q;
				flag=true;
			}
			temp= temp.next;
		}
		if(flag== false){
			throw new Exception("Node with data as " + data + " was not found in linkedList");
		}
	}

	public void deleteAtPosition() throws Exception{}
		
	public int search(int data)throws Exception{
		
		int position = 0;
		Node temp = head;
		while(temp != null){
			if(temp.getData() == data){
				return position;
			}
			temp= temp.next;
			position++;
		}
		return -1;
		
	}

	//Not Working................
	public void swapNodes(int data1, int data2)throws Exception{
		
		if(head == null){
			throw new Exception("head is null");
		}
		if(data1 == data2){
			throw new Exception("both data are same");
		}
		Node temp = head;
		Node x = null;
		Node y = null;
		Node node1 = null;
		Node node2 = null;
		int flag1 = 0;
		int flag2 = 0;
		
		if(head.getData()  == data1 ){
			flag1 =1;
			x = head;
		}
		if(head.getData() == data2 ){
			flag1 =1;
			y = head;
		}
		
		while(temp.next != null //&& (flag1 & flag2) == 1
				){
			if(temp.next.getData() == data1  && flag1 == 0){
				flag1 =1;
				x = temp;
			}
			if(temp.next.getData() == data2 && flag2 == 0){
				flag2 =1;
				y = temp;
			}
			temp = temp.next;
		}
		
		if(flag1 == 0 || flag2 == 0){
			throw new Exception("data not found");
		}
		
		//validation done
		//swapping begins
		node1 = x.next; 
		node2 = y.next;
		
		//Node temp2= x.next.next;
		node1.next = node2.next;
		node2.next = x.next;
		x.next = node2;
		//y.next = node1;
		
	}

	public void swapNodesFromGFG(int x, int y)
    {
        // Nothing to do if x and y are same
        if (x == y) return;
 
        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }
 
        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }
 
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

	//GFG
	public int printMiddle(Node head){
		
		Node endNode = head;
		Node midNode = head;
			
		while(endNode != null && endNode.next != null){
			
			endNode = endNode.next.next;
			midNode = midNode.next;
		}
		System.out.println("The middle node data is : " + midNode.getData() );
		
		return midNode.getData();
	}
}
