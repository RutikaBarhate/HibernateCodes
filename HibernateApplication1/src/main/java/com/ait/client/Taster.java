package com.ait.client;
import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOIMPL;
import com.ait.entity.Student;
public class Taster {

	public static void main(String[] args) 
	{
		
		StudentDAO dao = new StudentDAOIMPL();
		/*
		Student student = new Student();
		student.setSid(100);
		student.setSname("Rutika");
		student.setGender("Female");
		student.setMarks(80);
		dao.saveStudent(student);
         */
		
		/*Student stud = dao.loadStudent(1200);
		System.out.println(stud);*/
		
		/*
		Student s = dao.updateStudent(100, 799);
		System.out.println(s);
		*/
		
		//dao.deleteStudent(101);
		dao.level1CacheTest();


	}

}
