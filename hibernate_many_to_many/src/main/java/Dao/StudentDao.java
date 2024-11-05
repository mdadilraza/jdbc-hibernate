package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Course;
import dto.Student;

public class StudentDao {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveBoth(Student student) {
	List<Course> list	=student.getCources();
	
	entityTransaction.begin();
	for(Course course: list) {
		entityManager.persist(course);
	}
	entityManager.persist(student);
	
	entityTransaction.commit();
	}
	
	//delete ()
	

}
