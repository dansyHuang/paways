package org.pways.website.service.geography;

import java.util.List;

import org.pways.website.entity.PwsOrg;
import org.pways.website.repository.PwsOrgDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class GeographyService {

	private PwsOrgDao pwsOrgDao;
	
	public List<PwsOrg> getCityByPid(String parentId){
		return this.pwsOrgDao.findByParentid(parentId);
	}
	@Autowired
	public void setPwsOrgDao(PwsOrgDao pwsOrgDao) {
		this.pwsOrgDao = pwsOrgDao;
	}
	 
}
