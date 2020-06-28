package com.company;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

    public static void main(String[] args) {
        System.out.println("Welcome to JavaWeb");

        try {
            queue.put("value");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        queue.add("Add Data");
    }


    public String next(){
        String str = null;
        try {
            str = queue.take(); //取头部元素
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str;
    }

}
