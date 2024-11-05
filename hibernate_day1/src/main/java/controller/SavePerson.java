package controller;

import dao.PersonDao;
import dto.Person;

public class SavePerson {

	public static void main(String[] args) {
		Person person = new Person();
		person.setPersonId(2);
		person.setPersonName("Shayam");
		person.setPersonAddress("hyd");
		person.setPersonAge(21);
		person.setPersonPhone(9963773879L);
		PersonDao personDao = new PersonDao();
		personDao.savePerson(person);
	}

}
