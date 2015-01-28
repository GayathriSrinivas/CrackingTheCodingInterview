
public class SubTrees {

	public static boolean isSubTree(Tree node1, Tree node2) {
		if(node1 == null && node2 == null) {
			return true;
		}
		
		if(node1 == null || node2 == null) {
			return false;
		}
		
		if(node1.data == node2.data) {
			return isSubTree(node1.left, node2.left) &&
					isSubTree(node1.right, node2.right);
		} else {
			return isSubTree(node1.left, node2) ||
			isSubTree(node1.right, node2);
		}
		
	}
}
