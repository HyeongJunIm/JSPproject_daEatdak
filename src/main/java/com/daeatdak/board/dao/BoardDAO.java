package com.daeatdak.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.daeatdak.board.dto.BoardDTO;
import com.daeatdak.board.vo.BoardVO;
import com.daeatdak.goods.dto.CartDTO;
import com.mybatis.config.MyBatisConfig;

public class BoardDAO {
	public SqlSession sqlSession;
	
	public BoardDAO() {
		
		sqlSession=MyBatisConfig.getSqlSessionFactory().openSession(true);
		//자동으로 커밋할수 있도록 저장 
	}
	//메소드 
	
	// 게시판 리스트에 글 목록이 올수 있도록 저장
	public List<BoardVO> selectAll(){
		
		return sqlSession.selectList("board.selectAll");
		
	}
	// 글 작성 데이터에 저장하는 메소드
	public void writeInsert(BoardDTO boardDTO) {
	
	 sqlSession.insert("board.write", boardDTO);
	
	} 
	// 게시판의 상세 정보를 확인 페이지의 값을 불러오는 메소드 
	public BoardVO select(int boardNumber) {
		return sqlSession.selectOne("board.select", boardNumber);
	}
	
	//상세정보 페이지를 다른 사람이 확인하면 조호수가 올라가는 메소드 
	
	public void updateViewCount(int boardNum) {
		sqlSession.update("board.updateViewCount",boardNum);
		
	}
	
	// 비공개 글 비밀번호 확인 메소드 
	public BoardVO selectPassword(int boardNum) {
		return sqlSession.selectOne("board.selectPassword", boardNum);
	}
	
	public BoardVO privateContent(int boardNum) {
		return sqlSession.selectOne("board.privateContent", boardNum);
	}
	//게시글을 수정 하는 메소드 
	public void update(BoardVO boardVO) {
		sqlSession.update("board.update", boardVO);
	}
	public BoardVO updateContent(int boardNum) {
		return sqlSession.selectOne("board.updateContent", boardNum);
	}
	// 게시글 삭제하는 메소드 
	public void delate(int boardNum) {
		sqlSession.delete("board.delete",boardNum);
	}

	public BoardVO selectMyInfo(int userNum) {
	  return sqlSession.selectOne("board.selectMyInfo",userNum);
	   }
}


