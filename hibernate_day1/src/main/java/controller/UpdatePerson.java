package controller;

import dao.PersonDao;
import dto.Person;

public class UpdatePerson {

	public static void main(String[] args) {
      
		Person person = new Person();
		person.setPersonName("Surendra");
		person.setPersonAddress("Dilsukhnagar");
		person.setPersonAge(23);
		person.setPersonPhone(9986535355L);
		
		PersonDao personDao = new PersonDao();
		personDao.updatePerson(1, person);
		
	}

}
