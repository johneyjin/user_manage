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
	 * ǰ��֪ͨ����ʼ����Ҫ��AOP����������߷���
	 * @param jp 
	 */
	@Before(value="execution(* org.framestudy.user_manage.service.impl.*.*(..))")
	public void before(JoinPoint jp){
		Object obj=jp.getTarget();
		Class<?> cls=obj.getClass();
	}
	/**
	 * ���÷���֪ͨ��������Ŀ�귽������֮��
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
			//������ʱҪ����������ָ���������ҷ���ֵΪ��ʱ��ִ��ĳ��������
			if(method.equals("updateOrder")&&rvt.toString().equals("false")){
				System.out.println("�û�"+customer.getCusName()+"��"+new Date()+"ʱ�������"+order.getOrderName()+"��Ϣ");
			}else if(method.equals("addOrder")&&rvt.toString().equals("false")){
				System.out.println("�û�"+customer.getCusName()+"��"+new Date()+"ʱ�������"+order.getOrderName()+"��Ϣ");
			}else if(method.equals("delOrder")&&rvt.toString().equals("false")){
				System.out.println("�û�"+customer.getCusName()+"��"+new Date()+"ʱ��ɾ����"+order.getOrderName()+"��Ϣ");
			}
		}
	}
}
