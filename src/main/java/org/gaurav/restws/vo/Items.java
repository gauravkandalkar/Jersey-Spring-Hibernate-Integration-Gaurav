package org.gaurav.restws.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Item")
@XmlRootElement
public class Items {

	@Id
	@GeneratedValue
	private long itemId;
	
	@Column(name="ItemName")
	private String itemName;
	
	private double mrp;

	public Items()
	{
		
	}
	public Items(long itemId, String itemName, double d) {
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
