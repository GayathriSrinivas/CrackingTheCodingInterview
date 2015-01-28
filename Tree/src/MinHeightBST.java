
public class MinHeightBST {

	private static int[] sortedInput = {1,2,3,4,5,6,7};
	private static int low = 0;
	private static int high = sortedInput.length - 1;
	
	public static Tree insertMinheight(Tree root,int l, int h) {
		if(l <= h) {
			int mid = (l + h)/2;
			root = Tree.insert(root, sortedInput[mid]);
			insertMinheight(root,l, mid -1);
			insertMinheight(root,mid + 1, h );
			return root;
		} else {
			return null;
		}
	}
	
	public static Tree insertSortedArray(Tree root) {
		for (int i : sortedInput) {
			root = Tree.insert(root, i);
		}
		return root;	
	}
	
	public static void insertMinHeightBST() {

		Tree root = null;
		root = insertMinheight(root,low, high);
		
		Tree sortedRoot = null;
		sortedRoot = insertSortedArray(sortedRoot);
		
		Traversal.levelOrder(root);
		Traversal.levelOrder(sortedRoot);
		BalancedTree.getHeight(root);
		BalancedTree.getHeight(sortedRoot);
	}
}
