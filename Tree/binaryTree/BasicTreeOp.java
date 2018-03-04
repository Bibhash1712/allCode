package Tree.binaryTree;

public class BasicTreeOp {
	
//	private int height = 0;
	TreeNode rootNode;
	
	
	public  TreeNode insert(int data,TreeNode root){
		
		
		if (root==null){
			root=new TreeNode(data);
			return root;
		}
		
		else{
			TreeNode temp=root;
			TreeNode prev=null;
			TreeNode newNode =new TreeNode(data);
			
			while(temp!=null){
				
				prev=temp;
				
				if(data<temp.getData()){
					temp=temp.getLeft();
				}
				else
					temp=temp.getRight();
			}
			
			if(data<prev.getData()){
				prev.setLeft(newNode);

			}
			else
				prev.setRight(newNode);
			return root;
		}
		
	}
	
	public void inOrder(TreeNode root){
		
		if(root==null){
		  return;	
		}
		
		inOrder(root.getLeft());
		//System.out.print("{" + root.getData() + "}");
		System.out.print("\t" + root.getData() );
		inOrder(root.getRight());
		
	}
	
	public void preOrder(TreeNode root){
		
		if(root==null){
		  return;	
		}
		
		System.out.print("\t" + root.getData() );
		preOrder(root.getLeft());
		preOrder(root.getRight());
		
	}

	public void postOrder(TreeNode root){
		
		if(root==null){
		  return;	
		}
		
		postOrder(root.getLeft());
		postOrder(root.getRight()); 
		System.out.print("\t" + root.getData() );
		
	}

	public static int height(TreeNode root){
		
		if(root==null){
			  return 0;	
			}
			int leftHeight=height(root.getLeft());
			int rightHeight=height(root.getRight());
			return Math.max(leftHeight, rightHeight)+1;
	}

	
	
	
	
	
	
	
}
