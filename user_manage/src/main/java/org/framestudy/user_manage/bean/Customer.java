package org.framestudy.user_manage.bean;

import java.util.List;

public class Customer {
	private int id;
	private String cusName;
	private String CusAddress;
	private Order order;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return CusAddress;
	}
	public void setCusAddress(String cusAddress) {
		CusAddress = cusAddress;
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Customer(int id, String cusName, String cusAddress) {
		super();
		this.id = id;
		this.cusName = cusName;
		CusAddress = cusAddress;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusName=" + cusName + ", CusAddress=" + CusAddress + ", order=" + order + "]";
	}
	
}
