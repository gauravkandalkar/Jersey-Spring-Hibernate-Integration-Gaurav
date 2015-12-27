package org.gaurav.restws.resource;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.gaurav.restws.exception.MyException;
import org.gaurav.restws.service.CustomerService;
import org.gaurav.restws.vo.Customers;
import org.gaurav.restws.vo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Path("/customers")
// @Scope("singleton")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResourse {

	@Autowired // @Resourse (this is JSR 250 annotation) will also work same as
				// that of @Autowired
	CustomerService custserv;

	@GET
	public List<Customers> getCustomers() {
		return custserv.getAllCustomer();
	}

	@GET
	@Path("/{custID}")
	public Customers getCustomer(@PathParam("custID") long custID) throws MyException {
		Customers customer = custserv.getCustomer(custID);
		if (customer == null) {
			throw new MyException(Status.NOT_FOUND, "data not found for " + custID);
		}
		return customer;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertNewCustomer(Customers cust, @Context UriInfo uriInfo) {
		Customers NewCustomer = custserv.insertNewCustomer(cust);
		String newid = String.valueOf(NewCustomer.getCustomerID());
		URI newuri = uriInfo.getAbsolutePathBuilder().path(newid).build();
		return Response.created(newuri).entity(NewCustomer).build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Customers updateCustomer(Customers cust) {
		return custserv.updateCustomer(cust);
	}

	@DELETE
	@Path("/{custID}")
	@Produces(MediaType.TEXT_PLAIN)
	public String removeCustomer(@PathParam("custID") long custID) {
		int result = custserv.removeCustomer(custID);
		if (result == 0) {
			return "Failed";
		}
		return "Success";
	}
	
//implementing subresource in jersey+spring environment
//please follow http://sleeplessinslc.blogspot.co.uk/2009/03/sub-resources-with-jerseyspring-jax-rs.html

//The resource context can be utilized when instances of managed resource classes are to be returned by sub-resource locator methods. 
//Such instances will be injected and managed within the declared scope just like instances of root resource classes.
	@Context
	private ResourceContext resourceContex;
	
	@Path("/{custID}/orders")
	public OrderResourse getOrders() {
		OrderResourse resource = resourceContex.getResource(OrderResourse.class);

		return resource;
	}
}
