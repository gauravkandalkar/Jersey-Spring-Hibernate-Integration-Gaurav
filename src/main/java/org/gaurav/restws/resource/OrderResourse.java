package org.gaurav.restws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.OrderService;
import org.gaurav.restws.service.OrderServiceImpl;
import org.gaurav.restws.vo.OrderReport;
import org.gaurav.restws.vo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class OrderResourse {

	@Autowired
	OrderService orderService;
	
	@GET
	public String getAllOrdersForCustomer(@PathParam("custID") long custID)
	{
		return null;
	}
}
