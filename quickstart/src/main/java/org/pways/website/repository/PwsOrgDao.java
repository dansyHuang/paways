package org.pways.website.repository;

import java.util.List;

import org.pways.website.entity.PwsOrg;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author liangjun.huanglj
 */
public interface PwsOrgDao extends PagingAndSortingRepository<PwsOrg, Long> {
	List<PwsOrg> findByLeveltype(String levelType);
	
	List<PwsOrg> findByParentid(String parentid);
}
