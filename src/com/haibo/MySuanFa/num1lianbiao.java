package com.haibo.MySuanFa;

import java.util.Hashtable;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/27/027
 */
public class num1lianbiao {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        //MyNode.insertList(2,new Node(4));
        linkedList.print();
        //System.out.print(MyNode.length());
        // 链表逆序
        linkedList.reverse(linkedList.head);
        linkedList.print();


    }




}

