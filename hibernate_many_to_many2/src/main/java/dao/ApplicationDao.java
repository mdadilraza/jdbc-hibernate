package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Application;
import dto.User;

public class ApplicationDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(Application application) {
		List<User> list = application.getUsers();

		entityTransaction.begin();
		for (User user : list) {
			entityManager.persist(user);
		}
		entityManager.persist(application);

		entityTransaction.commit();
	}

	// delete both

	public void deleteBoth(int appliactionId) {
		Application application = entityManager.find(Application.class, appliactionId);
		entityTransaction.begin();

		entityManager.remove(application);
		entityTransaction.commit();
	}

	// fetchAll()

	public void fetchAll() {
		Query query = entityManager.createQuery("select c from Application c");
		List<Application> list = query.getResultList();
		System.out.println(list);
	}

}
