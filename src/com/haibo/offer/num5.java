package com.haibo.offer;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/12/012
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class num5 {
    public static void main(String[] args) {

    }

    public void printListFromTailToHead(ListNode listNode) {
        if(listNode != null){
            if(listNode.next != null){
                printListFromTailToHead(listNode.next);
            }
            System.out.print(""+listNode.val);
        }

    }

    public class ListNode {//定义链表
        int val;
        ListNode next = null;
        ListNode(int val) {
           this.val = val;
        }
  }
}