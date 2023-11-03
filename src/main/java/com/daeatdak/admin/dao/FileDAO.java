package com.daeatdak.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.admin.dto.FileDTO;
import com.daeatdak.admin.dto.GoodsDetailImageDTO;
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
	public void goodsDetailFileDelete(int goodsNum) {
		sqlSession.delete("admin.goodsDetailFileDelete", goodsNum);
	}
	
	public int getSequence() {
		return sqlSession.selectOne("file.getSequence");
	}
	
	public void insertDetailImage(GoodsDetailImageDTO goodsDetailImageDTO) {
		sqlSession.insert("file.insertDetailImage", goodsDetailImageDTO);
	}
}
