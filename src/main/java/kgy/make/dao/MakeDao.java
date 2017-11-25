package kgy.make.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kgy.common.dao.AbstractDAO;
import kgy.make.vo.ComVO;
import kgy.make.vo.TeamVO;

@Repository("makeDAO")
public class MakeDao extends AbstractDAO{
	
	private static final String namespace = "kgy.make";
	 
	public int insertTeamInfo (TeamVO vo) {
		return (Integer) insert(namespace+"insertTeamInfo", vo);
	}
	
	public int insertImgFile (TeamVO vo) {
		return (Integer) insert(namespace+"insertImgFile", vo);
	}
    
}
