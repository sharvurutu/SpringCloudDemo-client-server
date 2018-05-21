package com.stackroute.SpringCloudDemoConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This will refresh the config from the server side
@RefreshScope
@RestController
@RequestMapping("rest")
public class MessageResource {

	@Value("${message: Default hello}")
	private String message;

	@GetMapping("/message")
	public String message() {
		return message;

	}

}
