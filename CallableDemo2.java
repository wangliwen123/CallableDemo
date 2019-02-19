package com.example.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread2 implements Callable<String>{

    @Override
    public String call() throws Exception {
        return null;
    }
}

public class CallableDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> task = new FutureTask<String>(() -> {
            System.out.println("***********come in call()");
            return "hello callable";
        });

        new Thread(task,"A").start();
        System.out.println("result 是"+task.get());
    }

}
