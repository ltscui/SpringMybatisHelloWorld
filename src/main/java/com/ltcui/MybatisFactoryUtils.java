package com.ltcui;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisFactoryUtils {

	private static Logger logger = LoggerFactory.getLogger(MybatisFactoryUtils.class);
	private static SqlSessionFactory factory = null;
	
	/**
	 * 单例模式 获取 SqlSessionFactory 对象
	 * 
	 * @return
	 */
	public static SqlSessionFactory getSessionFactory() {
		if(MybatisFactoryUtils.factory == null){
			synchronized(MybatisFactoryUtils.class){
				if(MybatisFactoryUtils.factory == null){
					logger.info("^_^初始化Spring配置文件 applicationContext.xml >>>>>> ");
					ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
					logger.info("^_^初始化 Mybatis SqlSessionFactory >>>>>> ");
					MybatisFactoryUtils.factory = (SqlSessionFactory)ctx.getBean("sqlSessionFactory");
				}
			}
		}
		return MybatisFactoryUtils.factory;
	}
}
