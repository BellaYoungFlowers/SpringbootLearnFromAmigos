package com.example.youtubeSpringBoot.customer;

import com.example.youtubeSpringBoot.Exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: CustomerService
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 16:03
 * @Version 1.0
 */
// @Component
@Service
public class CustomerService {
	private final CustomerRepository customerRepository;
	//通过配置的方式 不写@Qualifier(value = "fake")
	@Autowired
	public CustomerService( CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	public Customer getCustomer(Long id) {
		return customerRepository.findById(id)
				.orElseThrow(
						()-> {
							NotFoundException notFoundException = new NotFoundException("id " + id + " is not a valid customer");
							LOGGER.error("error in getting customer {}",id,notFoundException.toString());
							return notFoundException;
						});
	}


	public void addCustomer(Customer customer) {
		System.out.println(customer);
	}


}
