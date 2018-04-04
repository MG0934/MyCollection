package com.mylang;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MySeqList<E> implements  MyList<E>{

    //对象数组，私有成员
    private Object[] table;

    private int n;

    public MySeqList() {
        this(16);
    }

    public MySeqList(int capacity) {
        this.table=new Object[Math.abs(capacity)];
        this.n=0;
    }

    /**
     * 判断顺序表是否为空，如果为空则返回true
     *
     * @return true
     */
    @Override
    public boolean isEmpty() {
        return this.n==0;
    }

    /**
     * 返回 顺序表长度
     *
     * @return int
     */
    @Override
    public int length() {
        return this.n;
    }

    /**
     *  返回index（初始值为0）位置的对象，若序号不存在，则返回null
     *
     * @param index 索引位置
     * @return E
     */
    @Override
    public E get(int index) {

        if(index>=0&&index<this.n){
            return (E)this.table[index];
        }

        return null;
    }

    /**
     * 设置index位置的对象为element，若操作成功，返回原对象 否则返回null
     *
     * @param index 索引位置
     * @param element 传入元素
     * @return E
     */
    @Override
    public E set(int index, E element) {

        if(index>=0&&index<this.n&&element!=null){

            E old = (E)this.table[index];

            this.table[index] = element;

            return old;
        }

        return null;
    }

    /**
     * 在index位置插入element对象，若操作成功返回true，不能插入null
     *
     * @param index 索引位置
     * @param element 传入元素
     * @return E
     */
    @Override
    public boolean add(int index, E element) {

        if(element==null){
            //不成插入null
            return false;
        }

        //判断数组长度，如果长度已满，则需要扩容
        if(this.n==this.table.length){
            //若数组满，则需要扩充顺序表的容量
            Object[] temp = this.table;
            //重新申请一个容量更大的数组
            this.table = new Object[temp.length*2];
            //复制数组元素,O(n)
            System.arraycopy(temp, 0, table, 0, temp.length - 1 + 1);
        }

        if(index<0){
            //下标容错
            index=0;
        }

        if(index>this.n){
            //下标容错
            index = this.n;
        }

        //元素后移，平均移动n/2
        for(int j=this.n-1;j>=index;j--){
            this.table[j+1]=this.table[j];
        }

        this.table[index] = element;

        this.n++;

        return true;
    }

    /**
     * 在最后添加元素
     *
     * @param element 传入元素
     * @return true
     */
    @Override
    public boolean add(E element) {
        return this.add(this.n, element);
    }

    /**
     * 移除index位置的元素，若操作成功，返回被移除的对象，否则返回null
     *
     * @param index 索引位置
     * @return 移除的元素
     */
    @Override
    public E remove(int index) {

        if(this.n!=0&&index>=0&&index<this.n){

            E old = (E) this.table[index];
            //元素前移，平均移动n/2
            for(int i=index;i<this.n-1;i++){
                this.table[i]=this.table[i+1];
            }

            this.table[this.n-1] = null;

            this.n--;
            //若操作成功，则返回被移除对象
            return old;
        }
        //未找到删除对象，操作不成功，返回null
        return null;
    }


    /**
     * 清空顺序表
     */
    @Override
    public void clear() {

        if(this.n!=0){
            for(int i=0;i<this.n;i++){
                this.table[i]=null;
            }
            this.n=0;
        }
    }

    /**
     * 重写toString方法
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder str= new StringBuilder("(");
        if(this.n!=0){
            for(int i=0;i<this.n-1;i++){
                str.append(this.table[i].toString()).append(",");
            }
            str.append(this.table[this.n - 1].toString());
        }
        return str+")";
    }
}
