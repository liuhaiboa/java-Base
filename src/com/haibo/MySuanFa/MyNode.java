package com.haibo.MySuanFa;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by liuhaibo on 18/12/27.
 */
public class MyNode {
        class Node{
            Node next =null;
            int data;
            public Node(int data){this.data=data;}
        }
        Node head=null;
        /**链表添加元素
         * @param d 插入数据的内容
         *          首先考虑链表是否为空，然后考虑向链表尾查数据，
         */
        public void addNode(int d){
            Node newNode= new Node(d);
            if(head==null){
                head=newNode;
                return;
            }
            Node tmp=head;
            while (tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newNode;
        }

        /**向链表ai和ai-1之间插入数据
         * @param d
         * @param index
         */
        public void addNode(int d,int index){
            Node newNode= new Node(d);
            if(index==1){
               newNode.next=head;
                head=newNode;
            }else {
                Node cur = head;
                int j = 0;
                while (cur != null && j < index - 2) {
                    cur = cur.next;
                    j++;
                }
                newNode.next = cur.next;
                cur.next = newNode;
            }
        }

    /**删除元素
     * @param index 删除第几个位置的元素
     * @return 返回true删除成功，false删除失败
     */
        public Boolean delete(int index){
            if(index<1||index>length()){return false;}
            if(index == 1){
                head=head.next;
                return true;
            }
            int i=2;
            Node preNode=head;
            Node curNode=preNode.next;
            while (curNode!=null){
                if(i ==index){
                    preNode.next=curNode.next;
                    return true;
                }
                preNode=curNode;
                curNode=curNode.next;
                i++;
            }
            return true;
        }

    /**
     * @return 返回节点长度
     */
        public int length(){
            int length=0;
            Node temp=head;
            while(temp!=null){
                length++;
                temp=temp.next;
            }
            return length;
        }
    /**
     * 打印链表
     */
        public void printListNode(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }


        public void deleteDubbo(Node head){
            Hashtable<Integer,Integer> table=new Hashtable<>();
            Node temp=head;
            Node pre=null;
            while (temp!=null){
                if(table.containsKey(temp.data)){
                    pre.next=temp.next;
                }else {
                    table.put(temp.data,1);
                    pre=temp.next;
                }
            }
        }

    public void deleteDubbo2(Node head){
        Node wai=head;
        while (wai!=null){
            Node nei=wai;
            while (nei.next!=null){
                if(wai.data==nei.next.data){
                    wai.next=nei.next.next;
                }else{
                    nei=nei.next;
                }
                wai=wai.next;
            }
        }
    }
    public Node select(Node head, int k){
        if(k<1||k>this.length()){
            return null;
        }
        Node fast=head;
        Node low=head;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            low=low.next;
        }
        return low;
    }

    public void reverse(Node head){
        Node preHead=head;
        Node m=head.next;
        Node temp=null;
        while (m.next!=null){
            temp=m.next;
            m.next=preHead;
            preHead.next=null;
            temp.next=m;
        }



    }

    /**就地反转法
     * 把当前链表的下一个节点pCur插入到头结点dummy的下一个节点中，就地反转。
     dummy->1->2->3->4->5的就地反转过程：
     dummy->2->1->3->4->5
     dummy->3->2->1->4->5
     dummy->4>-3->2->1->5
     dummy->5->4->3->2->1
     pCur是需要反转的节点。prev连接下一次需要反转的节点.反转节点pCur.纠正头结点dummy的指向.pCur指向下一次要反转的节点
     伪代码
     1 prev.next = pCur.next;
     2 pCur.next = dummy.next;
     3 dummy.next = pCur;
     4 pCur = prev.next;
     循环条件pCur is not null
     * @param head
     */
    public Node reverse1(Node head){
        if(head == null) {return head;}
        Node dummy = new Node(-1);//理解哨兵
        dummy.next = head;
        Node prev = dummy.next;//连接下一次需要反转的节点
        Node pCur = prev.next;//当前需要反转的节点。
        while (pCur != null) {
            prev.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = prev.next;
        }
        return dummy.next;

    }



    /** 新建一个头结点，遍历原链表，把每个节点用头结点插入到新建链表中。最后，新建的链表就是反转后的链表。
     * https://www.cnblogs.com/byrhuangqiang/p/4311336.html
     * @param head
     * @return
     */
    public Node reverse2(Node head){
       Node dummy = new Node(-1);
        Node pCur = head;
        while (pCur != null) {
            Node pNex = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = pNex;
        }
        return dummy.next;
    }
    public void reSout(Node phead){
        if(phead!=null){
            reSout(phead.next);
            System.out.println(phead.data);
        }
    }
    public Node searchMid(Node head){
        Node p=head;
        Node q=head;
        while (p!=null&&p.next!=null&&p.next.next!=null){
            p=p.next.next;
            q=q.next;
        }
        return q;
    }
    public boolean cueNode(Node head){
        Node fast=head;
        Node low= head;
        if(fast==null){
            return false;
        }
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            low=low.next;
            if (fast == low) {
                return true;
            }
        }
        return !(fast==null||fast.next==null);
    }
    public  Node findCurCport(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;

    }
    public boolean deleteNode(Node node){//这个参数说明不知道链表头结点
        if (node == null||node.next==null) {
            return false;
        }
        int temp=node.data;
        node.data=node.next.data;
        node.next.data=temp;
        node.next=node.next.next;
        return true;
    }
    public boolean isInter(Node h1,Node h2){
        if(h1==null||h2==null){return false;}
        //找到h1和h2的尾节点
        Node tail1=h1;
        Node tail2=h2;
        while (tail1.next!=null){tail1=tail1.next;}
        while (tail2.next!=null){tail2=tail2.next;}
        return tail1==tail2;
    }




    @Test
    public  void test() {
        MyNode myNode =new MyNode();
        myNode.addNode(1);
        myNode.addNode(2);
        myNode.addNode(3);
        myNode.addNode(4);

       // myNode.searchMid(myNode.head);
      //  System.out.println(myNode.head.data);
        //myNode.reSout(myNode.head);
        myNode.reverse1(myNode.head);

        // myNode.addNode(4,1);
       // myNode.printListNode();
        //myNode.delete(1);
        myNode.printListNode();
       // System.out.println(myNode.select(myNode.head,2));
    }

}
