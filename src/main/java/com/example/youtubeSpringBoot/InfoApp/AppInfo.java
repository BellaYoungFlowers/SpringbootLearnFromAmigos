package com.example.youtubeSpringBoot.InfoApp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: Info
 * Package: com.example.youtubeSpringBoot.InfoApp
 * Description: 将配置文件中的属性放到类中来
 *
 * @Author 王腾腾
 * @Create 2023/6/7 10:20
 * @Version 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "info.app")
public class AppInfo {
	private  String name;
	private  String description;
	private  String version;

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getVersion() {
		return version;
	}

	@Override
	public String toString() {
		return "Info{" +
				"name='" + name + '\'' +
				", description='" + description + '\'' +
				", version='" + version + '\'' +
				'}';
	}
}
