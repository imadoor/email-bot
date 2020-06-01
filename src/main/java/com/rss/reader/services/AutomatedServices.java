package com.rss.reader.services;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rss.reader.models.ReportDTO;

@Component
public class AutomatedServices {
	@Autowired
	private PirateTableService pirateTableService;
	
	@Autowired
	private EmailServices emailService;

	@Value("${scheduled.email.interval}")
	private String emailTimeInterval;
	
	//@Scheduled(cron="*/10 * * * * *")
	private void automatedEmailer() {
		System.out.println("Test");
	}
	
	//@Scheduled(fixedDelay = 1000)
	public void scheduleFixedDelayTask() {
	    System.out.println(
	      "Fixed delay task - " + System.currentTimeMillis() / 1000);
	}
	
//	@Scheduled(cron="${scheduled.email.interval}")
//	public void generateAndSendEmail() {
//		
//		try {
//			emailService.emailSender(pirateTableService.generatePirateTable());
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
