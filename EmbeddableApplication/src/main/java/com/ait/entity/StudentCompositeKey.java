package com.ait.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable
{
	@Column (name = "rollno")
	private Integer rollnum;
	
	@Column (name = "Section")
	private String section;

	public Integer getRollnum() {
		return rollnum;
	}

	public void setRollnum(Integer rollnum) {
		this.rollnum = rollnum;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	
	
}
