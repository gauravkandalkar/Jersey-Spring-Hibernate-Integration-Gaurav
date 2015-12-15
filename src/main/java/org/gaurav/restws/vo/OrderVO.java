package org.gaurav.restws.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderVO {

	private long orderID;
	//private long orderSquenceNo;
	private double totalAmt;
	//private List<OrderItems> oderItems;

	public OrderVO()
	{
		
	}
	
	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	/*public long getOrderSquenceNo() {
		return orderSquenceNo;
	}

	public void setOrderSquenceNo(long orderSquenceNo) {
		this.orderSquenceNo = orderSquenceNo;
	}
*/
	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

}
