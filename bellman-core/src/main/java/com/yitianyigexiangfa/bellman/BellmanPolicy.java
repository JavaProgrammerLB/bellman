package com.yitianyigexiangfa.bellman;

public class BellmanPolicy {

    private Integer interval;

    public BellmanPolicy(Integer interval) {
        this.interval = interval;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "BellManPolicy{" +
                "interval=" + interval +
                '}';
    }
}
