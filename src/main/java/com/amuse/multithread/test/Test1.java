package com.amuse.multithread.test;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.test
 * @author: 刘培振
 * @createTime: 2022/2/23 20:10
 * @version:1.0
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
