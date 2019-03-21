package com.prnasia.aaa.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class ScheduledTestController {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(cron = "3 * * * * ?")
	public void testTasks() {
		System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
	}
}
