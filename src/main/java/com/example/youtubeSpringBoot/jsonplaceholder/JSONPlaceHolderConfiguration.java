package com.example.youtubeSpringBoot.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: JSONPlaceHolderConfiguration
 * Package: com.example.youtubeSpringBoot.jsonplaceholder
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/6 16:38
 * @Version 1.0
 */
@Configuration
public class JSONPlaceHolderConfiguration {
	@Bean("jsonplaceholder")
	CommandLineRunner runner(JsonPlaceHolderClient jsonPlaceHolderClient){
		return args -> {
			System.out.println(jsonPlaceHolderClient.posts().size());
			System.out.println(jsonPlaceHolderClient.post(2));
		};
	}
}
