package com.daeatdak.myPage.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.myPage.dto.MyPageDTO;
import com.daeatdak.myPage.vo.MyPageWishListVO;
import com.daeatdak.user.vo.UserUpdateVO;
import com.daeatdak.user.vo.UserVO;
import com.mybatis.config.MyBatisConfig;

public class MyPageDAO {

	public SqlSession sqlSession;

	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public String selectUserPassword(String userEmail) {
		return sqlSession.selectOne("myPage.selectUserPassword", userEmail);
	}

	// 회원정보(수정페이지)
	public UserVO selectUserInfo(int userNum) {
		return sqlSession.selectOne("myPage.selectUserInfo", userNum);
	}

	// 회원수정(비밀번호)
	public void updateUserInfo(UserUpdateVO userUpdateVO) {
		sqlSession.update("myPage.updateUserInfo", userUpdateVO);
	}

	// 회원수정(주소)
	public void updateUserAddress(UserUpdateVO userUpdateVO) {
		sqlSession.update("myPage.updateUserAddress", userUpdateVO);
	}

	// 찜하기
	public void insertWishList(int goodsNum, int userNum) {
		Map<String, Object> wishlist = new HashMap<>();
		wishlist.put("goodsNum", goodsNum);
		wishlist.put("userNum", userNum);

		sqlSession.insert("myPage.insertWishList", wishlist);
	}

	//찜 목록 이동
	public List<MyPageWishListVO> selectWishList(int userNum){
		return sqlSession.selectList("myPage.selectWishList", userNum);
	}
	
	
	//찜 상품 삭제
	public void deleteWishList(int wishlistNum) {
		sqlSession.delete("myPage.deleteWishList", wishlistNum);
	}
	

	public List<MyPageDTO> productList() {
		System.out.println("여긴 왔나??");
		return sqlSession.selectList("myPage.productList");

	}

}
