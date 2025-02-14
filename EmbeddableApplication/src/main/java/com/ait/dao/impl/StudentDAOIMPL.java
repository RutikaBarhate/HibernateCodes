package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.StudentDAO;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public class StudentDAOIMPL implements StudentDAO 
{
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	@Override
	public void saveStudent(StudentEntity entity) 
	{
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		try
		{
			entityManager.persist(entity);
			tx.commit();
			System.out.println("StudentEntity is persisted to the Database....");
		}
		catch(Exception ex) 
		{
			tx.rollback();
			System.out.println("Issue in persisting StudentEntity...." + ex);
		}
		finally 
		{
			entityManager.close();
		}

	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositekey) 
	{
		EntityManager entityManager = factory.createEntityManager();
		StudentEntity entity = entityManager.find(StudentEntity.class,compositekey);
		entityManager.close();		
		return entity;
	}

}
