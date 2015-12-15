package org.gaurav.restws.vo;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerVO {
	private long customerID;
	private String firstName;
	private String lastName;
	private Map<Long,OrderVO> orders;

	public CustomerVO(){
		
	}
	public CustomerVO(long custID,String fname, String lname)
	{
		this.customerID=custID;
		this.firstName=fname;
		this.lastName=lname;
	}
	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Map<Long,OrderVO> getOrders() {
		return orders;
	}
	public void setOrders(Map<Long,OrderVO> orders) {
		this.orders = orders;
	}

}
