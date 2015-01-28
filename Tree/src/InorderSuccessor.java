
public class InorderSuccessor {
	
	public static Integer getInorderSuccessor(Tree node, boolean isOriginalNode) {	
		if( node == null ) {
			return null;
		} 
		if( !isOriginalNode && node.parent == null) {
			return null;
		}
		else if (isOriginalNode && node.right != null) {
			return getMinElement(node.right);
		} else {
			Tree left = findFirstNodeThatIsALeftChild(node);
			return (left == null) ? null : left.data;  
		}
	}
	
	private static Tree findFirstNodeThatIsALeftChild(Tree node) {
		while (node.parent != null) {
			if (node.parent.left == node) {
				return node;
			}
			node = node.parent;
		}
		return null;
	}
	
	private static Integer getMinElement(Tree node){
		while(node.left != null){
			node = node.left;
		}
		return node.data;
	}
}
