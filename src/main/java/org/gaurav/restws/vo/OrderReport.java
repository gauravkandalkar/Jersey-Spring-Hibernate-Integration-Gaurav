package org.gaurav.restws.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderReport {

	private long customerID;
	private String customerFristName;
	private String customerLastName;
	private long numberOfOrderes;
//	private long orderID;
//	private double allOrdersTotalAmount;
	
	public OrderReport()
	{
		
	}

	public OrderReport(long customerID, String customerFristName, String customerLastName, long numberOfOrderes) {
		super();
		this.customerID = customerID;
		this.customerFristName = customerFristName;
		this.customerLastName = customerLastName;
		this.numberOfOrderes = numberOfOrderes;
	}


//	public OrderReport(long customerID, String customerFristName, String customerLastName, int numberOfOrderes) {
//		super();
//		this.customerID = customerID;
//		this.customerFristName = customerFristName;
//		this.customerLastName = customerLastName;
//		this.numberOfOrderes = numberOfOrderes;
//	}

	
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getCustomerFristName() {
		return customerFristName;
	}
	public void setCustomerFristName(String customerFristName) {
		this.customerFristName = customerFristName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public long getNumberOfOrderes() {
		return numberOfOrderes;
	}
	public void setNumberOfOrderes(long numberOfOrderes) {
		this.numberOfOrderes = numberOfOrderes;
	}


//	public long getOrderID() {
//		return orderID;
//	}
//
//
//	public void setOrderID(long orderID) {
//		this.orderID = orderID;
//	}


	
	
}
