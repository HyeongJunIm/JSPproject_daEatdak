package com.daeatdak.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.admin.dto.FileDTO;
import com.mybatis.config.MyBatisConfig;

public class FileDAO {
	SqlSession sqlSession;
	
	
	public FileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void insert(FileDTO fileDTO) {
		sqlSession.insert("file.insert", fileDTO);
	}
	
	public void delete(int goodsNum) {
		sqlSession.delete("admin.GoodsFileDelete", goodsNum);
	}
	
}
