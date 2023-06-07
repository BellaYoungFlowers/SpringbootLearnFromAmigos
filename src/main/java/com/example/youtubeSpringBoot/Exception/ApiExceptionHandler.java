package com.example.youtubeSpringBoot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

/**
 * ClassName: ExceptionHandler
 * Package: com.example.youtubeSpringBoot.customer.Exception
 * Description: handle exceptions
 *
 * @Author 王腾腾
 * @Create 2023/6/6 10:58
 * @Version 1.0 NotFoundException
 */
@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(value = ApiRequestException.class)
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){

		ApiException apiException = new ApiException(
				e.getMessage(),
				e,
				HttpStatus.BAD_REQUEST,
				ZonedDateTime.now()
		);
		return new ResponseEntity<Object>(apiException, HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<Object> handleApiRequestException(NotFoundException e){

		ApiException apiException = new ApiException(
				e.getMessage(),
				e,
				HttpStatus.NOT_FOUND,
				ZonedDateTime.now()
		);
		return new ResponseEntity<Object>(apiException, HttpStatus.NOT_FOUND);
	}
}
