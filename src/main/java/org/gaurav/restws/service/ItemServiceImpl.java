package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.dao.IDataDAO;
import org.gaurav.restws.vo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private IDataDAO<Items> itemRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.gaurav.restws.service.ItemService#save(org.gaurav.restws.vo.ItemVO)
	 */
	@Override
	@Transactional
	public Items save(Items item) {
		return itemRepository.insert(item);
	}

	@Override
	public Items get(long itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getAll() {
		return itemRepository.readAll();

	}

}
