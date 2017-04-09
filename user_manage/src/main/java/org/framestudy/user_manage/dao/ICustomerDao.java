package org.framestudy.user_manage.dao;

import org.framestudy.user_manage.bean.Customer;
import org.framestudy.user_manage.bean.Order;

public interface ICustomerDao {
	/**
	 * �û���Ӷ���
	 * @param customer�û���Ϣ
	 * @param order��������
	 * @return�ɹ�����true
	 * @throws Exception�����׳����쳣
	 */
	public boolean addOrder(Customer customer,Order order) throws Exception;
	/**
	 * �û����¶���
	 * @param customer�û���Ϣ
	 * @param orderҪ���µĶ�������
	 * @return�ɹ�����true
	 * @throws Exception�����׳����쳣��Ϣ
	 */
	public boolean updateOrder(Customer customer,Order order) throws Exception;
	/**
	 * �û�ɾ������
	 * @param customer�û���Ϣ
	 * @param orderҪɾ���Ķ�������
	 * @return�ɹ�����true
	 * @throws Exception�����׳����쳣��Ϣ
	 */
	public boolean delOrder(Customer customer,Order order) throws Exception;
}
