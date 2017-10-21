package kgy.make.service;

import java.util.List;

import kgy.make.vo.ComVO;

public interface CommonService {
	
	List<ComVO> getCommonList(String key) throws Exception;
}
