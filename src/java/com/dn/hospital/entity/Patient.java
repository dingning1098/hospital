package com.dn.hospital.entity;

import java.util.Date;

public class Patient {
	private static final long serialVersionUID=1L;
	private String id;
	private String pName;
	private Integer age;
	private String sex;
	private Date toHosTim;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getToHosTim() {
		return toHosTim;
	}

	public void setToHosTim(Date toHosTim) {
		this.toHosTim = toHosTim;
	}
}
