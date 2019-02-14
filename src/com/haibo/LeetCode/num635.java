package com.haibo.LeetCode;

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/**
 * Created by liuhaibo on 19/1/7.
 */
public class num635 {
      int k;
     class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }

         public TreeNode getLeft() {
             return left;
         }

         public TreeNode getRight() {
             return right;
         }
     }

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        return preOrder(root,hashset,k);
    }
    public boolean preOrder(TreeNode root,HashSet<Integer> hashset,int k){
        if(root == null)
            return false;
        if(hashset.contains(k - root.val)){
            return true;
        }
        hashset.add(root.val);
        return preOrder(root.left,hashset,k) || preOrder(root.right,hashset,k);
    }
}
