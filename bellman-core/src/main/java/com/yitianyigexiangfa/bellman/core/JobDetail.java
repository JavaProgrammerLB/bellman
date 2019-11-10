package com.yitianyigexiangfa.bellman.core;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class JobDetail {

    private JobKey jk;

    private Class jobClass;

    public JobKey getJk() {
        return jk;
    }

    public void setJk(JobKey jk) {
        this.jk = jk;
    }

    public Class getJobClass() {
        return jobClass;
    }

    public void setJobClass(Class jobClass) {
        this.jobClass = jobClass;
    }
}
