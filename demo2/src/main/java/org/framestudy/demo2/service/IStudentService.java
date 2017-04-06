package org.framestudy.demo2.service;

import org.framestudy.demo2.bean.Student;

public interface IStudentService {
	/**
	 * 增加student信息
	 * @param student student实体
	 * @return 成功返回true
	 */
	public boolean addStudent(Student student);
	/**
	 * 更新student信息
	 * @param student student的id
	 * @return更新成功返回true
	 */
	public boolean updateStudent(Student student);
	/**
	 * 删除student
	 * @param student student对象id
	 * @return成功返回true
	 */
	public boolean delStudent(Student student);
}
