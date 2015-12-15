package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.vo.OrderVO;

public interface OrderService {
	OrderVO getOrder(long id);

	List<OrderVO> getAllOrdersForCustomer(long custid);

	OrderVO createNewOrder(OrderVO ord);

	int removeOrder(long id);

	OrderVO updateOrder(OrderVO ord);
}
