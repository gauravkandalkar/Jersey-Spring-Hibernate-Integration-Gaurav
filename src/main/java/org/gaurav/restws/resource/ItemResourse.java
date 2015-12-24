package org.gaurav.restws.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.ItemService;
import org.gaurav.restws.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("itemResource")
@Produces(MediaType.APPLICATION_JSON)
@Path("items")
public class ItemResourse {

	@Autowired
	ItemService itemService;
	
	@Path("/{ItemId}")
	@GET
	public ItemVO getItem(@PathParam(value="ItemId") long itemId)
	{
		return itemService.get(itemId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public ItemVO saveItem(ItemVO item)
	{
		return itemService.save(item);
	}
}
