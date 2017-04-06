package org.framestudy.demo2.dao.impl;

import org.framestudy.demo2.bean.Student;
import org.framestudy.demo2.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao {

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("增加学生成功");
		return false;
	}

	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("更新学生成功");
		System.out.println(student.getUserName());
		return false;
	}

	public boolean delStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("删除学生成功");
		return false;
	}

}
