package org.gaurav.restws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.OrderService;
import org.gaurav.restws.vo.OrderReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/reports")
public class ReportResources {

	@Autowired
	OrderService orderService;
	
	@GET
	@Path("/allordersreport")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OrderReport> getAllOrdersReport()
	{
		return orderService.getAllOrdersReport();
	}
}
