package org.pways.website.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paws_user_jiazhang")
public class PawasyUserJiaZhang extends BaseEntity {
	private static final long serialVersionUID = -3976735130368420900L;
	private String email;
	private String targetSchool;
	private String targetProfessionals;
	private String childCause;
	private String childGrade;
	private String targetGender;
	private String requireDesc;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTargetSchool() {
		return targetSchool;
	}

	public void setTargetSchool(String targetSchool) {
		this.targetSchool = targetSchool;
	}

	public String getTargetProfessionals() {
		return targetProfessionals;
	}

	public void setTargetProfessionals(String targetProfessionals) {
		this.targetProfessionals = targetProfessionals;
	}

	public String getChildCause() {
		return childCause;
	}

	public void setChildCause(String childCause) {
		this.childCause = childCause;
	}

	public String getChildGrade() {
		return childGrade;
	}

	public void setChildGrade(String childGrade) {
		this.childGrade = childGrade;
	}

	public String getTargetGender() {
		return targetGender;
	}

	public void setTargetGender(String targetGender) {
		this.targetGender = targetGender;
	}

	public String getRequireDesc() {
		return requireDesc;
	}

	public void setRequireDesc(String requireDesc) {
		this.requireDesc = requireDesc;
	}

}
