package org.framestudy.demo2.pojos;

import org.framestudy.demo2.bean.Student;
import org.framestudy.demo2.service.IStudentService;
import org.framestudy.demo2.service.impl.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	private ApplicationContext ac;
	private IStudentService studentService;
	private Student student;
	@Before
	public void before(){
		ac=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		studentService=(StudentServiceImpl) ac.getBean("studentServiceImpl");
		student=(Student) ac.getBean("student");
	}
	@Test
	public void testAddStudent(){
		studentService.addStudent(student);
	}
	@Test
	public void testUpdateStudent(){
		studentService.updateStudent(student);
	}
	@Test
	public void testDelStudent(){
		studentService.delStudent(student);
	}
}
