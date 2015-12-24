package org.gaurav.restws.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gaurav.restws.database.Database;
import org.gaurav.restws.vo.Customers;

public class CustomerDAOImpl implements IDataDAO<Customers> {

	private static Map<Long, Customers> custtbl = Database.getCustomers();

//	public CustomerDAOImpl() {
//		if (custtbl.size() <= 0) {
//			custtbl.put(1l, new CustomerVO(1l, "Gaurav", "Kandalkar"));
//			custtbl.put(2l, new CustomerVO(2l, "Anushree", "Pawar"));
//			custtbl.put(3l, new CustomerVO(3l, "Arun", "Kandalkar"));
//		}
//	}

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Customers readByID(long id) {
		return custtbl.get(id);
	}

	@Override
	public List<Customers> readAll() {
		Query query = em.createQuery("Select c from Customers c");
		List<Customers> customers = query.getResultList();
		return customers;
		//		return new LinkedList<CustomerVO>(custtbl.values());
	}

	@Override
	public Customers insert(Customers t) {
		t.setCustomerID(custtbl.size() + 1);
		custtbl.put(t.getCustomerID(), t);
		return t;
	}

	@Override
	public int delete(long id) {
		custtbl.remove(id);
		return 1;
	}

	@Override
	public int update(Customers t) {
		custtbl.put(t.getCustomerID(), t);
		return 1;
	}

}
