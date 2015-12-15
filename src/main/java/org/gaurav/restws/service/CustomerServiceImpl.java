package org.gaurav.restws.service;

import java.util.List;

import org.gaurav.restws.dao.CustomerDAOImpl;
import org.gaurav.restws.dao.IDataDAO;
import org.gaurav.restws.vo.CustomerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	IDataDAO<CustomerVO> custDAO;

	/* (non-Javadoc)
	 * @see org.gaurav.restws.service.CustomerService#getCustomer(long)
	 */
	@Override
	public CustomerVO getCustomer(long id) {
		return custDAO.readByID(id);
	}

	/* (non-Javadoc)
	 * @see org.gaurav.restws.service.CustomerService#getAllCustomer()
	 */
	@Override
	public List<CustomerVO> getAllCustomer() {
		return custDAO.readAll();
	}
	
	/* (non-Javadoc)
	 * @see org.gaurav.restws.service.CustomerService#insertNewCustomer(org.gaurav.restws.vo.CustomerVO)
	 */
	@Override
	public CustomerVO insertNewCustomer(CustomerVO cust) {
		long result = custDAO.insert(cust);
		if (result != 0 )
		{
			return custDAO.readByID(result);
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.gaurav.restws.service.CustomerService#removeCustomer(long)
	 */
	@Override
	public int removeCustomer(long id)
	{
		return custDAO.delete(id);
	}
	
	/* (non-Javadoc)
	 * @see org.gaurav.restws.service.CustomerService#updateCustomer(org.gaurav.restws.vo.CustomerVO)
	 */
	@Override
	public CustomerVO updateCustomer(CustomerVO cust)
	{
		if ( custDAO.update(cust) != 0)
		{
			return custDAO.readByID(cust.getCustomerID());
		}
		return null;
	}
}
