package com.mylang.list;

/**
 * description: 可逆转的单链表,继承自SinglyLinkedList
 * create by : Mxy
 * time : 2018-4-10 14:04:47
 */
public class MyReverseSinglyLinkedList <E> extends MySingleLinkList<E>{

    public MyReverseSinglyLinkedList() {
        super();
    }

    /**
     * 实现单链表逆转的方法
     */
    public void reverse(){

        Node<E> p = this.head;

        Node<E> front = null;

        Node<E> q = null;

        while (p!=null){
            // 设置q结点是p的后继结点
            q = p.next;
            //使p的后继结点指向其前驱节点
            p.next = front;
            //front节点向后移动
            front = p;
            //p结点向后移动
            p = q;
        }

        this.head = front;
    }
}
