package com.daeatdak.goods.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.goods.dto.CartDTO;
import com.daeatdak.goods.dto.CartItemDTO;
import com.daeatdak.goods.dto.GoodsDTO;
import com.daeatdak.goods.dto.GoodsImageDTO;
import com.daeatdak.goods.dto.GoodsSearchDTO;
import com.daeatdak.goods.vo.GoodsDetailInfoVO;
import com.daeatdak.goods.vo.GoodsDetailVO;
import com.daeatdak.goods.vo.GoodsListByCategoryVO;
import com.daeatdak.goods.vo.GoodsListBySearchVO;
import com.mybatis.config.MyBatisConfig;

public class GoodsDAO {
	   public SqlSession sqlSession;
	   
	   public GoodsDAO() {
	      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	   }
	   
	   public List<GoodsDTO> selectCategory(int categoryNum){
	      return sqlSession.selectList("goods.selectCategory", categoryNum);
	   }
	   
   
	   public List<GoodsImageDTO> selectImage(){
		   return sqlSession.selectList("goods.selectImage");
	   }
	   
//	   public GoodsImageDTO selectImageByGoodsNum(int goodsNum){
//		   return sqlSession.selectOne("goods.selectImageByGoodsNum",goodsNum);
//	   }
	   
//	   public GoodsDTO selectGoodsNum(int goodsNum){
//		   return sqlSession.selectOne("goods.selectGoodsNum", goodsNum);
//	   }
	   public CartDTO selectCart(int userNum) {
		   return sqlSession.selectOne("goods.selectCart",userNum);
	   }
	   
	   public void createCart(int userNum) {
		   sqlSession.insert("goods.createCart",userNum);
	   }
	   
	   public void insertCartItem(int userNum, int goodsNum) {
		    Map<String, Object> params = new HashMap<>();
		    params.put("userNum", userNum);
		    params.put("goodsNum", goodsNum);
		    sqlSession.insert("goods.cartItemInsert", params);
		}
	   
	   public CartDTO selectMyCart(int userNum) {
		   return sqlSession.selectOne("goods.selectMyCart",userNum);
	   }
	   
	   public List<CartItemDTO> selectItemByCartNum(int cartNum){
		   return sqlSession.selectList("goods.selectItemByCartNum",cartNum);
	   }
	   
	   public List<GoodsDTO> selectCartItems(int CartNum){
		      return sqlSession.selectList("goods.selectCartItems", CartNum);
		   }
	   
	   
	   public List<GoodsListByCategoryVO> goodsListByCategory(int categoryNum){
		   
		   return sqlSession.selectList("goods.goodsListByCategory",categoryNum);
	   }
	   
	   public List<GoodsListBySearchVO> searchGoodsList(GoodsSearchDTO goodsSearchDTO){
		   return sqlSession.selectList("goods.searchGoodsList", goodsSearchDTO);
	   }
	   
	   
	   
	   public List<GoodsDetailVO> goodsDetailImage(int goodsNum) {
		   return sqlSession.selectList("goods.goodsDetailImage", goodsNum);
	   }
	   
	   public GoodsDetailInfoVO GoodsDetailInfo(int goodsNum) {
		   return sqlSession.selectOne("goods.goodsDetailInfo", goodsNum);
	   }
	   
	   
	   
}
