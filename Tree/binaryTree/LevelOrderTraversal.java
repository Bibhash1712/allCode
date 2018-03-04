package Tree.binaryTree;

public class LevelOrderTraversal {
	
	static TreeNode rootNode = null;
	
	static{
		
		BasicTreeOp bto = new BasicTreeOp();
		rootNode = bto.insert(30, rootNode);
		
		bto.insert(40, rootNode);
		bto.insert(10, rootNode);
		bto.insert(90, rootNode);
		bto.insert(70, rootNode);
		bto.insert(20, rootNode);
		bto.insert(50, rootNode);
	}
	
	public static void main(String[] args) {
		
		printLevelOrder(rootNode);
	}
	
	public static void printLevelOrder(TreeNode root)
	{
	    int h = BasicTreeOp.height(root);
	    int i=0;
	    for (i=1; i<=h; i++)
	    {
	        printGivenLevel(root, i);
	        System.out.println();
	    }
	}
	
	/* Print nodes at a given level */
	public static void printGivenLevel(TreeNode root, int level)
	{
	    if (root == null)
	        return;
	    if (level == 1)
	        System.out.print(root.getData() + "\t");
	    else if (level > 1)
	    {
	        printGivenLevel(root.getLeft(), level-1);
	        printGivenLevel(root.getRight(), level-1);
	    }
	}

}
