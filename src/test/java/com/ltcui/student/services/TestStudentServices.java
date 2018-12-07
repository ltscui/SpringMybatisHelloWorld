package com.ltcui.student.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentServices {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentServices studentServices = (StudentServices)ac.getBean("studentServices");
		System.out.println(studentServices.getStudentById("1"));
	}
}
