package org.pways.website.repository;

import java.util.List;

import org.pways.website.entity.PawaysPermission;
import org.pways.website.entity.PawaysRole;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PawaysPermissionDao extends PagingAndSortingRepository<PawaysRole, Long> {
	List<PawaysPermission> findByRoleName(String roleName);
}
