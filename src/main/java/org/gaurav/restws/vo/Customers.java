package org.gaurav.restws.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name="Customers")
public class Customers {
	
	@Id
	@GeneratedValue
	private long customerID;
	
	
	private String firstName;
	

	private String lastName;
	
	@Transient
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Orders> orders;

	public Customers(){
		
	}
	public Customers(long custID,String fname, String lname)
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
	
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

}
