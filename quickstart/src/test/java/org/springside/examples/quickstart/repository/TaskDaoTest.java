package org.springside.examples.quickstart.repository;

import java.util.List;

import org.junit.Test;
import org.pways.website.entity.PwsOrg;
import org.pways.website.entity.District;
import org.pways.website.entity.Province;
import org.pways.website.repository.PwsOrgDao;
import org.pways.website.repository.DistrictDao;
import org.pways.website.repository.ProvinceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TaskDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private ProvinceDao provinceDao;
	
	@Autowired
	private PwsOrgDao cityDao;
	
	@Autowired
	private DistrictDao districtDao;
	

	@Test
	public void findAll() throws Exception {
		/*Page<Province> tasks = provinceDao.findByUserId(2L, new PageRequest(0, 100, Direction.ASC, "id"));
		assertEquals(5, tasks.getContent().size());
		assertEquals(new Long(1), tasks.getContent().get(0).getId());

		tasks = taskDao.findByUserId(99999L, new PageRequest(0, 100, Direction.ASC, "id"));
		assertEquals(0, tasks.getContent().size());*/
		List<Province> result=(List<Province>) provinceDao.findAll();
		List<PwsOrg> cityList=this.cityDao.findByCityUpId("001001");
		List<District> districtList=this.districtDao.findByDistrictUpId("001012008");
		for(District district:districtList){
			System.out.println(district.getDistrictName());
		}
	}
}
