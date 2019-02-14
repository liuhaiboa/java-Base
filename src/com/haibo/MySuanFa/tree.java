package com.haibo.MySuanFa;

import java.util.*;
import java.util.LinkedList;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by liuhaibo on 19/1/3.
 */
public class tree {
    class Node{
        public int data;
        public Node left;
        public Node right;
        public int leftMaxDestance;
        public int rightMaxDestance;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public class BinaryTree1{
        private int maxLen=0;
        private int max(int a,int b){
            return a>b?a:b;
        }

    public void findMaxDistance(Node root){
        if (root == null) {
            return;
        }
        if (root.left == null) {
            root.leftMaxDestance=0;
        }
        if (root.right == null) {
            root.rightMaxDestance=0;
        }
        if (root.left != null) {
            findMaxDistance(root.left);
        }
        if (root.right != null) {
            findMaxDistance(root.right);
        }
        if (root.left != null) {//计算左子树中距离跟结点的最大距离
            root.leftMaxDestance=max(root.left.leftMaxDestance,root.left.rightMaxDestance)+1;
        }
        if (root.right != null) {
            root.rightMaxDestance=max(root.right.leftMaxDestance,root.right.rightMaxDestance)+1;
        }
        if (root.leftMaxDestance+root.rightMaxDestance>maxLen) {
            maxLen=root.leftMaxDestance+root.rightMaxDestance;
        }
    }
    public class BinaryTree {
        private Node root;

        public BinaryTree() {
            root = null;
        }

        //将data插入到排序二叉树种
        public void insert(int data) {
            Node newNode = new Node(data);
            if (root == null) {
                root=newNode;
            }else {
                Node current=root;
                Node parent;
                while (true){//寻找插入位置
                    parent=current;
                    if(data<current.data){
                        current=current.left;
                        if(current==null){
                            parent.left=newNode;
                            return;
                        }
                    }else {
                        current=current.right;
                        if(current==null){
                            parent.right=newNode;
                            return;
                        }
                    }
                }
            }
        }

        //中序遍历 递归实现 中序和后序就是更改三行代码的顺序
        public void inOrder(Node localRoot){
            if (localRoot != null) {
                inOrder(localRoot.left);
                System.out.println(localRoot.data);
                inOrder(localRoot.right);
            }
        }


        //层次遍历二叉树
        public void layerTranverse(){
            if (this.root == null) {
                return;
            }
            Queue<Node> q=new LinkedList<Node>();
            q.add(this.root);
            while (!q.isEmpty()){
                Node n=q.poll();
                System.out.println(n.data);
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }

    }
}}
