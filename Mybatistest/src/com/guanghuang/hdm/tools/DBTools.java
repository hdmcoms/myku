package com.guanghuang.hdm.tools;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class DBTools {
	private static SqlSessionFactory faction=null;
	static {  
		
		try {
			faction = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSession getsqlsseion() {
		return faction.openSession();
	}
}
