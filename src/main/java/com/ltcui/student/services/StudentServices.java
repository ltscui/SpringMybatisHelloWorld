package com.ltcui.student.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ltcui.student.entity.Student;
import com.ltcui.student.mapper.StudentMapper;

@Component
@Service
public class StudentServices {
	
	@Resource
	private StudentMapper studentMapper;
	
	/**
	 * 根据指定ID查询学生信息
	 * 
	 * @param stuId 学生ID
	 * @return 学生对象
	 */
	public Student getStudentById(String stuId) {
		
		return studentMapper.getStudentById(stuId);
	}

	/**
	 * 修改学生信息
	 * 
	 * @param stu 学生对象
	 * @return 修改后的学生对象
	 */
	public Student updStudent(Student stu) {
		Student nstu = null;
		
		return nstu;
	}

	/**
	 * 增加学生信息
	 * 
	 * @param stu 学生对象
	 * @return 增加成功后的学生对象
	 */
	public int addStudent(Student stu) {
		
		return 0;
	}

	/**
	 * 删除学生信息
	 * 
	 * @param stu 学生对象
	 * @return 删除条数
	 */
	public int delStudent(Student stu) {
		
		return 0;
	}
}
