package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
//insert data 
	public void savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	//fetch
	public void fetchPerson(int id) {
		Person person = entityManager.find(Person.class, id);
		System.out.println(person);
	}
	
	//updatePerson()
    public void  updatePerson(int oldId, Person newPerson) {
    	newPerson.setPersonId(oldId);
    	entityTransaction.begin();
    	
    	entityManager.merge(newPerson);
    	entityTransaction.commit();
    	
    }
    
    //delete ()
    public void deletePerson(int id) {
    Person person	= entityManager.find(Person.class, id);
    entityTransaction.begin();
    entityManager.remove(person);
    entityTransaction.commit();
    
    }
}
