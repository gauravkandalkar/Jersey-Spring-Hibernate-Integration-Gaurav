package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.vo.Items;

public interface ItemService {

	Items save(Items item);
	Items get(long itemId);
	List<Items> getAll();

}