package kgy.search.serviceImpl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kgy.common.util.CommonUtil;
import kgy.search.dao.SearchDao;
import kgy.search.service.SearchService;
import kgy.search.vo.BoardInfoVO;
import kgy.search.vo.BoardList;
import kgy.search.vo.TeamInfo;
import kgy.search.vo.TeamList;

@Service("searchSerivce")
public class SearchServiceImpl implements SearchService{

	@Resource(name="searchDAO")
	SearchDao searchDao;
	
	@Override
	public List<TeamList> getTeamList(HashMap<String, Object> data) throws Exception {
		// TODO Auto-generated method stub
		return searchDao.selectListTeam(data);
	}

	@Override
	public TeamInfo getTeamInfo(String id) throws Exception {
		// TODO Auto-generated method stub
		return searchDao.selectTeamInfo(id);
	}

	@Override
	public int setBoardInfo(BoardInfoVO info) throws Exception {
		// TODO Auto-generated method stub
		info.setBoardNo(CommonUtil.getUUID());
		return searchDao.insertBoardInfo(info);
	}

	@Override
	public List<BoardList> getBoardInfoList(String id) throws Exception {
		// TODO Auto-generated method stub
		return searchDao.selectListBoard(id);
	}

	@Override
	public void deleteTeamInfo() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
