package kgy.search.service;

import java.util.HashMap;
import java.util.List;

import kgy.search.vo.BoardInfoVO;
import kgy.search.vo.BoardList;
import kgy.search.vo.TeamInfo;
import kgy.search.vo.TeamList;

public interface SearchService {

	List<TeamList> getTeamList(HashMap<String, Object> data) throws Exception;
	
	TeamInfo getTeamInfo(String id) throws Exception;
	
	int setBoardInfo(BoardInfoVO info)throws Exception;
	
	List<BoardList> getBoardInfoList(String id) throws Exception;
}
