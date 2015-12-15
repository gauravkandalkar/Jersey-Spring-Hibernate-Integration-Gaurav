package org.gaurav.restws.dao;

import java.util.List;

public interface IDataDAO<T1> {
	public T1 readByID(long id) ;
	public List<T1> readAll() ;
	public long insert(T1 t) ;
	public int delete(long id) ;
	public int update(T1 t) ;

}
