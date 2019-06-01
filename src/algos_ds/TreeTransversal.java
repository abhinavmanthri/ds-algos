package algos_ds;

public class TreeTransversal {
	
	
	//(left,root,right)
	static void inorder(Node node)
	{
		if(node==null)
			return ;			
		inorder(node.left);
		
		System.out.println(node.data);
		
			
		inorder(node.right);
		
		
	}
	
	static void preorder(Node node)
	{
		if(node==null)
			return;
		
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}
	
	static void postorder(Node node)
	{
		if(node==null)
			return;
		postorder(node.left);
		
		postorder(node.right);
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(3);
		root.left=new Node(2);
		root.right=new Node(4);
		root.left.left=new Node(5);
		root.left.right=new Node(6);
		postorder(root);

	}

}
