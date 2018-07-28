package com.haibo.MySuanFa;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/27/027
 * 查找倒数第k个元素
 */
public class num12 {
    public static void main(String[] args) {

    }
    public  Node fingK(Node head,int k){
        if(k<1||k>length())
            return null;
        Node p1=head;
        Node p2=head;
        for(int i=0;i<k-1;i++)
            p1=p1.next;
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }
    class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }
    }
}