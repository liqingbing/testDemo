package com.lqb;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread threadA = new MyThread("thread-A");
        MyThread threadB = new MyThread("thread-B");

        threadA.start();
        threadB.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        }).start();
    }

    static class MyThread extends Thread{
        private int count = 5;

        MyThread(String name){
            super(name);
        }

        @Override
        public void run() {
            while (count > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖出了第 " + count + " 张票");
                count--;
            }
        }
    }
    class inner implements Runnable{

        @Override
        public void run() {
            System.out.println("run thread");
        }
    }
}
