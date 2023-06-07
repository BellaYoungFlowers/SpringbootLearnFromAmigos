package com.example.youtubeSpringBoot.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * ClassName: Customer
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 16:02
 * @Version 1.0
 */
@Table
@Entity
public class Customer {
	@Id
	private Long id;

	@NotBlank(message = "name no empty")
	private String name;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@NotBlank(message = "password no empty")
	private String password;

	@NotBlank
	@Email
	private String email;

	public Customer(Long id, String name,String password,String email) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public Customer() {

	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	// public String getMyName() {
	// 	return name;
	// }

	// @JsonProperty(value = "customerName", required = true)
	// public String getName() {
	// 	return name;
	// }



	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
