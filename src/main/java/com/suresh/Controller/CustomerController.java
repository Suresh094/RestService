package com.suresh.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.Entity.Customer;
import com.suresh.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = { "/",""}, method = RequestMethod.GET)
	public ResponseEntity<?> getPersons() {
		return new ResponseEntity<Object>(customerService.findAllCustomer(), HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/{customerById}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletePerson(@PathVariable("customerById") String pid) {
		customerService.deleteCustomer(Integer.parseInt(pid));
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/{customerById}", method = RequestMethod.GET)
	public Customer getPersonById(@PathVariable("customerById") String pid) {
		return customerService.loadCustomer(Integer.parseInt(pid));
	}

}
