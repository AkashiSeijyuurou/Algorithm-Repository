/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //中序遍历是递增的
//递归方法
class Solution1 {
    public boolean isValidBST(TreeNode root) {
		return verify(root, null, null);
    }

    public boolean verify(TreeNode root, Integer lower, Integer upper){
		if(root == null)
			return true;
		
		int val = root.val;
		
		if(lower != null && val <= lower) 
			return false;
		
		if(upper != null && val >= upper)
			return false;
		
		if(!verify(root.right, val, upper)) return false;
		if(!verify(root.left, lower, val)) return false;
		return true;
    }
}

//中序遍历方法
class Solution2 {
	public boolean isValidBST(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		double inOrder = -Double.MAX_VALUE
		
		
		while(!stack.isEmpty || root != null){
			while(root != null){
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop();
			
			if(root.val <= inOrder) return false;
			inOrder = root.val;
			root = root.right;
		}
	}
}

	