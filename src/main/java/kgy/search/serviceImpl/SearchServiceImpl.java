package kgy.search.serviceImpl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kgy.search.dao.SearchDao;
import kgy.search.service.SearchService;
import kgy.search.vo.TeamList;

@Service("searchSerivce")
public class SearchServiceImpl implements SearchService{

	@Resource(name="searchDAO")
	SearchDao searchDao;
	
	@Override
	public List<TeamList> getTeamList(HashMap<String, Object> data) throws Exception {
		// TODO Auto-generated method stub
		if(!(data.get("search") != null && !data.get("search").equals(""))){
			data.put("search", null);
		}
		return searchDao.selectListTeam(data);
	}
	
	
}
