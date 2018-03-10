package com.suresh.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.DAO.CustomerDao;
import com.suresh.Entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao customerDao;

	public List<Customer> findAllCustomer(){
		return (List<Customer>) customerDao.findAll();
		
		
	}
	public boolean addCustomer(Customer customer) {
		if (customerDao.exists(customer.getCustIdPk())) {
	    	   return false;
	       } else {
	    	   customerDao.save(customer);
	    	   return true;
	       }
	}

	public Customer loadCustomer(Integer custId) {
		Customer obj = customerDao.findOne(custId);
		return obj;
		
	}

	public void updateCustomer(Customer customer) {
		customerDao.save(customer);
	}

	public void deleteCustomer(Integer custId) {
		customerDao.delete(custId);
		
	}
	

}
