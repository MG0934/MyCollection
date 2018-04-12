package com.mylang.stack.test;

import com.mylang.stack.MyLinkedStack;
import com.mylang.stack.MyStack;

/**
 * description: 链栈实现
 * create by : Mxy
 * time : 2018-4-11 10:51:31
 */
public class MyLinkedStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyLinkedStack<>();
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
