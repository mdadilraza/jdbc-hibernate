package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import dto.College;

import dto.Student;

public class CollegeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// saveBoth()
	public void saveBoth(College college) {
		entityTransaction.begin();
		List<Student> list = college.getStudent();
		for (Student student : list) {
			entityManager.persist(student);
		}
		entityManager.persist(college);

		entityTransaction.commit();
	}

	// fetchById()
	public void fetchById(int studentId) {
		Student college = entityManager.find(Student.class, studentId);
		System.out.println(college);
	}

	// deleteBoth()
	public void deleteBoth(int collegeId) {
		College college = entityManager.find(College.class, collegeId);
		entityTransaction.begin();
		List<Student> student = college.getStudent();
		for (Student student2 : student) {
			entityManager.remove(student2);
		}

		entityManager.remove(college);

		entityTransaction.commit();
		

	}

	// fetchAll()
	public void fetchAll() {
    	javax.persistence.Query query = entityManager.createQuery("select c from College c");
		List<Student> list =  query.getResultList();
		System.out.println(list);
    }
    
	
	//fetchByName()
   public void fetchByStudent() {
	javax.persistence.Query query     =entityManager.createQuery("select c from Student c");
	
	List<Student> list = query.getResultList();
	System.out.println(list);
   }
   //updateBoth()
   
   public void updateBoth(int oldCollegeId, College newCollege) {
	   entityTransaction.begin();
	   newCollege.setCollegeId(oldCollegeId);
	   List<Student> list=newCollege.getStudent();
	   for (Student student : list) {
		   entityManager.merge(student);
		
	}
	   entityManager.merge(newCollege);
	   entityTransaction.commit();
   } 
   
   
}
