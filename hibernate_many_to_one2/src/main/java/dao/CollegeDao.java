package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.College;
import dto.University;

public class CollegeDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void saveBoth(College college) {
		University university = college.getUniversity();
		entityTransaction.begin();
		entityManager.persist(university);
		entityManager.persist(college);

		entityTransaction.commit();
	}

	// fetchAll()
	public void fetchAll() {
		Query query = entityManager.createQuery("select c from College c");
		List<College> list = query.getResultList();
		System.out.println(list);
	}

	// delete()
	public void deleteCollege(int collgeId) {
		University college = entityManager.find(University.class, collgeId);

		entityTransaction.begin();
		entityManager.remove(college);
		entityTransaction.commit();

	}

	// update both
	public void updateBoth(int oldCollgeId, College newCollege) {
		newCollege.setCollgeId(oldCollgeId);

		University university = newCollege.getUniversity();
		entityTransaction.begin();
		entityManager.merge(newCollege);
		entityManager.merge(university);
		entityTransaction.commit();

	}

	public void addStudentInExistingUniversity(int oldUniversityId, College newcollege) {

		University university = entityManager.find(University.class, oldUniversityId);
		newcollege.getUniversity();

	}

}
