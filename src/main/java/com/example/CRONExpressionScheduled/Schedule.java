package com.example.CRONExpressionScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 0 3 1 * ?")
    public void schedule(){
        System.out.println("Hello world!");
    }
}
