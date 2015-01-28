import java.util.LinkedList;
import java.util.Queue;


public class Traversal {

	public static void inorder(Tree root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + "--");
		inorder(root.right);
	}
	
	public static void preorder(Tree root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + "--");
		inorder(root.left);
		inorder(root.right);
	}
	
	public static void postorder(Tree root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.println(root.data);
	}
	
	public static void levelOrder(Tree root){
		if(root == null){
			System.out.println("Root is null");
			return;
		}
		
		Queue<Tree> q = new LinkedList<Tree>();
		q.add(root);
		
		while(q.isEmpty() != true){
			Tree node = q.remove();
			System.out.print(node.data + "--");
			if(node.left != null) {
				q.add(node.left);
			}
			if(node.right != null) {
				q.add(node.right);
			}			
		}
		System.out.println();
	}
}
