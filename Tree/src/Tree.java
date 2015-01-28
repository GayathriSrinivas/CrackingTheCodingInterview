//Binary Search Tree
public class Tree {
	Tree left;
	Tree right;
	// Including parent ptr 
	Tree parent;
	int data;
	
	public Tree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public static Tree insert(Tree root,int data) {
		
		if(root == null){
			root = new Tree(data);
			return root;
		}
		
		if(data < root.data){
		    root.left = insert(root.left, data);
			root.left.parent = root;
		} else if (data > root.data) {
			root.right = insert(root.right,data);
			root.right.parent = root;
		}
		return root;
	}
	
	public static void main(String args[]) {
		Tree root = null;
		root = insert(root,10);
		insert(root,5);
		insert(root,15);
		insert(root,20);
		insert(root,18);
		insert(root,25);
		insert(root,17);
		insert(root,12);
		insert(root,11);
		insert(root,14);
		insert(root,6);
		
		boolean result = BinaryTree.isBinarySearchTree(root, 0, 50);
		System.err.println(result);
		
		Traversal.inorder(root);
		System.out.println();
/*		Integer x = InorderSuccessor.getInorderSuccessor(root.right.right.right,true);
		System.out.println("Inorder Successor ::" +x);*/
		
		Tree binaryRoot = null; // = new Tree();
		binaryRoot = BinaryTree.insert(binaryRoot, 1); // root.insert(1);
		BinaryTree.insert(binaryRoot, 2);
		BinaryTree.insert(binaryRoot, 3);
		BinaryTree.insert(binaryRoot, 4);
		Traversal.levelOrder(binaryRoot); 
		//root.isBST();
		
		result = BinaryTree.isBinarySearchTree(binaryRoot, 0, 50);
		System.err.println(result);
		
/*		Tree root1 = null;
		root1 = insert(root1,15);
		insert(root1,20);
		insert(root1,12);
		Traversal.levelOrder(root1);

		boolean isSubTree = SubTrees.isSubTree(root, root1);
		System.out.println(isSubTree);*/
		
		//Traversal.inorder(root);
		//Traversal.levelOrder(root);
		//BalancedTree.isBalancedTree(root);
		//MinHeightBST.insertMinHeightBST();		
	}
}
