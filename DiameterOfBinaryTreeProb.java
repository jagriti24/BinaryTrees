//https://leetcode.com/problems/diameter-of-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class DiameterOfBinaryTreeProb {
    int maxSum =0;
    public int diameterOfBinaryTree(TreeNode root) {
        int sum = recur(root);
        return maxSum;
    }
    
    public int recur(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = recur(root.left);
        int right = recur(root.right);
        
        int up = Math.max(left,right)+1;
        int sum = left+right;
        
        if(sum>maxSum){
            maxSum = sum;
        }
        return up;
    }
}
