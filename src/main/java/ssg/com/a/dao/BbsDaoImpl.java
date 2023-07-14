package ssg.com.a.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssg.com.a.dto.BbsDto;
import ssg.com.a.dto.BbsParam;

@Repository
public class BbsDaoImpl implements BbsDao{

	@Autowired
	SqlSessionTemplate session;	// SqlSession과 같음 
	
	String ns = "Bbs."; // mapper의 namespace임

	@Override
	public List<BbsDto> bbslist(BbsParam param) {
		return session.selectList(ns + "bbslist", param);
	}

	@Override
	public int getAllBbs(BbsParam param) {
		return session.selectOne(ns + "getallbbs", param);
	}

	@Override
	public int bbswrite(BbsDto dto) {
		return session.insert(ns + "bbswrite", dto);
	}

	@Override
	public BbsDto bbsdetail(int seq) {
		return session.selectOne(ns + "bbsdetail", seq);
	}

	
	
	
	
	
	
	
	
	
}















