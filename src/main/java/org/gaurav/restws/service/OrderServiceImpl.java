package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.dao.IDataDAO;
import org.gaurav.restws.dao.IOrderDAO;
import org.gaurav.restws.vo.OrderReport;
import org.gaurav.restws.vo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Autowired
	IOrderDAO orderRepository;
	
	@Override
	public Orders getOrder(long id) {
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

	@Override
	public List<OrderReport> getAllOrdersReport() {
		return orderRepository.getAllOrdersReport();
	}


	@Override
	public List<Orders> getAllOrdersForCustomer(long custid) {
		// TODO Auto-generated method stub
		return null;
	}


}
