package com.ltcui.student.mapper;

import com.ltcui.student.entity.Student;

public interface StudentMapper {
	/**
	 * 根据指定ID查询学生信息
	 * 
	 * @param stuId 学生ID
	 * @return 学生对象
	 */
	Student getStudentById(String stuId);

	/**
	 * 修改学生信息
	 * 
	 * @param stu 学生对象
	 * @return 修改后的学生对象
	 */
	Student updStudent(Student stu);

	/**
	 * 增加学生信息
	 * 
	 * @param stu 学生对象
	 * @return 增加成功后的学生对象
	 */
	int addStudent(Student stu);

	/**
	 * 删除学生信息
	 * 
	 * @param stu 学生对象
	 * @return 删除条数
	 */
	int delStudent(Student stu);
}
