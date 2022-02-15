package com.amuse.multithread.one;

import java.util.Iterator;
import java.util.Map;

/**
 * @description:
 * @projectName: multithread
 * @see: com.amuse.multithread.one
 * @author: 刘培振
 * @createTime: 2021/6/6 16:14
 * @version:1.0
 */
public class Test1 {

    public void a() {
        b();
    }

    public void b() {
        c();
    }

    public void c(){
        d();
    }

    public void d() {
        e();
    }

//    public void e() {
//        int age = 0;
//        age = 100;
//        if (age == 100) {
//            Thread.dumpStack();
//        }
//    }

    public void e() {
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Thread thread = (Thread) iterator.next();
            StackTraceElement[] array = map.get(thread);
            //循环
        }
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.a();
    }
}
