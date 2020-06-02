package com.secondkill.server.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {


    @Scheduled(cron="0/10 * * * * ?")
    public void doSomething(){
        System.out.println("十秒来一次"+Thread.currentThread().getName());
    }


    @Scheduled(cron="0/10 * * * * ?")
    public void doSomething1(){
        System.out.println("十秒来一次1"+Thread.currentThread().getName());
    }

    @Scheduled(cron="0/10 * * * * ?")
    public void doSomething2(){
        System.out.println("十秒来一次2"+Thread.currentThread().getName());
    }

}
