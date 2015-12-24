package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.vo.Customers;

public interface CustomerService {

	Customers getCustomer(long id);

	List<Customers> getAllCustomer();

	Customers insertNewCustomer(Customers cust);

	int removeCustomer(long id);

	Customers updateCustomer(Customers cust);

}