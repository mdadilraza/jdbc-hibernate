package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dto.Student;

public class CourseDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void saveBoth(List<Student> student) {
	//List<Course> course	=student.getCourses();
	
		entityTransaction.begin();
		for(Student student2: student)
		entityManager.persist(student2);
		//for(Course course2: course)
		//entityManager.persist(course);
		
		entityTransaction.commit();
		
		
	}

}
