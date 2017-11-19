package kgy.make.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kgy.common.dao.AbstractDAO;
import kgy.make.vo.ComVO;

@Repository("commonDAO")
public class CommonDao extends AbstractDAO{
	
	private static final String namespace = "kgy.common";
	
	@SuppressWarnings("unchecked")
	public List<ComVO> selectListCommon(String key){
		return (List<ComVO>)selectList(namespace+".selectListCommon", key);
	}
}
