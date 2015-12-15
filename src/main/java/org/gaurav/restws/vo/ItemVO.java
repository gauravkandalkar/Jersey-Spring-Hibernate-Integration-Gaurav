package org.gaurav.restws.vo;

public class ItemVO {

	private long itemId;
	private String itemName;
	private double mrp;

	public ItemVO(long itemId, String itemName, double d) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.mrp = d;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
}
