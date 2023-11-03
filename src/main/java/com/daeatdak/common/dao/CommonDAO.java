package com.daeatdak.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.admin.dto.FileDTO;
import com.daeatdak.admin.vo.GoodsListVO;
import com.daeatdak.common.dto.CommonDTO;
import com.daeatdak.goods.dto.GoodsImageDTO;
import com.mybatis.config.MyBatisConfig;

public class CommonDAO {

	public SqlSession sqlSession;
	
	public CommonDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	public List<GoodsListVO> selectAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll");
	}
	
	public List<CommonDTO> selectAll1() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll1");
	}
	
	public List<CommonDTO> selectAll2() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll2");
	}
	public List<CommonDTO> selectAll3() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll3");
	}
	public List<CommonDTO> selectAll4() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("common.selectAll4");
	}
	
	public List<GoodsImageDTO> selectImage(){
        return sqlSession.selectList("goods.selectImage");
     }
	
	public List<GoodsListVO> selectMainGoods(int categoryNum){
		return sqlSession.selectList("common.selectMainGoods", categoryNum);
	}
	
	public List<FileDTO> selectMainGoodsPic(int categoryNum){
		return sqlSession.selectList("common.selectMainGoodsPic", categoryNum);
	}
}
