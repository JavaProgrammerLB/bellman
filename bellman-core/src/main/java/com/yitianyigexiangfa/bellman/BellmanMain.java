package com.yitianyigexiangfa.bellman;


public class BellmanMain {

    public static void main(String[] args) {
        BellmanTask task = new FirstTask();
        BellmanPolicy policy = new BellmanPolicy(10);
        BellmanItem item = new BellmanItem(task, policy);
        BellmanScheduler scheduler = new BellmanScheduler(item);
        try {
            scheduler.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
