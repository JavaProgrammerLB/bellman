package com.yitianyigexiangfa.bellman.core;

import java.util.Date;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class Trigger {

    private TriggerKey triggerKey;
    private Date startAt;

    public TriggerKey getTriggerKey() {
        return triggerKey;
    }

    public void setTriggerKey(TriggerKey triggerKey) {
        this.triggerKey = triggerKey;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }
}
