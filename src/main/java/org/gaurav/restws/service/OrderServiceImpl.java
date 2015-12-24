package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.dao.IDataDAO;
import org.gaurav.restws.vo.Orders;

public class OrderServiceImpl implements OrderService{


	IDataDAO<Orders> orderDAO;
	
	@Override
	public Orders getOrder(long id) {
		return null;
	}

	@Override
	public List<Orders> getAllOrdersForCustomer(long custID) {
		return null;
	}

	@Override
	public Orders createNewOrder(Orders cust) {
		return null;
	}

	@Override
	public int removeOrder(long id) {
		return 0;
	}

	@Override
	public Orders updateOrder(Orders cust) {
		return null;
	}


}
