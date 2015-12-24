package org.gaurav.restws.service;

import org.gaurav.restws.vo.ItemVO;

public interface ItemService {

	ItemVO save(ItemVO item);
	ItemVO get(long itemId);

}