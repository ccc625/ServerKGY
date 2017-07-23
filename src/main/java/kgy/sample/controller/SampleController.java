package kgy.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

import kgy.sample.service.SampleService;
//import kgy.sample.vo.EmpVO;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@Controller
@RequestMapping(value="/sample")
public class SampleController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	//ajax Sampl1 start
	@RequestMapping(value="/openSampleList.do")
	public ModelAndView openSampleList(Map<String,Object> commandMap) throws Exception{
		ModelAndView mav = new ModelAndView();
		log.debug("인터셉트 시작");
		List<Map<String,Object>> list = sampleService.selectEmpList(commandMap);
		mav.addObject("list",list);
		mav.setViewName("home2");
		
		return mav;
	}
	
	@RequestMapping(value="/ajaxSatrt.do",method=RequestMethod.GET)
	public void  ajaxSatrtList(HttpServletResponse response,@RequestParam(value="id")String id) throws Exception{
		    String personJson;
		    Map<String,Object> commandMap = new HashMap<String, Object>();
		    List<Map<String,Object>> list = sampleService.selectEmpList(commandMap);
		    try {
		        response.getWriter().print(list);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }   
	}
	//ajax end
	@RequestMapping(value="/openSampleList2.do")
	public ModelAndView openSampleAjax(Map<String,Object> commandMap) throws Exception{
		ModelAndView mav = new ModelAndView();
		log.debug("인터셉트 시작");
		//List<Map<String,Object>> list = sampleService.selectEmpList(commandMap);
		//mav.addObject("list",list);
		mav.setViewName("home3");
		
		return mav;
	}
	
	@RequestMapping(value="/ajaxSatrt2.do",method=RequestMethod.GET)
	public void  ajaxSatrtList2(HttpServletResponse response,@RequestParam(value="id")String id) throws Exception{
			 ObjectMapper mapper = new ObjectMapper();
			 Map<String,Object> commandMap = new HashMap<String, Object>();
			 List<Map<String,Object>> list = sampleService.selectEmpList(commandMap);
		    try {
		        response.getWriter().print(mapper.writeValueAsString(list));
		    } catch (IOException e) {
		        e.printStackTrace();
		    }   
		     
	}
}
