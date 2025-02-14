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
		/*StudentCompositeKey compositekey = new StudentCompositeKey();
		compositekey.setRollnum(100);
		compositekey.setSection("B");

		StudentEntity entity = new StudentEntity();
		entity.setCompositkey(compositekey);
		entity.setStudentName("Pramod");
		entity.setMarks(900);
		
		dao.saveStudent(entity);
		*/
		
		/*
		 * 
		 * fetch a student entity
		 */
		StudentCompositeKey compositekey = new StudentCompositeKey();
		compositekey.setRollnum(100);
		compositekey.setSection("A");
		
		StudentEntity entity = dao.fetchStudent(compositekey);
		System.out.println("name "+ entity.getStudentName());
		System.out.println("marks "+ entity.getMarks());
		
	}

}
