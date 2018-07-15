package com.haibo.offer;



/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/15/015
 * 输入一个链表，输出该链表中倒数第k个结点。
 *思路：两个指针，先让第一个指针和第二个指针都指向头结点，然后再让第一个指正走(k-1)步，到达第k个节点。
 * 然后两个指针同时往后移动，当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了
 */
public class num15 {
    public class Node {//定义链表
        int val;
       Node next = null;
        Node(int val) {
            this.val = val;
        }
    }
    public Node findElem(Node head,int k) {
        if (head == null || k <= 0) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - i; i++) {
            p1 = p1.next;
            while (p1 != null) {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return p2;
    }
}