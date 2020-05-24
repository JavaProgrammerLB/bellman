package com.yitianyigexiangfa.bellman;

public class BellmanItem {

    private BellmanTask task;
    private BellmanPolicy policy;
    private Long lastRunTime;
    private Long nextRunTime;

    public BellmanItem(BellmanTask task, BellmanPolicy policy, Long lastRunTime, Long nextRunTime) {
        this.task = task;
        this.policy = policy;
        this.lastRunTime = lastRunTime;
        this.nextRunTime = nextRunTime;
    }

    public BellmanItem(BellmanTask task, BellmanPolicy policy) {
        this.task = task;
        this.policy = policy;
        this.lastRunTime = -1L;
        this.nextRunTime = System.currentTimeMillis();
    }

    public BellmanTask getTask() {
        return task;
    }

    public void setTask(BellmanTask task) {
        this.task = task;
    }

    public BellmanPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(BellmanPolicy policy) {
        this.policy = policy;
    }

    public Long getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public Long getNextRunTime() {
        return nextRunTime;
    }

    public void setNextRunTime(Long nextRunTime) {
        this.nextRunTime = nextRunTime;
    }

    @Override
    public String toString() {
        return "BellmanItem{" +
                "task=" + task +
                ", policy=" + policy +
                ", lastRunTime=" + lastRunTime +
                ", nextRunTime=" + nextRunTime +
                '}';
    }
}
