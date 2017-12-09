package kgy.search.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import kgy.common.dao.AbstractDAO;
import kgy.search.vo.TeamList;

@Repository("searchDAO")
public class SearchDao extends AbstractDAO{

	private static final String namespace = "kgy.search.";
	
	public List<TeamList> selectListTeam(HashMap<String, Object> data) throws Exception{
		return (List<TeamList>) selectList(namespace+"selectListTeam", data);
	}
}
