class Solution {
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        solve(root, 0);
        return this.sum;
    }

    public void solve(TreeNode node, int dir){
        
        if(node == null) return;

        if (node.left == null && node.right == null && dir==1) {
            this.sum += node.val;
            return;
        }

        solve(node.left, 1);
        solve(node.right, 2);
    }

}