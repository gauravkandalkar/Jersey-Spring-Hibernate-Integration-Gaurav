package org.gaurav.restws.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gaurav.restws.database.Database;
import org.gaurav.restws.vo.CustomerVO;

public class CustomerDAOImpl implements IDataDAO<CustomerVO> {

	private static Map<Long, CustomerVO> custtbl = Database.getCustomers();

	public CustomerDAOImpl() {
		if (custtbl.size() <= 0) {
			custtbl.put(1l, new CustomerVO(1l, "Gaurav", "Kandalkar"));
			custtbl.put(2l, new CustomerVO(2l, "Anushree", "Pawar"));
			custtbl.put(3l, new CustomerVO(3l, "Arun", "Kandalkar"));
		}
	}

	@Override
	public CustomerVO readByID(long id) {
		return custtbl.get(id);
	}

	@Override
	public List<CustomerVO> readAll() {
		return new LinkedList<CustomerVO>(custtbl.values());
	}

	@Override
	public long insert(CustomerVO t) {
		t.setCustomerID(custtbl.size() + 1);
		custtbl.put(t.getCustomerID(), t);
		return t.getCustomerID();
	}

	@Override
	public int delete(long id) {
		custtbl.remove(id);
		return 1;
	}

	@Override
	public int update(CustomerVO t) {
		custtbl.put(t.getCustomerID(), t);
		return 1;
	}

}
