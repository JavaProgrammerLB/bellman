package com.yitianyigexiangfa.bellman;

public class BellmanScheduler {

    private BellmanItem item;

    public BellmanScheduler(BellmanItem item) {
        this.item = item;
    }

    public void start() throws InterruptedException {
        while (true){
            Long start = System.currentTimeMillis();
            boolean flag = checkTask();
            if(checkTask()){
                item.getTask().run();
                item.setLastRunTime(System.currentTimeMillis());
                item.setNextRunTime(item.getLastRunTime() + (item.getPolicy().getInterval() * 1000));
            }
            Long end = System.currentTimeMillis();
            if(end - start < 1000){
                Thread.sleep(1000 - (end - start));
            }
        }
    }

    private boolean checkTask(){
        Long nextRunTime = item.getNextRunTime();
        Long now = System.currentTimeMillis();
        long result = now - nextRunTime;
        if(now >= nextRunTime){
            return true;
        }
        return false;
    }
}
