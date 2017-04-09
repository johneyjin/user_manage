package org.framestudy.user_manage.dao;

import org.framestudy.user_manage.bean.Customer;
import org.framestudy.user_manage.bean.Order;

public interface ICustomerDao {
	/**
	 * 用户添加订单
	 * @param customer用户信息
	 * @param order订单内容
	 * @return成功返回true
	 * @throws Exception可能抛出的异常
	 */
	public boolean addOrder(Customer customer,Order order) throws Exception;
	/**
	 * 用户更新订单
	 * @param customer用户信息
	 * @param order要更新的订单内容
	 * @return成功返回true
	 * @throws Exception可能抛出的异常信息
	 */
	public boolean updateOrder(Customer customer,Order order) throws Exception;
	/**
	 * 用户删除订单
	 * @param customer用户信息
	 * @param order要删除的订单内容
	 * @return成功返回true
	 * @throws Exception可能抛出的异常信息
	 */
	public boolean delOrder(Customer customer,Order order) throws Exception;
}
