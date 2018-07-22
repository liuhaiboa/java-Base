package com.haibo.offer;

import javax.xml.soap.Node;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/15/015
 *反转链表：输入一个链表，反转链表后，输出链表的所有元素。
 */
public class num16 {

    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
       ListNode p1=head;
        ListNode p2=head.next;
        ListNode temp=null;
        while(p2.next!=null){
            temp=p2.next;
            p2.next=p1;
            p1=p2;
            p2=temp;
        }
        p2.next=p1;
        head=p2;

        return temp;

//        ListNode pPre = null;
//        ListNode p = head;
//        ListNode pNext = head.next;
//        ListNode newHead = null;
//
//        while (p != null) {
//            pNext = p.next;//一定要记录下来后面的节点
//            if (pNext == null)
//                newHead = p;
//            p.next = pPre;//这里的方向已经转变
//            pPre = p;
//            p = pNext;//将保存的后面的节点作为下一次循环的p
//
//        }
//        return newHead;

    }



    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
}}