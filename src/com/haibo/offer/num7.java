package com.haibo.offer;

import java.util.Stack;

/**
 * Created with IDEA.
 * User:haibo.
 * DATE:2018/7/12/012
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * 思路：入栈给stack1，出栈时，若stack2不为空，则出栈，若为空，把stack1的内容全都放入stack2，然后再出栈
 */
public class num7 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }


    public int pop() {

        while(!stack2.isEmpty())
        {
            return stack2.pop();
        }

        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}