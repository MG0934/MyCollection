package com.mylang.list;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MyDoublieLinkedList<E> implements MyList<E> {
    //双链表的头结点
    protected DoubleLinkNode<E> head;

    protected  int n;
    //构造空双链表
    public MyDoublieLinkedList(){

        this.head = new DoubleLinkNode<>(null,null,null);

        this.n = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.n==0;
    }

    @Override
    public int length() {
        return this.n;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public boolean add(int index, E element) {

        if(element==null || index < 0){
            return false;
        }
        //尾部插入
        if(index > this.n){
            this.add(element);
        }else{
            DoubleLinkNode<E> p = this.head;
            int i = 0;
            while (p!=null && i<index){
                i++;
                p=p.next;
            }
            if(p!=null){
                DoubleLinkNode<E> q = new DoubleLinkNode<>(element);
                q.prev = p.prev;
                q.next = p;
                p.prev.next = q;
                p.prev = q;
                this.n++;// 链表长度加1
            }
        }

        return false;
    }

    @Override
    public boolean add(E element) {
        if (element == null) {// 不允许插入空元素
            return false;
        }
        DoubleLinkNode<E> p = this.head;
        while (p.next != null) {// 遍历双链表
            p = p.next;
        }
        DoubleLinkNode<E> q = new DoubleLinkNode<E>(element);// 创建要插入的结点q
        p.next = q;
        q.prev = p;
        this.n++;// 链表长度加1
        return true;
    }

    @Override
    public E remove(int index) {
        E old = null;
        if (index >= 0) {// 要删除元素的索引不能小于0
            if (index == 0) {// 等于0是头结点,不能移除头指针,如果值是0,赋值为1
                index = 1;
            }
            DoubleLinkNode<E> p = this.head;// p结点指向头结点
            int i = 0;
            while (p != null && i < index) {// 遍历寻找元素
                i++;
                p = p.next;
            }
            if (p != null) {
                old = p.date;
                p.prev.next = p.next;
                if (p.next != null) {
                    p.next.prev = p.prev;
                }
                this.n--;// 双链表长度减1
            }
        }
        return old;
    }

    @Override
    public void clear() {
        this.head.next = null;
        this.n =0;
    }

    @Override
    public String toString() {// 返回所有元素值对应的字符串
        String str = "(";
        DoubleLinkNode<E> p = this.head.next;
        while (p != null) {
            str += p.date.toString();
            p = p.next;
            if (p != null) {
                str += ", ";
            }
        }
        return str + ")";
    }
}
