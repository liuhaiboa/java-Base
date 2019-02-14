package com.haibo.MySuanFa;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/28/028
 */
public class LinkedList {

        Node head=null;

        public void addNode(int d){//向链表加元素
            Node newNode=new Node(d);
            if(head==null){//空
                head=newNode;
                return;
            }
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        public void insertList(int index,Node node){//向指定位置插入元素
            if(index<1||index>length()+1){//首先需要判断指定位置是否合法，
                System.out.println("插入位置不合法。");
                return;
            }
            int length=1;
            Node temp=head;
            while(head.next!=null){
                if(index==length++){
                    node.next=temp.next;
                    temp.next=node;
                    return;
                }
                temp=temp.next;

            }
        }
        //删除元素
        public void delNodeByIndex(int index){
            if(index<1||index>length()){
                System.out.print("删除位置不合理");
                return;
            }
            int length=1;
            Node temp=head;
            while (temp.next!=null){
                if(index==length++){
                    temp.next=temp.next.next;

                }
            }
        }
        //返回节点的长度
        public int length(){
            int length=0;
            Node temp=head;
            while (temp!=null){
                length++;
                temp=temp.next;
            }
            return length;
        }
        public void print(){//遍历链表
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    public  void reverse(Node head){
        Node pReversedHead = head; // 反转后的头节点
        Node pNode = head; // 当前节点
        Node pPreV = null; // 已经反转好的链表的尾部，
        while(pNode != null){
            Node pNext = pNode.next; // 待反转头部
            if(pNext == null){
                pReversedHead = pNode;
            }
            pNode.next = pPreV; // 反转当前节点的指针
            pPreV = pNode; // 已经反转好的链表的尾部置为当前节点
            pNode = pNext; // 将当前节点向后移
        }
        this.head = pReversedHead; // 将最后一个节点置为头节点
    }

}