package com.suresh.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.suresh.Entity.Customer;
@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {
	

}
