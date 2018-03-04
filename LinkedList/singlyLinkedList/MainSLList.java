package LinkedList.singlyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class MainSLList {

	public static void main(String[] args) {
		
		//ListNode firstNode=null;
		BasicSLListOp slList=new BasicSLListOp();
		
		
	/*	slList.insertAtEnd(5);
		slList.insertAtEnd(5);
		slList.insertAtEnd(15);
		slList.insertAtEnd(1);
		slList.insertAtEnd(23);*/
		//slList.insertAtBegin(99);
		slList.insertAtEnd(7);
		slList.insertAtEnd(20);
		slList.insertAtEnd(0);
		
		slList.insertAtBegin(99);
		//slList.traverseList();
		
		LinkedList<BasicSLListOp> list = new LinkedList<>();
		
		list.addFirst(slList);
		list.add(slList);
		//list.set(1, slList);
		Iterator<?> it = list.iterator();
		
		while(it.hasNext()){
			BasicSLListOp op = (BasicSLListOp) it.next();
			op.traverseList();
		}
		
	
	}

}
