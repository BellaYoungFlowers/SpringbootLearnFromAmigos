package com.example.youtubeSpringBoot.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: CustomerRepository
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 16:04
 * @Version 1.0
 */
// @Component

	/*
	@Bean
	CustomerRepo customerRep(){
		System.out.println("useFakeCustomerRepo"+useFakeCustomerRepo);
		return useFakeCustomerRepo?
				new CustomerFakeRepository():
				new CustomerRepository();
	}
	配置类中指定了要注入的Repository  @Repository省略
	*/
// @Repository
// @Primary
// public class CustomerRepository implements CustomerRepo{
// 	@Override
// 	public List<Customer> getCustomers() {
// 		return Collections.singletonList(new Customer(1L,"Bella","pew","123@12.com"));
// 	}
// }

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}



