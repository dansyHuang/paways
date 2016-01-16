package org.pways.website.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fch_province")
public class Province {

	private String serialId;
	private String provinceId;
	private String provinceName;
	private String provinceUpId;
	private String provinceUpIdNum;
	private String provincePath;
	private String provinceType;
	private String provinceTypeNum;
	private String shortName;
	private String spell;
	private String areaId;
	private String postCode;

	
	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getSerialId() {
		return serialId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceUpId(String provinceUpId) {
		this.provinceUpId = provinceUpId;
	}

	public String getProvinceUpId() {
		return provinceUpId;
	}

	public void setProvinceUpIdNum(String provinceUpIdNum) {
		this.provinceUpIdNum = provinceUpIdNum;
	}

	public String getProvinceUpIdNum() {
		return provinceUpIdNum;
	}

	public void setProvincePath(String provincePath) {
		this.provincePath = provincePath;
	}

	public String getProvincePath() {
		return provincePath;
	}

	public void setProvinceType(String provinceType) {
		this.provinceType = provinceType;
	}

	public String getProvinceType() {
		return provinceType;
	}

	public void setProvinceTypeNum(String provinceTypeNum) {
		this.provinceTypeNum = provinceTypeNum;
	}

	public String getProvinceTypeNum() {
		return provinceTypeNum;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}

	public String getSpell() {
		return spell;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPostCode() {
		return postCode;
	}

}
