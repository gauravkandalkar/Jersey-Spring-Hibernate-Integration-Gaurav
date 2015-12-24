package org.gaurav.restws.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name="Orders")
public class Orders {

	@Id
	@GeneratedValue
	private long orderID;
	//private long orderSquenceNo;
	//private double totalAmt;
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<OrderItems> oderItems;

	@ManyToOne
	private Customers customer;
	
	public Orders()
	{	
	}
	
	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	public List<OrderItems> getOderItems() {
		return oderItems;
	}

	public void setOderItems(List<OrderItems> oderItems) {
		this.oderItems = oderItems;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

/*	public long getOrderSquenceNo() {
		return orderSquenceNo;
	}

	public void setOrderSquenceNo(long orderSquenceNo) {
		this.orderSquenceNo = orderSquenceNo;
	}*/

	/*public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}*/

}
