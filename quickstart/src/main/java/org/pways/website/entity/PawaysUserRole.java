package org.pways.website.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author hlj
 */
@Entity
@Table(name = "pws_user_role_org")
public class PawaysUserRole extends BaseEntity {
	
	private static final long serialVersionUID = -1925130798614782962L;

    private PawaysUserLogin pawaysUserLogin;  
    
    private PawaysRole pawaysRole;
    
    @ManyToOne(cascade = CascadeType.ALL)  
    @JoinColumn(name = "roleId", unique = true, insertable=false ,updatable=false) 
	public PawaysRole getPawaysRole() {
		return pawaysRole;
	}
	public void setPawaysRole(PawaysRole pawaysRole) {
		this.pawaysRole = pawaysRole;
	}
	@ManyToOne(cascade = CascadeType.ALL)  
    @JoinColumn(name = "loginId", unique = true, insertable=false ,updatable=false)  
	public PawaysUserLogin getPawaysUserLogin() {
		return pawaysUserLogin;
	}
	public void setPawaysUserLogin(PawaysUserLogin pawaysUserLogin) {
		this.pawaysUserLogin = pawaysUserLogin;
	}
	
	

	
}
