package org.gaurav.restws.service;

import org.gaurav.restws.dao.IDataDAO;
import org.gaurav.restws.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private IDataDAO<ItemVO> itemRepository;
	
	/* (non-Javadoc)
	 * @see org.gaurav.restws.service.ItemService#save(org.gaurav.restws.vo.ItemVO)
	 */
	@Override
	@Transactional
	public ItemVO save(ItemVO item)
	{
		return itemRepository.insert(item);
	}

	@Override
	public ItemVO get(long itemId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
