import java.util.LinkedList;
import java.util.Queue;

/*Randomly insert into tree*/
public class BinaryTree {	
	
	public static Tree insert(Tree root, int data) {
		if(root == null) {
			root = new Tree(data);
			return root;
		}
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.add(root);
		
		while(queue.isEmpty() == false) {
			Tree node = queue.remove();
			if(node.left == null) {
				node.left = new Tree(data);
				break;
			} else if (node.right == null) {
				node.right = new Tree(data);
				break;
			} else {
				queue.add(node.left);
				queue.add(node.right);
			}
		}
		return root;
	}

	public static boolean isBinarySearchTree(Tree root,int lower, int upper) {	
		if(root == null) {
			return true;
		}
		return root.data >= lower && root.data <= upper &&
			isBinarySearchTree(root.left, lower, root.data - 1) && 
			isBinarySearchTree(root.right, root.data + 1, upper);
	}
	
}
