package com.yitianyigexiangfa.bellman.core;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class StdSchedulerFactory {

    private static Scheduler scheduler;

    private static  Object lock;

    static {
       scheduler = new Scheduler();
    }

    public static Scheduler getScheduler(){
        if(scheduler == null){
            synchronized (lock){
                scheduler  = new Scheduler();
            }
        }
        return scheduler;
    }

}
