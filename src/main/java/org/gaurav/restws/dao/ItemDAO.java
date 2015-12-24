package org.gaurav.restws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.gaurav.restws.vo.ItemVO;
import org.springframework.stereotype.Repository;

@Repository("itemRepository")
public class ItemDAO implements IDataDAO<ItemVO>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public ItemVO readByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemVO> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemVO insert(ItemVO t) {
		em.persist(t);
		em.flush();
		return t;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ItemVO t) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
