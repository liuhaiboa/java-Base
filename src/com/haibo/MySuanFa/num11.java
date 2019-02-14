package com.haibo.MySuanFa;

import java.util.Hashtable;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/27/027
 * 删除链表中重复的数据
 */

public class num11 {
    public static void main(String[] args) {
        LinkedList node=new LinkedList();
        node.addNode(1);
        node.addNode(1);
        node.addNode(9);
        node.addNode(5);
        node.addNode(5);
        //deleHashTable(MyNode.head);
        deleDup(node.head);

        node.print();
    }



    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    //剑指offer57 删除链表重复节点
    public static ListNode deleOffer(ListNode pHead){
        if(pHead==null)return null;
        ListNode preNode = null;
        ListNode node = pHead;
        while(node!=null){
            ListNode nextNode = node.next;
            boolean needDelete = false;//判断相邻两个点是否相等
            if(nextNode!=null&&nextNode.val==node.val){
                needDelete = true;
            }
            if(!needDelete){
                preNode = node;
                node = node.next;
            }else{
                int value = node.val;
                ListNode toBeDel = node;
                while(toBeDel!=null&&toBeDel.val == value){
                    nextNode = toBeDel.next;
                    toBeDel = nextNode;
                    //此处不能少，找到第一个pHead，以后的preNode就不为null了
                    if(preNode==null)
                        pHead = nextNode;
                    else
                        preNode.next = nextNode;
                    node = nextNode;
                }
            }
        }

        return pHead;
    }


    public static void deleHashTable(Node head){
        Hashtable hashtable=new Hashtable();
        Node tem=head;
        Node pre=null;
        while(tem!=null){
            if(hashtable.containsKey(tem.data)){
                pre.next=tem.next;
            }else{
                hashtable.put(tem.data,1);
                pre=tem;
            }
            tem=tem.next;
        }
    }

    public static void deleDup(Node head) {
        Node p = head;
        Node q = null;
        while (p != null) {
            q = p;
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;
                } else
                    q = q.next;

            }
            p = p.next;

        }
    }
}
