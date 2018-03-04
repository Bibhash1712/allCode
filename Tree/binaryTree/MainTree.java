package Tree.binaryTree;

public class MainTree {
	
	public static void main(String[] args) {
		
		TreeNode  rootNode = null;
		BasicTreeOp bto = new BasicTreeOp();
		
		System.out.println("Before insert : " + rootNode);
		
		rootNode = bto.insert(30, rootNode);
		
		bto.insert(40, rootNode);
		bto.insert(10, rootNode);
		bto.insert(90, rootNode);
		bto.insert(70, rootNode);
		bto.insert(20, rootNode);
		bto.insert(50, rootNode);
		
		
		System.out.println("After insert : " );
		System.out.print("InOrder : { ");
		bto.inOrder(rootNode);
		System.out.print(" \t}"  + " \n \n"  + "PreOrder : { ");
		bto.preOrder(rootNode);
		System.out.print("\t}"  + " \n\n"  + "PostOrder : { ");
		bto.postOrder(rootNode);
		int height=BasicTreeOp.height(rootNode);
		System.out.println("\t}"  + "\n \n" +"Height of the tree is : "+ height);
	}

}
