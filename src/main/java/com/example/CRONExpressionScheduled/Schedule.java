package com.example.CRONExpressionScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "* */10 9-17 * * 0-4")
    public void schedule(){
        System.out.println("Hello world!");
    }
}
