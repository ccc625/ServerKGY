package kgy.search.sceduler;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import kgy.search.dao.SearchDao;
import kgy.search.service.SearchService;

@Component
public class TeamSceduler {
	@Resource(name="searchDAO")
	SearchDao searchDao;
	
	@Scheduled(cron = "0 0 11 * * ?")
	public void deleteTeamJob(){
		try {
			System.out.println("팀 정보 초기화 작업 시작~~");
			searchDao.updateTeamInfo();
			System.out.println("팀 정보 초기화 작업 끝");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
