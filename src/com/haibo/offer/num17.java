package com.haibo.offer;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/15/015
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 递归
 */
public class num17 {
     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
        public ListNode Merge(ListNode list1, ListNode list2) {
            if(list1==null)
                return list2;
            else if(list2==null)
                return list1;
            ListNode mergeHead=null;
            if(list1.val<list2.val){
                mergeHead=list1;
                mergeHead.next=Merge(list1.next, list2);
            }
            else{
                mergeHead=list2;
                mergeHead.next=Merge(list1, list2.next);
            }
            return mergeHead;

        }
}