package kgy.search.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kgy.common.vo.CommonVO;
import kgy.search.service.SearchService;
import kgy.search.vo.BoardInfoVO;
import kgy.search.vo.BoardList;
import kgy.search.vo.TeamInfo;
import kgy.search.vo.TeamList;

@Controller
@RequestMapping(value="/kgy/search")
public class SearchController {
	
	@Resource(name="searchSerivce")
	SearchService service;
	
	@RequestMapping(value="getTeamList.do", method=RequestMethod.POST)
	@ResponseBody
	public CommonVO getTeamList(String id,String search){
		CommonVO commonVO = new CommonVO();
		try {
			HashMap<String, Object> data = new HashMap<String, Object>();
			data.put("id", id);
			if(!search.equals("")){
				data.put("search", search);
			}
			
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
	
	@RequestMapping(value="getTeamInfo.do", method=RequestMethod.POST)
	@ResponseBody
	public CommonVO getTeamInfo(String id) throws Exception{
		CommonVO commonVO = new CommonVO();
		try {
			List<TeamInfo> list = new ArrayList<TeamInfo>();
			list.add(service.getTeamInfo(id));
			commonVO.setResult(list);
			commonVO.setSuccess(true);
		} catch (Exception e) {
			// TODO: handle exception
			commonVO.setSuccess(false);
			commonVO.setMsg(e.getMessage());
		}
		
		return commonVO;
	}
	@RequestMapping(value="getBoardList.do", method=RequestMethod.POST)
	@ResponseBody
	public CommonVO getBoardList(String id) throws Exception{
		CommonVO commonVO = new CommonVO();
		try {
			List<BoardList> list = new ArrayList<BoardList>();
			list = service.getBoardInfoList(id);
			commonVO.setResult(list);
			commonVO.setSuccess(true);
		} catch (Exception e) {
			// TODO: handle exception
			commonVO.setSuccess(false);
			commonVO.setMsg(e.getMessage());
		}
		
		return commonVO;
	}
	@RequestMapping(value="setBoardInfo.do", method=RequestMethod.POST)
	@ResponseBody
	public CommonVO setBoardInfo(BoardInfoVO info) throws Exception{
		CommonVO commonVO = new CommonVO();
		try {
			int success = service.setBoardInfo(info);
			if(success == 1){
				commonVO.setSuccess(true);	
			} else {
				commonVO.setSuccess(false);
			}			
		} catch (Exception e) {
			// TODO: handle exception
			commonVO.setSuccess(false);
			commonVO.setMsg(e.getMessage());
		}
		
		return commonVO;
	}
}
