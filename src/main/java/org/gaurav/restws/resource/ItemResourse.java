package org.gaurav.restws.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.gaurav.restws.service.ItemService;
import org.gaurav.restws.vo.Items;
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
	public Items getItem(@PathParam(value="ItemId") long itemId)
	{
		return itemService.get(itemId);
	}
	
	@GET
	public List<Items> getAllItems()
	{
	 return itemService.getAll();	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Items saveItem(Items item)
	{
		return itemService.save(item);
	}
}
