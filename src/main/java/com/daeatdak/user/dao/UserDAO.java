package com.daeatdak.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.user.dto.UserDTO;
import com.daeatdak.user.vo.UserVO;
import com.mybatis.config.MyBatisConfig;

public class UserDAO {
	private SqlSession sqlSession;

	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);

	}

	public void join(UserDTO userDTO) {
		sqlSession.insert("user.join", userDTO);
	}

	// 아이디 중복검사 메소드
	// selectOne의 반환타입은 object 타입이다. 비교를하기 위해서 Integer타입으로 형변환한다.
	public boolean checkId(String userId) {
		return (Integer) sqlSession.selectOne("user.checkId", userId) <= 0;
	}

	// 아이디찾기
	public UserDTO findUserEmailByName(UserDTO userDTO) {

		userDTO = sqlSession.selectOne("user.getUserEmailByName", userDTO);

		return userDTO;
	}

	// 비밀번호 찾기
	public UserDTO findUserPasswordByEmail(UserDTO userDTO) {

		userDTO = sqlSession.selectOne("user.getUserPasswordByEmail", userDTO);
		return userDTO;
	}

	public int getSequence() {
		return sqlSession.selectOne("user.getSequence");
	}

	public List<UserVO> userInfoList() {

		return sqlSession.selectList("user.userInfoList");
	}

	public UserDTO login(UserDTO userDTO) {
		UserDTO user = sqlSession.selectOne("user.login", userDTO);
		return user;
	}

	public boolean checkPhone(String userPhone) {
		return (Integer) sqlSession.selectOne("user.checkPhone", userPhone) <= 0;
	}

	// 회원탈퇴
	public void deleteUser(int userNum) {
		sqlSession.delete("user.deleteUser", userNum);
	}

}
