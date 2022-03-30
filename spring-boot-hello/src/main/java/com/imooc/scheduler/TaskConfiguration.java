package com.imooc.scheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.imooc.scheduler")
@EnableScheduling
@Configuration
public class TaskConfiguration {

}
