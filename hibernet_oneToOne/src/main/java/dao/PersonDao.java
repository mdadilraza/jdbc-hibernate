package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.PanCard;
import dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(Person person) {
		entityTransaction.begin();

		entityManager.persist(person);

		entityTransaction.commit();
	}

	public void updateBoth(int oldPersonId, Person newPerson) {
		newPerson.setId(oldPersonId);

		entityTransaction.begin();
		entityManager.merge(newPerson);
		entityTransaction.commit();

	}

	// fetchBoth

	public void fetchBoth(int id) {
		entityTransaction.begin();
		Person person = entityManager.find(Person.class, id);
		System.out.println(person);

		entityTransaction.commit();
	}

	// deleteBoth

	public void deleteboth(int id) {
		Person person = entityManager.find(Person.class, id);

		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
	}

}
