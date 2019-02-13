package com.mmall.concurrency.concurrencytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: myname
 * @Date: 2018/12/18 1:54
 */
public class MainClass {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }
    }
}
