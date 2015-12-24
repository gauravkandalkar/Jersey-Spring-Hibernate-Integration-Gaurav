package org.gaurav.restws.vo;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name="Customers")
public class CustomerVO {
	
	@Id
	@GeneratedValue
	private long customerID;
	
	
	private String firstName;
	

	private String lastName;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private List<OrderVO> orders;

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
	
	public List<OrderVO> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderVO> orders) {
		this.orders = orders;
	}

}
