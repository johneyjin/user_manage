package org.framestudy.user_manage.bean;

public class Order {
	private int id;
	private String orderName;
	private Customer customer;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Order(String orderName) {
		super();
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", customer=" + customer + "]";
	}
}
