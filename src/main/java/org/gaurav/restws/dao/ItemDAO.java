package org.gaurav.restws.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.gaurav.restws.vo.Items;
import org.springframework.stereotype.Repository;

@Repository("itemRepository")
public class ItemDAO implements IDataDAO<Items>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Items readByID(long id) {
	
		//Query query = em.createQuery("select g from ItemVO g )
		return null;
	}

	@Override
	public List<Items> readAll() {
		Query query=em.createQuery("select g from Items g");
		List Items = query.getResultList();
		return Items;
	}

	@Override
	public Items insert(Items t) {
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
	public int update(Items t) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
