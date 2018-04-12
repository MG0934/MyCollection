package com.mylang.stack;

import com.mylang.list.Node;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MyLinkedStack<E> implements MyStack<E> {
    //栈顶元素
    private Node<E> top;

    public MyLinkedStack() {
        this.top = null;
    }

    @Override
    public boolean isEmpty() {

        return this.top == null;
    }

    @Override
    public boolean push(E element) {

        if (element == null) {// 空对象不能入栈
            return false;
        }
        this.top = new Node<E>(element, this.top);// 新的元素作为栈顶元素，原来的栈顶元素作为其后继元素
        return true;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {// 判断是否为空空栈
            E temp = this.top.data;// 取栈顶元素
            this.top = this.top.next;// 删除原来的栈顶结点，改变栈顶元素
            return temp;// 返回原来的栈顶元素值
        }
        return null;
    }
    /**
     * 取栈顶元素值，元素未出栈，栈顶元素未改变
     */
    @Override
    public E get() {
        if (!isEmpty()) {// 判断是否为空栈
            return this.top.data;// 返回栈顶元素值
        }
        return null;
    }
    /**
     * 返回栈中各元素的字符串表示
     */
    @Override
    public String toString() {
        String str = "(";
        Node<E> p = this.top;// 新建一个结点指向栈顶结点top
        while (p != null) {
            if (p.next == null) {// 判断是否有后继结点
                str += p.data;
            } else {
                str += p.data + ",";
            }
            p = p.next;
        }
        return str + ")";
    }

}
