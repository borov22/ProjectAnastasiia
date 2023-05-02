package com.ua.tsaran.homework34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<Integer>> callList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            callList.add(new Call());
        }

        List<Future<Integer>> callableOutputList = executorService.invokeAll(callList);

        for (Future<Integer> future : callableOutputList) {
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
