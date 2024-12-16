package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOIMPL;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;


public class Taster {

	public static void main(String[] args) 
	{
		StudentDAO  dao = new StudentDAOIMPL();
		
		/*
		 * save a student entity
		 */
		StudentCompositeKey compositekey = new StudentCompositeKey();
		compositekey.setRollnum(100);
		compositekey.setSection("A");

		StudentEntity entity = new StudentEntity();
		entity.setCompositkey(compositekey);
		entity.setStudentName("Rutika");
		entity.setMarks(800);
		
		dao.saveStudent(entity);
	}

}
