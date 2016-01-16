package org.pways.website.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fch_district")
public class District {
	private String serialId;
	private String districtId;
	private String districtName;
	private String districtUpId;
	private String districtUpIdNum;
	private String districtPath;
	private String districtType;
	private String districtTypeNum;
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

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictUpId(String districtUpId) {
		this.districtUpId = districtUpId;
	}

	public String getDistrictUpId() {
		return districtUpId;
	}

	public void setDistrictUpIdNum(String districtUpIdNum) {
		this.districtUpIdNum = districtUpIdNum;
	}

	public String getDistrictUpIdNum() {
		return districtUpIdNum;
	}

	public void setDistrictPath(String districtPath) {
		this.districtPath = districtPath;
	}

	public String getDistrictPath() {
		return districtPath;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictTypeNum(String districtTypeNum) {
		this.districtTypeNum = districtTypeNum;
	}

	public String getDistrictTypeNum() {
		return districtTypeNum;
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
