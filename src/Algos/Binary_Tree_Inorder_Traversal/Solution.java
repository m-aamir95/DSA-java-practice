package Algos.Binary_Tree_Inorder_Traversal;

import java.util.List;
import java.util.ArrayList;


 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
      }
  }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> elems =  new ArrayList<Integer>();
        inorderTraversal_Core(root, elems);
        return elems;
    }

    private void inorderTraversal_Core(TreeNode node, List<Integer> elems){

        if(node == null) return;

        //Inorder traversal (Left,Node, Right)
        inorderTraversal_Core(node.left, elems);
        elems.add(node.val);
        inorderTraversal_Core(node.right, elems);
    }
}