package org.framestudy.user_manage.pojos;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.framestudy.user_manage.bean.Customer;
import org.framestudy.user_manage.bean.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserLogAspectJ {
	/**
	 * 前置通知，初始化需要被AOP类管理的类或者方法
	 * @param jp 
	 */
	@Before(value="execution(* org.framestudy.user_manage.service.impl.*.*(..))")
	public void before(JoinPoint jp){
		Object obj=jp.getTarget();
		Class<?> cls=obj.getClass();
	}
	/**
	 * 后置返回通知，运行在目标方法返回之后
	 * @param jp
	 */
	@AfterReturning(returning="rvt", pointcut="execution(* org.framestudy.user_manage.service.impl.*.*(..))")
	public void afterReturning(JoinPoint jp,Object rvt){
		Object obj=jp.getTarget();
		Class<?> cls=obj.getClass();
		if(cls.getCanonicalName().equals("org.framestudy.user_manage.service.impl.CustomerServiceImpl")){
			String method=jp.getSignature().getName();
			Object[] objParams=jp.getArgs(); 
			Customer customer=null;
			Order order=null;
			for (int i = 0; i < objParams.length; i++) {
				if(objParams[i] instanceof Customer){
					customer=(Customer) objParams[i];
				}else{
					order=(Order) objParams[i];
				}
			}
			//当方法时要进行切入点的指定方法，且返回值为真时，执行某个动作。
			if(method.equals("updateOrder")&&rvt.toString().equals("false")){
				System.out.println("用户"+customer.getCusName()+"在"+new Date()+"时间更新了"+order.getOrderName()+"信息");
			}else if(method.equals("addOrder")&&rvt.toString().equals("false")){
				System.out.println("用户"+customer.getCusName()+"在"+new Date()+"时间添加了"+order.getOrderName()+"信息");
			}else if(method.equals("delOrder")&&rvt.toString().equals("false")){
				System.out.println("用户"+customer.getCusName()+"在"+new Date()+"时间删除了"+order.getOrderName()+"信息");
			}
		}
	}
}
