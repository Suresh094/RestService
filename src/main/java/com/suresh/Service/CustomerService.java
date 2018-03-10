package com.suresh.Service;

import java.util.List;

import com.suresh.Entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAllCustomer();
	
	public boolean addCustomer(Customer customer) ;

	public Customer loadCustomer(Integer custId);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Integer custId);

}
