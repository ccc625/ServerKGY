package kgy.make.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kgy.make.dao.CommonDao;
import kgy.make.service.CommonService;
import kgy.make.vo.ComVO;

@Service("commonService")
public class CommonServiceImpl implements CommonService{

	@Resource(name="commonDAO")
	CommonDao commonDao;
	
	@Override
	public List<ComVO> getCommonList(String key) throws Exception {
		// TODO Auto-generated method stub
		return commonDao.selectListCommon(key);
	}

	
}
