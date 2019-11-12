package com.yitianyigexiangfa.bellman.core;

/**
 * @author Bill Lau
 * @date 2019-11-10
 */
public class JobKey {

    private String jobId;

    private String groupId;

    public JobKey(String jobId, String groupId) {
        this.jobId = jobId;
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "JK" + jobId + "-" + groupId;
    }
}
