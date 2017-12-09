package kgy.search.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kgy.common.vo.CommonVO;
import kgy.search.service.SearchService;
import kgy.search.vo.TeamList;

@Controller
@RequestMapping(value="/kgy/search")
public class SearchController {
	
	@Resource(name="searchSerivce")
	SearchService service;
	
	@RequestMapping(value="getTeamList.do", method=RequestMethod.POST)
	public CommonVO getTeamList(HashMap<String, Object> data){
		CommonVO commonVO = new CommonVO();
		try {
			List<TeamList> list = new ArrayList<TeamList>();
			list = service.getTeamList(data);
			commonVO.setResult(list);
			commonVO.setSuccess(true);
		} catch (Exception e) {
			// TODO: handle exception
			commonVO.setSuccess(false);
			commonVO.setMsg(e.getMessage());
		}
		
		return commonVO;
	}
}
