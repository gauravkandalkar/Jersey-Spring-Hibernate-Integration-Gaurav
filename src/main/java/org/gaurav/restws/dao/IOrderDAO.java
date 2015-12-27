package org.gaurav.restws.dao;

import java.util.List;

import org.gaurav.restws.vo.OrderReport;
import org.gaurav.restws.vo.Orders;

public interface IOrderDAO extends IDataDAO<Orders>{

	List<OrderReport> getAllOrdersReport();

	List<OrderReport> getAllOrdersForCustomer(long custid);

}