package com.amuse.multithread.one;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.one
 * @author: 刘培振
 * @createTime: 2021/6/6 14:09
 * @version:1.0
 */
public class Run3 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.sleep(500000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
