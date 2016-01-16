package org.pways.website.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author hlj
 */
@Entity
@Table(name = "paws_user_login")
public class PawaysUserLogin extends BaseEntity {
	private static final long serialVersionUID = 8470931093809135666L;
	private String email;
	private String name;
	private String idCard;
	private String hometow;
	private String gender;
	private String age;
	private String mobileNum;
	private String roleName;
	private String plainPassword;
	private String password;
	private String salt;
	private String imgPath;
	private String loginId;
	 //多对多用户权限表  
	private List<PawaysUserRole> pawaysUserRole;

	@OneToMany(mappedBy = "pawaysUserLogin",fetch = FetchType.LAZY,cascade=CascadeType.ALL)  
	public List<PawaysUserRole> getPawaysUserRole() {
		return pawaysUserRole;
	}
	public void setPawaysUserRole(List<PawaysUserRole> pawaysUserRole) {
		this.pawaysUserRole = pawaysUserRole;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setHometow(String hometow) {
		this.hometow = hometow;
	}

	public String getHometow() {
		return hometow;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	// 不持久化到数据库，也不显示在Restful接口的属性.
	@Transient
	@JsonIgnore
	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}

}
