package com.amuse.multithread.one;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.one
 * @author: 刘培振
 * @createTime: 2021/6/6 15:00
 * @version:1.0
 */
public class MyThread2 extends Thread {

    private int count = 5;

    public MyThread2() {
        super();
    }

    public MyThread2(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println(this.isAlive());
            System.out.println(this.getName());
            System.out.println(this.currentThread().getName()+"计算:"+count);

        }
    }

    public static void main(String[] args) {
//        MyThread2 a = new MyThread2("A");
//        MyThread2 b = new MyThread2("B");
//        MyThread2 c = new MyThread2("C");
//        a.start();
//        b.start();
//        c.start();

        MyThread2 myThread2 = new MyThread2();
        Thread a = new Thread(myThread2,"A");
        Thread b = new Thread(myThread2,"B");
        Thread c = new Thread(myThread2,"C");
        a.start();
        b.start();
        c.start();
    }
}
