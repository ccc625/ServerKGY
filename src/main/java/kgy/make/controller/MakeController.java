package kgy.make.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kgy.common.vo.CommonVO;
import kgy.make.service.CommonService;
import kgy.make.service.MakeService;
import kgy.make.vo.ComVO;

@Controller
@RequestMapping(value="/kgy/make")
public class MakeController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name = "commonService")
	private CommonService commonService;
	
	@Resource(name = "makeService")
	private MakeService makeService;
		
	/**
	 * 요약 : 공통 코드 조회
	 * @param request
	 * @param response
	 * @param upperKey ( 조회할 공통 코드 상위 코드 )
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/getCommonList.do", method=RequestMethod.POST)
	@ResponseBody
	public CommonVO getCommonList(HttpServletRequest request,HttpServletResponse response,String upperKey) throws Exception{
		
		System.out.println(upperKey);
		//공통 VO 선언
		CommonVO commonVO = new CommonVO();
		
		//공통함수 VO 선언
		List<ComVO> comList = new ArrayList<ComVO>();		
		
		try {
			comList = commonService.getCommonList(upperKey);
			commonVO.setResult(comList);
			commonVO.setSuccess(true);
		} catch (Exception e) {
			// TODO: handle exception
			commonVO.setSuccess(false);
			commonVO.setMsg(e.getMessage());
		}
		
		
		return commonVO;
	}
	
	
}
