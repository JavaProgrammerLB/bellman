package com.yitianyigexiangfa.bellman.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class Scheduler {

    private Map<String, JobDetail> jobMap = new ConcurrentHashMap<>();
    private Map<String, Trigger> triggerMap = new ConcurrentHashMap<>();


    public void scheduleJob(JobDetail jd, Trigger trigger){
        String jobKey = jd.getJk().toString();
        String triggerKey = trigger.getTriggerKey().toString();
        jobMap.put(jobKey, jd);
        triggerMap.put(triggerKey, trigger);
    }

    public void start(){

    }

    public void shutdown(){

    }

}
