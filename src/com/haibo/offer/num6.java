package com.haibo.offer;

import javax.swing.tree.TreeNode;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/12/012
 */
public class num6 {/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                //注意pre的位置，要用偏移量，不能用i，因为i是在变化
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
        return root;
    }





//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//        return reConstructBinaryTree0(pre, 0, pre.length, in, 0, in.length);
//    }
//
//    public TreeNode reConstructBinaryTree0(int [] pre, int preStart, int preEnd, int [] in, int inStart, int inEnd) {
//        if (preStart >= preEnd) { // way out
//            return null;
//        }
//        int rootIndex = indexOf(in, inStart, inEnd, pre[preStart]);
//        TreeNode root = new TreeNode(pre[preStart]);
//        int leftPreStart = preStart + 1;
//        int leftPreEnd = leftPreStart + (rootIndex - inStart);
//        int leftInStart = inStart;
//        int leftInEnd = rootIndex;
//        // 构建左子树
//        root.left = reConstructBinaryTree0(pre, leftPreStart, leftPreEnd, in, leftInStart, leftInEnd);
//
//        int rightPreStart = leftPreEnd;
//        int rightPreEnd = preEnd;
//        int rightInStart = rootIndex + 1;
//        int rightInEnd = inEnd;
//        // 构建右子树
//        root.right = reConstructBinaryTree0(pre, rightPreStart, rightPreEnd, in, rightInStart, rightInEnd);
//        return root;
//    }
//
//    // 找下标
//    public int indexOf(int[] array, int start, int end, int value) {
//        for (int i = start; i < end; i++) {
//            if (array[i] == value) {
//                return i;
//            }
//        }
//        return -1;
//    }
}




//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
//}
//public class TestRecoverBinaryTree {
//    public TreeNode reConstructBinaryTree(int [] preOrder,int [] inOrder)
//    {
//        int pLen = preOrder.length;
//        int iLen = inOrder.length;
//        if(pLen==0 && iLen==0)
//        {
//            return null;
//        }
//        return  btConstruct( preOrder, inOrder, 0, pLen-1,0, iLen-1);
//    }
//    //构建方法，pStart和pEnd分别是前序遍历序列数组的第一个元素和最后一个元素；
//    //iStart和iEnd分别是中序遍历序列数组的第一个元素和最后一个元素。
//    public TreeNode btConstruct(int[] preOrder, int[] inOrder, int pStart, int pEnd,int iStart,int iEnd)
//    {
//        //建立根节点
//        TreeNode tree = new TreeNode(preOrder[pStart]);
//        tree.left = null;
//        tree.right = null;
//        if(pStart == pEnd && iStart == iEnd)
//        {
//            return tree;
//        }
//        int root = 0;
//        //找中序遍历中的根节点
//        for(root=iStart; root<iEnd; root++)
//        {
//            if(preOrder[pStart] == inOrder[root])
//            {
//                break;
//            }
//        }
//        //划分左右子树
//        int leftLength = root - iStart;//左子树
//        int rightLength = iEnd - root;//右子树
//        //遍历左子树
//        if(leftLength>0)
//        {
//            tree.left = btConstruct(preOrder, inOrder,  pStart+1,  pStart+leftLength, iStart, root-1);
//        }
//        //遍历右子树
//        if(rightLength>0)
//        {
//            tree.right = btConstruct(preOrder, inOrder,  pStart+leftLength+1,  pEnd, root+1, iEnd);
//        }
//        return tree;
//    }
//}
