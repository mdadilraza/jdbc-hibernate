package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Pen;

public class PenDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

//insert data 
	public void savePen(Pen pen) {
		entityTransaction.begin();
		entityManager.persist(pen);
		entityTransaction.commit();
	}
	
	//fetch 
	public void fetchPen(int id ) {
		
	Pen pen	=entityManager.find(Pen.class, id);
	System.out.println(pen);
		
	}

}
