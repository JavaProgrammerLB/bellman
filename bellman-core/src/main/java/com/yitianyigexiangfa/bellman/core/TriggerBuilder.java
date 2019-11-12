package com.yitianyigexiangfa.bellman.core;

import java.util.Date;

/**
 * @author Bill Lau
 * @date 2019-11-09
 */
public class TriggerBuilder {

    private TriggerKey triggerKey;
    private Date startAt;

    public static TriggerBuilder newTrigger(){
        TriggerBuilder triggerBuilder = new TriggerBuilder();
        return triggerBuilder;
    }

    public TriggerBuilder withIdentity(String triggerId, String groupId){
        TriggerKey triggerKey = new TriggerKey(triggerId, groupId);
        this.triggerKey = triggerKey;
        return this;
    }

    public TriggerBuilder startAt(Date date){
        this.startAt = date;
        return this;
    }

    public TriggerBuilder withSchedule(ScheduleBuilder scheduleBuilder){

        return this;
    }

    public Trigger build(){
        Trigger trigger = new Trigger();
        trigger.setStartAt(startAt);
        trigger.setTriggerKey(triggerKey);
        return trigger;
    }
}
