package ssg.com.a.dao;

import ssg.com.a.dto.MemberDto;

public interface MemberDao {
	
	public int idcheck(String id);
	
	public int addmember(MemberDto dto);
	
	public MemberDto login(MemberDto dto);
}
