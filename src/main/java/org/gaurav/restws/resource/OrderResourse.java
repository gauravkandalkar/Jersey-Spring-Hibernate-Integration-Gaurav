package org.gaurav.restws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.OrderService;
import org.gaurav.restws.service.OrderServiceImpl;
import org.gaurav.restws.vo.OrderVO;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class OrderResourse {

	OrderService ordserv = new OrderServiceImpl();
	@GET
	public List<OrderVO> getAllOrdersForCustomer(@PathParam("custID") long custID)
	{
		return ordserv.getAllOrdersForCustomer(custID);
	}
}
