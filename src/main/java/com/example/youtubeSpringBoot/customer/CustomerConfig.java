package com.example.youtubeSpringBoot.customer;

import com.example.youtubeSpringBoot.InfoApp.AppInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * ClassName: CustomerConfig
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 17:24
 * @Version 1.0
 */
@Configuration
public class CustomerConfig {
	@Value("${app.useFakeCustomerRepo:false}")
	private boolean useFakeCustomerRepo;

	//find properties of the application.properties file
	@Value("${info.app.name}")
	private String appName;

	//find properties of the application.properties file
	@Autowired
	private Environment environment;


	@Bean
	CommandLineRunner commandLineRunner(AppInfo appInfo){
		return args -> {
			System.out.println("commandLineRunner================================");
			System.out.println("appName================================" +appName);
			System.out.println("appVersion================================" +environment.getProperty("info.app.version"));
			System.out.println("appInfo================================" +appInfo);


		};
	}

	@Bean
	CustomerRepo customerRep(){
		System.out.println("useFakeCustomerRepo"+useFakeCustomerRepo);
		return new CustomerFakeRepository();
	}
}
