package com.yitianyigexiangfa.bellman;

import java.time.LocalDateTime;

public class FirstTask implements BellmanTask {

    public void run() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(" now: " + now + " Hello, this is the first bellman task!");
    }

}
