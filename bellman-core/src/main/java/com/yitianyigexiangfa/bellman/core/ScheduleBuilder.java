package com.yitianyigexiangfa.bellman.core;

/**
 * @author Bill Lau
 * @date 2019-11-11
 */
public class ScheduleBuilder {

    private int interval;

    private boolean repeatForever = false;

    public static ScheduleBuilder simpleSchedule(){
        ScheduleBuilder scheduleBuilder = new ScheduleBuilder();
        return scheduleBuilder;
    }

    public ScheduleBuilder withIntervalInSeconds(int interval){
        this.interval = interval;
        return this;
    }

    public ScheduleBuilder repeatForever(){
        this.repeatForever = true;
        return this;
    }

}
