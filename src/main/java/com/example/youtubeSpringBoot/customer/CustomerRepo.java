package com.example.youtubeSpringBoot.customer;

import java.util.List;

/**
 * ClassName: CustomerRepo
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 16:29
 * @Version 1.0
 */
public interface CustomerRepo {
	List<Customer> getCustomers();
}
