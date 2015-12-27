package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.vo.OrderReport;
import org.gaurav.restws.vo.Orders;

public interface OrderService {
	Orders getOrder(long id);

	List<OrderReport> getAllOrdersForCustomer(long custid);

	Orders createNewOrder(Orders ord);

	int removeOrder(long id);

	Orders updateOrder(Orders ord);

	List<OrderReport> getAllOrdersReport();
}
