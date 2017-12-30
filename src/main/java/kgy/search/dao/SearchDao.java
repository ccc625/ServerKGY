package kgy.search.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import kgy.common.dao.AbstractDAO;
import kgy.search.vo.BoardInfoVO;
import kgy.search.vo.BoardList;
import kgy.search.vo.TeamInfo;
import kgy.search.vo.TeamList;

@Repository("searchDAO")
public class SearchDao extends AbstractDAO{

	private static final String namespace = "kgy.search.";
	
	public List<TeamList> selectListTeam(HashMap<String, Object> data) throws Exception{
		return (List<TeamList>) selectList(namespace+"selectListTeam", data);
	}
	
	public TeamInfo selectTeamInfo(String id) throws Exception{
		return (TeamInfo) selectOne(namespace+"selectTeamInfo",id);
	}
	
	public int insertBoardInfo(BoardInfoVO info) throws Exception{
		return (Integer) insert(namespace+"insertBoardInfo", info);
	}
	
	public List<BoardList> selectListBoard(String id) throws Exception{
		return (List<BoardList>) selectList(namespace+"selectListBoard",id);
	}
}
