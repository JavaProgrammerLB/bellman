package com.yitianyigexiangfa.bellman.core;

import java.util.Date;

import static com.yitianyigexiangfa.bellman.core.JobBuilder.*;
import static com.yitianyigexiangfa.bellman.core.TriggerBuilder.*;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class BellmanExample {

    public void run(){
        // 1. 创建scheduler对象
        StdSchedulerFactory sf = new StdSchedulerFactory();
        Scheduler scheduler = sf.getScheduler();
        // 2. 使用JobBuilder创建JobDetail对象
        JobDetail jd = newJob(JobImpl1.class).withIdentity("job1", "group1").build();
        // 3. 使用TriggerBuilder创建Trigger
        Date runTime = new Date();
        Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startAt(runTime).build();
        // 4. 配置scheduler
        scheduler.scheduleJob(jd, trigger);
        // 5. 启动作业
        scheduler.start();
    }

    public static void main(String[] args) {
        BellmanExample bellmanExample = new BellmanExample();
        bellmanExample.run();
    }
}
