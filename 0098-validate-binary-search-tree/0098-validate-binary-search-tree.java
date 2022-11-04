class Solution {
  public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
  }

  public boolean isValidBST(TreeNode node, Integer minLimit, Integer maxLimit) {
      
      if (node == null) return true;
    
      if (minLimit != null && node.val <= minLimit) return false;
      if (maxLimit != null && node.val >= maxLimit) return false;
      
      return isValidBST(node.left, minLimit, node.val) && isValidBST(node.right, node.val, maxLimit);

  }

}