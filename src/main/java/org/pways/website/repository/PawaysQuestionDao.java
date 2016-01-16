package org.pways.website.repository;

import java.util.List;

import org.pways.website.entity.PawaysQuestion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PawaysQuestionDao extends PagingAndSortingRepository<PawaysQuestion, Long> {
	
	@Query("SELECT p FROM PawaysQuestion p WHERE authorId =?1 and status='waiting'")  
	List<PawaysQuestion> findWaiting(String authorId);
}
