package org.gaurav.restws.vo;

public class OrderItems {
	private ItemVO item;
	private int quantity;

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
}
