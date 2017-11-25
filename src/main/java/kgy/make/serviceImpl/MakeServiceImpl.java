package kgy.make.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kgy.common.util.CommonUtil;
import kgy.make.dao.MakeDao;
import kgy.make.service.MakeService;
import kgy.make.vo.TeamVO;

@Service("makeService")
public class MakeServiceImpl implements MakeService{

	@Resource(name = "makeDAO")
	private MakeDao makeDao;

	@Override
	public int setRegisterInfo(TeamVO vo) throws Exception {
		// TODO Auto-generated method stub
		int success = 0;
		String teamNo = CommonUtil.getUUID();
		String imgNo = CommonUtil.getUUID();
		
		vo.setTeam_no(teamNo);
		vo.setTeam_img_cd(imgNo);
		try {
			success = makeDao.insertTeamInfo(vo);
			if(success == 1) {
				success = makeDao.insertImgFile(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
			success = 0;
		}
		return success;
	}
	
	
	
}
