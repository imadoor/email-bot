package com.rss.reader.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AutomatedServices {

	@Scheduled()
	private void automatedEmailer() {
		
	}
}
