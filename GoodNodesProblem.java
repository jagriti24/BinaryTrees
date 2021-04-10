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

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/

class GoodNodesProblem {
    
    
    public int goodNodes(TreeNode root) {
        return recur(root,Integer.MIN_VALUE);
    }
    
    public int recur(TreeNode node, int maxSoFar){
       
        if(node==null){
            return 0;
        }
        
        int s=0; 
        if(node.val>=maxSoFar){
            maxSoFar=node.val;
            s=1;
        }
        return s+recur(node.left,maxSoFar)+recur(node.right,maxSoFar);
    }
}
