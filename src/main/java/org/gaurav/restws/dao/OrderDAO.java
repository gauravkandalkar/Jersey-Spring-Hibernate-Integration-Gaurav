package org.gaurav.restws.dao;

import java.util.List;

import org.gaurav.restws.vo.OrderVO;

public interface OrderDAO {

	OrderVO readByID(long custid, long orderid);

	List<OrderVO> readAll(long custid);

	long insert(long custid, OrderVO order);

	int delete(long custid, long orderid);

	int update(long custid, OrderVO order);

}