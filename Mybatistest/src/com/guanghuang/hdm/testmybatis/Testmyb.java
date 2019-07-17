package com.guanghuang.hdm.testmybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.guanghuang.hdm.pojo.Book;
import com.guanghuang.hdm.tools.DBTools;

public class Testmyb {
	public static void main(String[] args) {
		SqlSession sql = DBTools.getsqlsseion();
		List<Book> blist = new ArrayList<>();
		blist=sql.selectList("books.selectbooks");
		for (Book book : blist) {
			System.out.println(book.toString());
		}
		
		sql.close();
	}

}
