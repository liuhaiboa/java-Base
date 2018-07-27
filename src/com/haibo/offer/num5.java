package com.haibo.offer;

import org.junit.Test;

import java.util.Stack;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/12/012
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class num5 {
    //递归方式，递归在本质上就是一个栈结构
    public static void printListReverse_recursively(listNode headNode){
        if(headNode!=null) {
            if(headNode.next!=null) {
                printListReverse_recursively(headNode.next);
            }
            System.out.println(headNode.data);
        }
    }

    public static void printListReverse(listNode headNode){
        Stack<listNode> sk=new Stack<listNode>();
        while(headNode!=null){
            sk.push(headNode);
            headNode=headNode.next;
        }
        while(!sk.isEmpty()){
           System.out.println( sk.pop().data);
        }

    }


    public static void main(String[] args) {
        listNode node1=new listNode();
        listNode node2=new listNode();
        listNode node3=new listNode();
        node1.data=1;
        node2.data=2;
        node3.data=3;
        node1.next=node2;
        node2.next=node3;
        num5 n5=new num5();
      //  n5.printListReverse_recursively(node1);
        n5.printListReverse(node1);
    }
}
class listNode{
    int data;
    listNode next;
}
//    public static void f(int i){
//        int a;
//        if(i!=5){
//            System.out.print(i);
//            a=i+1;
//            f(a);
//        }
//        System.out.print(i);
//    }

//    public void printListFromTailToHead(ListNode listNode) {
//        if(listNode != null){
//            if(listNode.next != null){
//                printListFromTailToHead(listNode.next);
//            }
//            System.out.print(""+listNode.val);
//        }
//    }
//
//
//
//    public class ListNode {//定义链表
//        int val;
//        ListNode next = null;
//        ListNode(int val) {
//           this.val = val;
//        }
//  }
//}