package com.mylang.list;

/**
 * description: 循环单链表
 * create by : Mxy
 * time : 2018-4-11 09:38:43
 */
public class MyCircularSinglyLinkedList<E> extends MyHeadSinglyLinkedList<E> {

    /**
     * 构造空单链表
     */
    public MyCircularSinglyLinkedList() {
        this.head = new Node<E>((E) null);
        this.rear = this.head;
        this.rear.next = this.head;
        this.n = 0;
    }

    @Override
    public boolean add(int index, E element) {
        //不允许插入非空元素
        if(element==null){
            return false;
        }
        //尾插入，插入到最后
        if(index >=this.n){
            this.add(element);
        }else{
            Node<E> p = this.head;
            int i = 0;
            while(p!=null && i<index){
                i++;
                p = p.next ;
            }

            //线面操作可以包含头插入和中间插入
            Node<E> q = new Node<>(element);
            q.next = p.next;
            p.next = q;
            this.n++;
            return true;
        }

        return false;
    }

    @Override
    public boolean add(E element) {

        if(element==null){
            return false;
        }
        //尾插入
        this.rear.next = new Node<>(element);
        // 移动尾指针
        this.rear = this.rear.next;
        //把尾结点的next域指向head结点
        this.rear.next = this.head;
        //链表长度增加
        this.n++;

        return true;
    }

    @Override
    public E remove(int index) {

        E old = null;

        // 头删除,中间删除,尾删除
        if(index>=0 && index <=n){
            Node<E> p = this.head;
            int i = 0;
            // 从头结点开始遍历,定位到待删除结点的前驱结点
            while (p.next!=null && i < index){
                i++;
                p = p.next;
            }

            if(p.next!=null){
                old = p.data;
                if(p.next == this.rear){
                    // 如果p结点的后一个结点是尾结点,则移除之后尾结点指针前移
                    this.rear = p;
                    //把尾结点的next域指向head结点
                    this.rear.next = this.head;
                }
                // 删除p结点的后继结点
                p.next = p.next.next;
                // 链表长度减少
                this.n--;
                return old;
            }
        }
        return old;
    }

    @Override
    public void clear() {
        this.head.next = this.head;
        this.n = 0;
    }

    @Override
    public String toString() {// 返回所有元素值对应的字符串
        String str = "(";
        Node<E> p = this.head.next;
        while (p.data != null) {
            str += p.data.toString();
            p = p.next;
            if (p != null) {
                str += ", ";
            }
        }
        return str + ")";
    }
}
