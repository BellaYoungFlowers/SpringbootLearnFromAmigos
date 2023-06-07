package com.example.youtubeSpringBoot.jsonplaceholder;

/**
 * ClassName: Post
 * Package: com.example.youtubeSpringBoot.jsonplaceholder
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/6 16:25
 * @Version 1.0
 */
public class Post {
	private Integer id;
	private Integer userId;
	private String title;
	private String body;

	public Post(Integer id, Integer userId, String title, String body) {
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	public Integer getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "Post{" +
				"id=" + id +
				", userId=" + userId +
				", title='" + title + '\'' +
				", body='" + body + '\'' +
				'}';
	}
}
