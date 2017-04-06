package org.framestudy.demo2.service.impl;

import org.framestudy.demo2.bean.Student;
import org.framestudy.demo2.dao.impl.StudentDaoImpl;
import org.framestudy.demo2.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentDaoImpl studentDao;
	
	public void setStudentDao(StudentDaoImpl studentDao) {
		this.studentDao = studentDao;
	}

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.addStudent(student);
		return false;
	}

	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
		return false;
	}

	public boolean delStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.delStudent(student);
		return false;
	}

}
