package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import dto.Bus;

import dto.Passenger;

public class PassengerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// saveBoth()

	public void saveBoth(Passenger passenger) {
		Bus bus = passenger.getBus();
		entityTransaction.begin();
		entityManager.persist(bus);
		entityManager.persist(passenger);
		entityTransaction.commit();

	}

	public void deletePassenger(int passnegerId) {
		Passenger passenger = entityManager.find(Passenger.class, passnegerId);
		entityTransaction.begin();

		entityManager.remove(passenger);
		entityTransaction.commit();
	}

	public void fetchAll() {
		javax.persistence.Query query = entityManager.createQuery("Select c from Passenger c");// jpl query
		List<Passenger> list = query.getResultList();
		System.out.println(list);

	}

	public void fetchById(int passengerId) {
		javax.persistence.Query query = entityManager.createQuery("select c from Passenger c where passengerId=?1");
		query.setParameter(1, passengerId);
		List<Passenger> passenger = query.getResultList();
		System.out.println(passenger);

	}

	public void updateBoth(int oldPassengerId, Passenger newPassnger) {
		newPassnger.setPassengerId(oldPassengerId);
		Bus bus = newPassnger.getBus();
		entityTransaction.begin();
		entityManager.merge(newPassnger);
		entityManager.merge(bus);
		entityTransaction.commit();

	}

	public void addNewPassnegerToExistingBus(int oldBusId, Passenger newPassenger) {
//		Bus bus = entityManager.find(Bus.class, oldBusId);
//		Bus bus2 = passenger.getBus();
//		entityTransaction.begin();
//		entityManager.persist(passenger);
//		entityManager.persist(bus2);
//		entityTransaction.commit();/
		Bus bus = entityManager.find(Bus.class, oldBusId);
		newPassenger.
		
		
	}

}
