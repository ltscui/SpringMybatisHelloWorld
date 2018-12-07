package com.ltcui.student.mapper.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltcui.student.entity.Student;
import com.ltcui.student.mapper.StudentMapper;

@Repository
public class StudentMapperImpl extends SqlSessionDaoSupport implements StudentMapper{

	@Autowired
	public void setSqlsessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public Student getStudentById(String stuId) {
		return getSqlSession().getMapper(StudentMapper.class).getStudentById(stuId);
	}

	@Override
	public Student updStudent(Student stu) {
		return null;
	}

	@Override
	public int addStudent(Student stu) {
		return 0;
	}

	@Override
	public int delStudent(Student stu) {
		return 0;
	}

}
