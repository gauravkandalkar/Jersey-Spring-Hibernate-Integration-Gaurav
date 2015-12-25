package org.gaurav.restws.dao;

import java.util.List;

import org.gaurav.restws.vo.OrderReport;
import org.gaurav.restws.vo.Orders;

public interface IOrderDAO extends IDataDAO<Orders>{

	OrderReport getCustTotalOrderReport(long custID);

	List<OrderReport> getAllOrdersReport();

}