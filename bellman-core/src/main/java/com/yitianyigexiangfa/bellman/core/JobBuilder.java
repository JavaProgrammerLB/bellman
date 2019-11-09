package com.yitianyigexiangfa.bellman.core;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class JobBuilder {

    private static String jobKey;

    private static String groupKey;

    public static JobBuilder newJob(Class<? extends Job> jobClass){
        return null;
    }

    public static JobBuilder withIdentity(String jk, String gk){
        jobKey = jk;
        groupKey = gk;
        return null;
    }

    public JobDetail build(){
        return new JobDetail();
    }
}
