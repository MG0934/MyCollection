package com.mylang.list;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MyHeadSinglyLinkedList<E> extends MySingleLinkList<E> {

    protected Node<E> head;// 单链表的头结点,指向单链表的头结点

    protected Node<E> rear;// 单链表的尾结点,指向单链表的最后一个结点

    protected int n;// 单链表的长度

    public MyHeadSinglyLinkedList() {// 构造空单链表
        this.head = new Node<E>((E) null);// 构造头结点,元素值为空
        this.rear = this.head;// 构造尾结点,初始化的时候头结点和尾结点都指向头结点
        this.n = 0;// 初始化链表长度为0
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    /**
     * 返回头结点的链表长度为n，时间复杂度为O(1)
     *
     * @return int
     */
    @Override
    public int length() {
        return this.n;
    }

    /**
     * 带头单链表添加数据
     *
     * @param index 索引位置
     * @param element 添加元素
     * @return true or false
     */
    @Override
    public boolean add(int index, E element) {

        if(element==null){
            return false;
        }
        //尾插入，插入在最后
        if(index>=this.n){
            this.add(element);
        }else{
            Node<E> p = this.head;

            int i = 0;

            while (p.next != null && i < index){
                i++;
                p = p.next;
            }

            //下面操作可以包含头插入和中间插入
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

        this.rear.next = new Node<E>(element);// 尾插入
        this.rear = this.rear.next;// 移动尾指针
        this.n++;//链表长度增加
        return true;
    }

    /**
     * 移除索引index处的结点,操作成功返回被移除的对象,失败则返回null
     */
    @Override
    public E remove(int index) {
        E old = null;
        if (index >= 0) {// 头删除,中间删除,尾删除
            Node<E> p = this.head;
            int i = 0;
            while (p.next != null && i < index) {// 从头结点开始遍历,定位到待删除结点的前驱结点
                i++;
                p = p.next;
            }
            if (p.next != null) {
                old = p.next.data;
                if (p.next == this.rear) {// 如果p结点的后一个结点是尾结点,则移除之后尾结点指针前移
                    this.rear = p;
                }
                p.next = p.next.next;// 删除p结点的后继结点
                this.n--;// 链表长度减少
                return old;
            }
        }
        return old;
    }

    @Override
    public void clear() {
        this.head.next = null;
        this.rear = this.head;
        this.n = 0;
    }

    @Override
    public String toString() {// 返回所有元素值对应的字符串
        String str = "(";
        Node<E> p = this.head.next;//不是从头结点开始,而是从头结点的下一个结点开始
        while (p != null) {
            str += p.data.toString();
            p = p.next;
            if (p != null) {
                str += ", ";
            }
        }
        return str + ")";
    }
}
