package com.amuse.multithread.one;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.one
 * @author: 刘培振
 * @createTime: 2021/6/6 13:59
 * @version:1.0
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(this.isAlive());
        System.out.println("My Thread");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("线程id:"+ myThread.getId());
        System.out.println("begin ==" + myThread.isAlive());
        myThread.start();
        System.out.println("end ==" + myThread.isAlive());
        Thread.sleep(200);
        System.out.println("运行结束");

    }
}
