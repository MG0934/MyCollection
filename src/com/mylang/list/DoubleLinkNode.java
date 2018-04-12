package com.mylang.list;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class DoubleLinkNode<E> {

    public E date;
    //前驱结点
    public DoubleLinkNode<E> prev;
    //后继节点
    public DoubleLinkNode<E> next;

    public DoubleLinkNode(E date, DoubleLinkNode<E> prev, DoubleLinkNode<E> next) {
        this.date = date;
        this.prev = prev;
        this.next = next;
    }

    public DoubleLinkNode(E date) {
        this(date,null,null);
    }

    public DoubleLinkNode(){

    }
}

