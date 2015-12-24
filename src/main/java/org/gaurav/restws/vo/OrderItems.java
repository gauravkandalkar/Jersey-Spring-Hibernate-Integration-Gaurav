package org.gaurav.restws.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OrderItems")
public class OrderItems {

	@Id
	@GeneratedValue
	private long OrderItemsID;

	@OneToOne
	private ItemVO item;

	private int quantity;

	@ManyToOne
	private OrderVO order;

	public OrderItems(ItemVO item, int quantity) {
		super();
		this.item = item;
		this.quantity = quantity;
	}

	public ItemVO getItem() {
		return item;
	}

	public void setItem(ItemVO item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getOrderItemsID() {
		return OrderItemsID;
	}

	public void setOrderItemsID(long orderItemsID) {
		OrderItemsID = orderItemsID;
	}
}
