package org.pways.website.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paways_user_teach")
public class PawaysUserTeach extends BaseEntity {
	private static final long serialVersionUID = -8783507471783406354L;
	private String schName;
	private String professionals;
	private String tartgetCause;
	private String targetGrade;
	private String targetGender;
	private String recommendDesc;

	public void setSchName(String schName) {
		this.schName = schName;
	}

	public String getSchName() {
		return schName;
	}

	public void setProfessionals(String professionals) {
		this.professionals = professionals;
	}

	public String getProfessionals() {
		return professionals;
	}

	public void setTartgetCause(String tartgetCause) {
		this.tartgetCause = tartgetCause;
	}

	public String getTartgetCause() {
		return tartgetCause;
	}

	public void setTargetGrade(String targetGrade) {
		this.targetGrade = targetGrade;
	}

	public String getTargetGrade() {
		return targetGrade;
	}
	
	
	public String getTargetGender() {
		return targetGender;
	}

	public void setTargetGender(String targetGender) {
		this.targetGender = targetGender;
	}

	public void setRecommendDesc(String recommendDesc) {
		this.recommendDesc = recommendDesc;
	}

	public String getRecommendDesc() {
		return recommendDesc;
	}

}
