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
import org.jvnet.hk2.spring.bridge.api.SpringScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//implementing subresource in jersey+spring environment
//please follow http://sleeplessinslc.blogspot.co.uk/2009/03/sub-resources-with-jerseyspring-jax-rs.html

@Component
@Path("/")
//@Scope("prototype")
@Produces(MediaType.APPLICATION_JSON)
public class OrderResourse {

	@Autowired
	OrderService orderService;// = new OrderServiceImpl();
	
	@GET
	public List<OrderReport> getAllOrdersForCustomer(@PathParam("custID") long custID)
	{
		return orderService.getAllOrdersForCustomer(custID);
	}
	
}
