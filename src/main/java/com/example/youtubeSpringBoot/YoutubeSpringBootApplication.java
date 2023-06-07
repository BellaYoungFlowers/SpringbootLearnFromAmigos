package com.example.youtubeSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Customizer;

@SpringBootApplication
@EnableFeignClients
public class YoutubeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeSpringBootApplication.class, args);
	}

}

