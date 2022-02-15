package com.amuse.multithread.one;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.one
 * @author: 刘培振
 * @createTime: 2021/6/6 14:33
 * @version:1.0
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("运行中!");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束!");
    }
}
