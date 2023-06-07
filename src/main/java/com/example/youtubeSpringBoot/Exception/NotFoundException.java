package com.example.youtubeSpringBoot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ClassName: NotFoundException
 * Package: com.example.youtubeSpringBoot.customer.Exception
 * Description: 根据id3找不到对象时 前台报500错误 实际上并不友好 这里改为404
 *
 * @Author 王腾腾
 * @Create 2023/6/6 10:15
 * @Version 1.0
 */
//第一种方法
// @ResponseStatus(value = HttpStatus.NOT_FOUND)
// public class NotFoundException extends RuntimeException{
// 	public NotFoundException(String message) {
// 		super(message);
// 	}
// }

public class NotFoundException extends RuntimeException{
	public NotFoundException(String message) {
		super(message);
	}
}
