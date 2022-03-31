package com.amuse.multithread.one;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.one
 * @author: 刘培振
 * @createTime: 2022/2/23 21:57
 * @version:1.0
 */
public class MyThread1 extends Thread {

    private int i;

    public MyThread1(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(i);
    }


    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1(2);

        Thread thread = new Thread(myThread1);
        myThread1.start();
        thread.start();
    }

}
