package com.mylang.list;

/**
 * description:链表节点类
 * create by : Mxy
 * time : 2018-4-9 16:43:34
 */
public class Node<E> {

    //链表数据域 用来保存数据
    public E data;
    //地址域，引用后继节点
    public Node<E> next;
    //构造器
    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node(E data) {
        this.data = data;
    }

    public Node(Node<E> next) {
        this.next = next;
    }

}
