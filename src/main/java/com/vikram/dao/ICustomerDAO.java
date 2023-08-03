package com.vikram.dao;

import org.springframework.data.repository.CrudRepository;

import com.vikram.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer>{

}
