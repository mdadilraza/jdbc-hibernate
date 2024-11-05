package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import dto.PanCard;
import dto.Person;

public class PersonDao {
	
	EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("adil");
	EntityManager  entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction = entityManager.getTransaction();
    
    public void saveBoth(Person person) {
    	entityTransaction.begin();
    	PanCard card = person.getCard();
    	entityManager.persist(person);
    	entityManager.persist(card);
    	
    	
    	entityTransaction.commit();
    }
    
    //fetchAll()
    public void fetchAll() {
    	Query query = entityManager.createQuery("select c from Person c");
		List<Person> list =  query.getResultList();
		System.out.println(list);
    }
    
    public void fetchPersonById(int personId) {
    Person person	=entityManager.find(Person.class, personId);
    System.out.println(person);
    }
    
    public void fetchPanCardById(int panCardId) {
    PanCard card	=entityManager.find(PanCard.class,panCardId);
  Person person  =card.getPerson();
  System.out.println(card);
  System.out.println(person);
  
    
    }
    
   
    
    //delete()
    public void deleteBoth(int personId) {
   Person person 	=entityManager.find(Person.class, personId);
  PanCard card= person.getCard();
   entityTransaction.begin();
   
   entityManager.remove(person);
   entityManager.remove(card);
   entityTransaction.commit();
   
    	
    }
    
    public void deleteBothByPanCardId(int panCardId) {
    	PanCard card  = entityManager.find(PanCard.class, panCardId);
    Person person 	=card.getPerson();
    entityTransaction.begin();
    
    entityManager.remove(person);
    entityManager.remove(card);
    entityTransaction.commit();
    }

}
