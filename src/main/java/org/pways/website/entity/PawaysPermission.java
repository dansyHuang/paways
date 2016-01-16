package org.pways.website.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hlj
 */
@Entity
@Table(name = "pws_role")
public class PawaysPermission extends BaseEntity {
	
	private static final long serialVersionUID = -5776111452809913988L;

	private String roleName;
	
	private String resource;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}


	
	
	
	
	
}
