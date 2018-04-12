package com.mylang.queue;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MySeqQueue<E> implements MyQueue<E> {

    private Object[] value;// 存储队列数据元素的数组
    private int front;// 对头下标
    private int rear;// 队尾下标

    public MySeqQueue(int capacity) {// 构造指定容量的空队列
        value = new Object[Math.abs(capacity)];
        this.front = -1;
        this.rear = -1;
    }

    public MySeqQueue() {// 构造默认空队列
        this(16);
    }


    @Override
    public boolean isEmpty() {
        return this.front == -1 && this.rear == -1;
    }

    @Override
    public boolean enqueue(E element) {
        if(element==null){
            return false;
        }
        //空队列
        if(isEmpty()){
            this.value[0] = element;
            this.front++;
            this.rear++;
        }else{

            if (this.rear == this.value.length - 1) {// 队列满则扩容
                Object[] temp = this.value;
                this.value = new Object[this.value.length * 2];// 扩容为当前队列的两倍
                for (int i = 0; i < temp.length; i++) {
                    this.value[i] = temp[i];
                }
            }
            this.value[++this.rear] = element;//

        }

        return true;
    }

    /**
     * 出队，返回当前对头元素，若队列为空则返回null
     *
     * @return
     */
    @Override
    public E dequeue() {
        if (isEmpty()) {// 如果队列为空返回null
            return null;
        }
        @SuppressWarnings("unchecked")
        E temp = (E) this.value[this.front];
        this.front++;
        return temp;
    }

    /**
     * 返回栈中各元素的字符串表示
     */
    @Override
    public String toString() {
        String str = "(";
        if (!isEmpty()) {// 判断是否非空
            for (int i = this.front; i <= this.rear; i++) {// 从对头 到队尾
                if (i == this.rear) {
                    str += this.value[i];
                } else {
                    str += this.value[i] + ",";
                }
            }
        }
        return str + ")";
    }
}
