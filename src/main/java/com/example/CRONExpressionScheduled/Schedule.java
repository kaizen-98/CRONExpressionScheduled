package com.example.CRONExpressionScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 */10 9-18 ? * MON-FRI")
    public void schedule(){
        System.out.println("Hello world!");
    }
}
