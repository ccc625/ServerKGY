package kgy.make.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kgy.make.dao.MakeDao;
import kgy.make.service.MakeService;

@Service("makeService")
public class MakeServiceImpl implements MakeService{

	@Resource(name = "makeDAO")
	private MakeDao makeDao;
	
}
