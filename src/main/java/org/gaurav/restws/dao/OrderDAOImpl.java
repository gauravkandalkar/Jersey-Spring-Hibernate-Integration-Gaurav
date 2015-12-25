package org.gaurav.restws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gaurav.restws.vo.OrderReport;
import org.gaurav.restws.vo.Orders;
import org.springframework.stereotype.Repository;

@Repository("orderRepository")
public class OrderDAOImpl implements IOrderDAO {

	@PersistenceContext
	private EntityManager em;
	
	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.IOrderDAO#getCustTotalOrderReport(long)
	 */
	@Override
	public OrderReport getCustTotalOrderReport(long custID)
	{
//	 Query query= em.createQuery("select new org.gaurav.restws.vo.CustomerTotalOrderReport(c.customerID, c.customerFristName, c.customerLastName, o.numberOfOrderes" +
//	              "from Customers c, Orders o where o.customer ");	
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.IOrderDAO#getAllOrdersReport()
	 */
	@Override
	public List<OrderReport> getAllOrdersReport()
	{
		Query query = em.createQuery("select new org.gaurav.restws.vo.OrderReport(c.customerID,c.firstName,c.lastName,count(o.orderID))" +
						" from Customers c, Orders o where c.customerID = o.customer.customerID" + 
				         " group by c.customerID,c.firstName,c.lastName");
		
		return query.getResultList();
	}
	
	@Override
	public Orders readByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders insert(Orders t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Orders t) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
