package com.example.youtubeSpringBoot.jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName: JsonPlaceHolderClient
 * Package: com.example.youtubeSpringBoot.jsonplaceholder
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/6 16:22
 * @Version 1.0
 */
@FeignClient(
		value = "jsonplaceholder",
		url = "http://jsonplaceholder.typicode.com"
)
public interface JsonPlaceHolderClient {

	@GetMapping("/posts")
	List<Post> posts();

	@GetMapping("/posts/{id}")
	Post post(@PathVariable("id") Integer id);


}
