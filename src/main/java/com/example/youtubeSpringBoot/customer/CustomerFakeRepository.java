package com.example.youtubeSpringBoot.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: CustomerFakeRepository
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 16:29
 * @Version 1.0
 */

//value可以让service去找不同的implementation 不如不同的数据库连接
// @Component(value = "fake")


	/*
	@Bean
	CustomerRepo customerRep(){
		System.out.println("useFakeCustomerRepo"+useFakeCustomerRepo);
		return useFakeCustomerRepo?
				new CustomerFakeRepository():
				new CustomerRepository();
	}
	配置类中指定了要注入的Repository @Repository(value = "fake")可以不写
	*/
// @Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
	@Override
	public List<Customer> getCustomers() {
		return Arrays.asList(new Customer(1L,"Bella","5h","123@12.com"),new Customer(2L,"James","7g","123@12.com"));
	}
}
