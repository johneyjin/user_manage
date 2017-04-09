package org.framestudy.user_manage.service.impl;

import javax.annotation.Resource;

import org.framestudy.user_manage.bean.Customer;
import org.framestudy.user_manage.bean.Order;
import org.framestudy.user_manage.dao.ICustomerDao;
import org.framestudy.user_manage.service.ICustomerService;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements ICustomerService {
	@Resource
	private ICustomerDao customerDaoImpl;
	public boolean addOrder(Customer customer, Order order) throws Exception {
		// TODO Auto-generated method stub
		customerDaoImpl.addOrder(customer, order);
		return false;
	}

	public boolean updateOrder(Customer customer, Order order) throws Exception {
		// TODO Auto-generated method stub
		customerDaoImpl.updateOrder(customer, order);
		return false;
	}

	public boolean delOrder(Customer customer, Order order) throws Exception {
		// TODO Auto-generated method stub
		customerDaoImpl.delOrder(customer, order);
		return false;
	}

}
