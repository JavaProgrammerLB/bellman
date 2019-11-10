package com.yitianyigexiangfa.bellman.core;

/**
 * @author Bill Lau
 * @date 2019-11-10
 */
public class JobBuilder {

    private JobKey jk;
    private Class jobClass;

    public static JobBuilder newJob(Class<? extends Job> jobClass){
        JobBuilder jobBuilder = new JobBuilder();
        jobBuilder.ofType(jobClass);
        return jobBuilder;
    }

    public JobBuilder ofType(Class<? extends Job> jobClass){
        this.jobClass = jobClass;
        return this;
    }

    public JobBuilder withIdentity(String jobId, String jobKey){
        JobKey jobK = new JobKey(jobId, jobKey);
        jk = jobK;
        return this;
    }

    public JobDetail build(){
        JobDetail jobDetail = new JobDetail();
        jobDetail.setJk(jk);
        jobDetail.setJobClass(jobClass);
        return jobDetail;
    }

}
