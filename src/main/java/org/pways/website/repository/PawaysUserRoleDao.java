package org.pways.website.repository;

import java.util.List;

import org.pways.website.entity.PawaysUserRole;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PawaysUserRoleDao extends PagingAndSortingRepository<PawaysUserRole, Long> {
	@Modifying
	@Query("SELECT p FROM PawaysUserRole p WHERE loginId =?1") 
	List<PawaysUserRole> findByLoginId(String loginId);
}
