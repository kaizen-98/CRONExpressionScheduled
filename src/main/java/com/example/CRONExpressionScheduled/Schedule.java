package com.example.CRONExpressionScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 0 9-17 ? * MON-FRI")
    public void schedule(){
        System.out.println("Hello world!");
    }
}
