package com.example.youtubeSpringBoot.Exception;

/**
 * ClassName: ApiRequestException
 * Package: com.example.youtubeSpringBoot.customer.Exception
 * Description: exception thrown from controller
 *
 * @Author 王腾腾
 * @Create 2023/6/6 10:29
 * @Version 1.0
 */
public class ApiRequestException extends RuntimeException{
	public ApiRequestException(String message) {
		super(message);
	}

	public ApiRequestException(String message, Throwable cause) {
		super(message, cause);
	}
}
