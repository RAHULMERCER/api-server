package com.axess.smartbankapi.ses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/ses")
@Slf4j
public class SESController {

	@Autowired
	private EMailService mailService;

	@PostMapping("/send")
	public String sendEmail(@RequestBody Email email) {
		return mailService.sendEmail(email);
	}
}
