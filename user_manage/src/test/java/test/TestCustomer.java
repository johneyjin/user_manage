package test;

import javax.annotation.Resource;
import org.framestudy.user_manage.bean.Customer;
import org.framestudy.user_manage.bean.Order;
import org.framestudy.user_manage.service.ICustomerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class TestCustomer {
	@Resource
	private ICustomerService customerServiceImpl;
	
	private Customer customer;
	private Order order;
	private ApplicationContext ac;
	@Before
	public void before(){
		ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		customer=(Customer) ac.getBean("customer");
		order=(Order) ac.getBean("order");
	}
	@Test
	public void testAddOrder(){
		try {
			customerServiceImpl.addOrder(customer, order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testUpdateOrder(){
		try {
			customerServiceImpl.updateOrder(customer, order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testDelOrder(){
		try {
			customerServiceImpl.delOrder(customer, order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
