package org.framestudy.user_manage.dao.impl;

import org.framestudy.user_manage.bean.Customer;
import org.framestudy.user_manage.bean.Order;
import org.framestudy.user_manage.dao.ICustomerDao;
import org.springframework.stereotype.Service;
@Service
public class CustomerDaoImpl implements ICustomerDao {

	public boolean addOrder(Customer customer, Order order) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����"+customer.getCusName()+"����������һ����Ϣ����Ϣ������"+order.getOrderName());
		return false;
	}

	public boolean updateOrder(Customer customer, Order order) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����"+customer.getCusName()+"���Ҹ�����һ����Ϣ����Ϣ������"+order.getOrderName());
		return false;
	}

	public boolean delOrder(Customer customer, Order order) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("����"+customer.getCusName()+"����ɾ����һ����Ϣ����Ϣ������"+order.getOrderName());
		return false;
	}

}
