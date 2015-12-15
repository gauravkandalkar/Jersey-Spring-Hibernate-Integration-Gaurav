package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.vo.CustomerVO;

public interface CustomerService {

	CustomerVO getCustomer(long id);

	List<CustomerVO> getAllCustomer();

	CustomerVO insertNewCustomer(CustomerVO cust);

	int removeCustomer(long id);

	CustomerVO updateCustomer(CustomerVO cust);

}