package com.example.CRONExpressionScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 30 19,22 ? * SUN")
    public void schedule(){
        System.out.println("Hello world!");
    }
}
