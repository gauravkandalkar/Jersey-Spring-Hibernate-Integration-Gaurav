package org.gaurav.restws.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.gaurav.restws.database.Database;
import org.gaurav.restws.vo.CustomerVO;
import org.gaurav.restws.vo.OrderVO;

public class OrderDAOImpl implements OrderDAO {

	private static Map<Long, CustomerVO> customers = Database.getCustomers();

	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.OrderDAO#readByID(long, long)
	 */
	@Override
	public OrderVO readByID(long custid, long orderid) {

		return customers.get(custid).getOrders().get(orderid);
	}

	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.OrderDAO#readAll(long)
	 */
	@Override
	public List<OrderVO> readAll(long custid) {
		return new ArrayList<OrderVO>(customers.get(custid).getOrders().values());
	}

	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.OrderDAO#insert(long, org.gaurav.restws.vo.OrderVO)
	 */
	@Override
	public long insert(long custid, OrderVO order) {
		order.setOrderID(customers.get(custid).getOrders().size() + 1);
		customers.get(custid).getOrders().put(order.getOrderID(), order);
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.OrderDAO#delete(long, long)
	 */
	@Override
	public int delete(long custid,long orderid) {
		customers.get(custid).getOrders().remove(orderid);
		return 1;
	}

	/* (non-Javadoc)
	 * @see org.gaurav.restws.dao.OrderDAO#update(long, org.gaurav.restws.vo.OrderVO)
	 */
	@Override
	public int update(long custid, OrderVO order) {
		customers.get(custid).getOrders().put(order.getOrderID(), order);
		return 1;
	}

	
	/*
	 * public OrderDAOImpl() {
	 * 
	 * 
	 * OrderItems orderItembuiscuits = new OrderItems(new ItemVO(501l,
	 * "Biscuits", 1.2), 2); OrderItems orderItemsoap = new OrderItems(new
	 * ItemVO(502l, "soap", 2), 4); List<OrderItems> order = new ArrayList<>();
	 * order.add(orderItembuiscuits); order.add(orderItemsoap);
	 * customers.get(1l).setOrders(1l, new OrderVO(101l,1l,1l,order));;
	 * 
	 * 
	 * orders.put(1l, new OrderVO(1l, 1l, 1l, orderItems));
	 * 
	 * 
	 * OrderItems orderItemOil = new OrderItems(new ItemVO(506l, "Oil", 5.49),
	 * 1); orderItems.add(orderItemOil); orders.put(202l, new OrderVO(202l, 2l,
	 * 1l, orderItems));
	 * 
	 * orders.put(101l, new OrderVO(101l, 1l, 2l, orderItems)); orders.put(203l,
	 * new OrderVO(203l, 2l, 2l)); } }
	 * 
	 * @Override public OrderVO readByID(long id) { return orders.get(id); }
	 * 
	 * @Override public List<OrderVO> readAll() { return new
	 * ArrayList<OrderVO>(orders.values()); }
	 * 
	 * @Override public long insert(OrderVO t) { t.setOrderID(t.getOrderID()+1);
	 * orders.put(t.getOrderID(), t); return 1; }
	 * 
	 * @Override public int delete(long id) { // TODO Auto-generated method stub
	 * return 0; }
	 * 
	 * @Override public int update(OrderVO t) { // TODO Auto-generated method
	 * stub return 0; }
	 */
}
