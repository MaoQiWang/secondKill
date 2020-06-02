package com.secondkill.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

@Configuration
public class SchedulingConfig implements SchedulingConfigurer {

    //开启多线程执行
    @Override
    public void configureTasks(ScheduledTaskRegistrar s) {
        s.setScheduler(Executors.newScheduledThreadPool(5));

    }
}
