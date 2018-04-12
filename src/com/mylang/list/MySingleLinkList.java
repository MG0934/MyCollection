package com.mylang.list;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MySingleLinkList<E> implements  MyList<E>{
    //单链表头结点，指向单链表第一个结点
    protected Node<E> head;

    //构造空单链表
    public MySingleLinkList() {
        this.head = null;
    }

    //构造制定头结点的单链表
    public MySingleLinkList(Node<E> head) {
        this.head = head;
    }

    /**
     * 判断单链表是否为空
     * @return true or false
     */
    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * 求链表的长度
     *
     * @return int
     */
    @Override
    public int length() {
        //p从head指向的节点开始
        Node<E> p = this.head;

        int i = 0;
        //若单链表未结束
        while(p!=null){
            i++;
            //p到达后记节点
            p = p.next;
        }
        return i;
    }

    /**
     * 返回序号为index的的对象,如果链表为空或者序号错误则返回null
     */
    @Override
    public E get(int index) {

        Node<E> p = this.head;

        int i = 0;

        while (p!=null && i<index){

            i++;

            p=p.next;
        }

        if(p != null){
            return p.data;
        }

        return null;
    }
    /**
     * 插入elment元素,插入后对象序号为index,如果操作成功则返回true
     */
    @Override
    public E set(int index, E element) {

        if(this.head !=null && index >=0 && element != null){

            Node<E> p = this.head;

            int i = 0;

            while(p!=null && i<index){

                i++;

                p = p.next;
            }

            if(p!=null){
                E old = p.data;

                p.data = element;
                // 操作成功返回原对象
                return old;
            }
        }
        // 操作失败则返回null
        return null;
    }

    /**
     * 插入element元素，插入后对象序号为index，如果操作成功则返回true
     * @param index 传入索引
     * @param element 传入值
     * @return true or false
     */
    @Override
    public boolean add(int index, E element) {

        if(element==null){
            return false;
        }
        //创建要插入的节点
        Node<E> q = new Node<>(element);
        //在头结点插入
        if(this.head==null || index <=0){
            q.next = this.head;
            this.head = q;
        }else{
        //中间或者尾结点插入
            Node<E> p = this.head;

            int i = 0;

            while (p.next!=null && i<index -1){

                i++;

                p=p.next;
            }

            q.next = p.next;

            p.next = q;

        }

        return true;
    }

    @Override
    public boolean add(E element) {
        return add(Integer.MAX_VALUE,element);
    }

    /**
     * 移除需要为index的对象，如果操作成功则返回被移除的对象，操作失败则返回null
     *
     * @param index 传入索引
     * @return 删除的值
     */
    @Override
    public E remove(int index) {

        E old = null;

        if(this.head != null && index >=0){
            //头删除
            if(index == 0 ){

                old = this.head.data;

                this.head = this.head.next;

                return old;

            }else{

                //中间删除或者尾部删除
                Node<E> p = this.head;

                int i =0;

                while(p != null && i < index -1){
                    //定位到删除结点的前驱结点
                    i++;
                    p=p.next;
                }

                if(p!=null && p.next!=null){
                    //操作成功返回被移除的对象
                    old = p.next.data;
                    //删除P的后继节点
                    p.next = (p.next).next;

                }

            }

        }

        return old;
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public String toString() {// 返回所有元素值对应的字符串
        String str = "(";
        Node<E> p = this.head;
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
