package com.imooc.scheduler;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Scheduled(fixedRate = 3000)
	public void reportCurrentTime() {
		System.out.println("CurrentTime::"+LocalDateTime.now());
	}
}
