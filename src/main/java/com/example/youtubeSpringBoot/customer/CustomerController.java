package com.example.youtubeSpringBoot.customer;

import com.example.youtubeSpringBoot.Exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * ClassName: customerController
 * Package: com.example.youtubeSpringBoot.customer
 * Description:
 *
 * @Author 王腾腾
 * @Create 2023/6/5 16:01
 * @Version 1.0
 */
@RestController
public class CustomerController {

	// private  final  CustomerService customerService = new CustomerService();

	// private final CustomerService customerService;
	// CustomerController(){
	// 	this.customerService = new CustomerService();
	// }

	private final CustomerService customerService;
	@Autowired
	CustomerController(CustomerService customerService){
		this.customerService = customerService;
	}

	@GetMapping(path = "/getCustomers")
	List<Customer> getCustomers(){
		return customerService.getCustomers();
	}

	@GetMapping(path = "/getCustomer/{id}")
	Customer getCustomer(@PathVariable("id") Long id){
		return customerService.getCustomer(id);

	}

	@GetMapping(path = "/getCustomer/{id}/exception")
	Customer getCustomerAndException(@PathVariable("id") Long id){
		throw new ApiRequestException(
				"ApiRequestException for customer " + id
		);
	}

	@PostMapping
	public void addCustomer(@Valid @RequestBody Customer customer){
		 customerService.addCustomer(customer);
	}

	@PutMapping
	public void updateCustomer(@RequestBody Customer customer){

	}

	@DeleteMapping(value = "{customerId}")
	public void deleteCustomer(@PathVariable("customerId") Long id){
		System.out.println(id);
	}

}
