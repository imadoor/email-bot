package com.rss.reader.services;

import java.nio.charset.StandardCharsets;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Service
public class EmailServices {

	@Autowired
	private JavaMailSender mailSender;
	
//	@Autowired
//	private SpringTemplateEngine springTemplateEngine;
	
	public void emailSender() throws MessagingException {
		MimeMessage mail = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mail, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
		
		helper.setTo(InternetAddress.parse(""));
		helper.setFrom("Email Bot");
		helper.setSubject("This is a test");
		helper.setText("", true);
		
		mailSender.send(mail);
	}
}
