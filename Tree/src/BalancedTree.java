
public class BalancedTree {

	private static final int BALANCED_TREE_DIFF = 1;
	
	public static int height(Tree node){
		if(node == null) {
			return 0;
		}
		return Math.max(height(node.left), height(node.right)) + 1;
	}
		
	public static boolean isBalanced(Tree node) {
		if(node == null){
			return true;
		}	
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		System.out.println(leftHeight + "::" + rightHeight);
		int height = leftHeight - rightHeight;
		
		if(Math.abs(height) > BALANCED_TREE_DIFF) {
			return false;
		} else {
			return isBalanced(node.left) && isBalanced(node.right);
		}
	}
	
	public static int optimizedHeight(Tree node) {
		if(node == null) {
			return 0;
		}
		
		/*Check if left is balanced*/
		int leftHeight = optimizedHeight(node.left);
		if(leftHeight == -1){
			return -1;
		}
		
		/*Check if right is balanced*/
		int rightHeight = optimizedHeight(node.right);
		if (rightHeight == -1) {
			return -1;
		}
		
		int height = leftHeight - rightHeight;
		if(Math.abs(height) > BALANCED_TREE_DIFF) {
			return -1;
		} else {
			/*Return Height*/
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	/*Wrapper function around balanced*/
	public static void isBalancedTree(Tree root) {
		if(isBalanced(root)) {
			System.out.println("Tree is balanced !!");
		} else {
			System.out.println("Tree is not balanced :(");
		}
	}
	
	/*Wrapper function around height*/
	public static void getHeight(Tree node){
		System.out.println("The height of the tree is ::" + height(node));
	}
	
}
