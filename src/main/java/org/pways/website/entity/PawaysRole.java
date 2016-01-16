package org.pways.website.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author hlj
 */
@Entity
@Table(name = "pws_role")
public class PawaysRole extends BaseEntity {
	
	private static final long serialVersionUID = -6852003270509407459L;

	private String roleName;
	
	private String desc;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	
	
	
	
}
