package com.haibo.MySuanFa;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/27/027
 * 链表反转
 */
public class num13 {
    public static void main(String[] args) {

    }
    public void ReverseIteratively(Node head){
        Node pReHead=head;
        Node pNode=head;
        Node pPrev=null;
        while(pNode!=null) {
            Node pNext = pNode.next;
            if (pNext == null)
                pReHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        head=pReHead;
    }

}