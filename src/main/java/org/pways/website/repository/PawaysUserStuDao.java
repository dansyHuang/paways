package org.pways.website.repository;

import org.pways.website.entity.PawaysUserLogin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PawaysUserStuDao extends PagingAndSortingRepository<PawaysUserLogin, Long> {
	@Query("SELECT p FROM PawaysUserLogin p WHERE loginId =?1")  
	PawaysUserLogin findByLoginId(String loginId);
}
