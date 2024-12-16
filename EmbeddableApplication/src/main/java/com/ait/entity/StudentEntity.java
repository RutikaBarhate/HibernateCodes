package com.ait.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name ="TBL_STUDENTS")
public class StudentEntity 
{
	@EmbeddedId
	private StudentCompositeKey compositkey;
	
	@Column(name = "Sname")
	private String StudentName;
	
	private Integer Marks;

	public StudentCompositeKey getCompositkey() {
		return compositkey;
	}

	public void setCompositkey(StudentCompositeKey compositkey) {
		this.compositkey = compositkey;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Integer getMarks() {
		return Marks;
	}

	public void setMarks(Integer marks) {
		Marks = marks;
	}
	
}
