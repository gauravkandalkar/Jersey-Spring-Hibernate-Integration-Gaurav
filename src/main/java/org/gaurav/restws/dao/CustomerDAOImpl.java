package org.gaurav.restws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gaurav.restws.vo.Customers;

public class CustomerDAOImpl implements IDataDAO<Customers> {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Customers readByID(long id) {
		Query query = em.createQuery("select c from Customers c where c.customerID=:id");
		query.setParameter("id", id);

		return (Customers) query.getSingleResult();
	}

	@Override
	public List<Customers> readAll() {
		Query query = em.createQuery("Select c from Customers c");
		List<Customers> customers = query.getResultList();
		return customers;
		// return new LinkedList<CustomerVO>(custtbl.values());
	}

	@Override
	public Customers insert(Customers t) {
		em.persist(t);
		em.flush();

		return t;
	}

	@Override
	public int delete(long id) {
		Customers cust = em.find(Customers.class, id);
		if (cust != null) {
			em.remove(cust);
			return 1;
		}
		return 0;
	}

	@Override
	public int update(Customers t) {
		t = em.merge(t);
		return 1;
	}

}
