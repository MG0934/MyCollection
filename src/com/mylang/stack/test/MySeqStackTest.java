package com.mylang.stack.test;

import com.mylang.stack.MySeqStack;
import com.mylang.stack.MyStack;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MySeqStackTest {
    public static void main(String[] args) {

        MyStack<String> stack = new MySeqStack<>();
        System.out.println(stack.isEmpty());//判空
        stack.push("A");//入栈
        stack.push("B");
        stack.push("C");
        System.out.println(stack.toString());
        stack.pop();// 出栈
        stack.push("D");
        stack.get();// 取栈顶元素
        System.out.println(stack.toString());
        System.out.println(stack.isEmpty());//判空
    }
}
