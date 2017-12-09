package kgy.search.service;

import java.util.HashMap;
import java.util.List;

import kgy.search.vo.TeamList;

public interface SearchService {

	List<TeamList> getTeamList(HashMap<String, Object> data) throws Exception;
}
