package controller;

import dao.PersonDao;
import dto.PanCard;
import dto.Person;

public class SaveBoth {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("rahul ");
		person.setAge(23);
		person.setAddress("up");
		person.setGender("male");
		person.setPhone(9973293480L);

		PanCard card = new PanCard();
		card.setPanNumber("EHOPf3665F");
		card.setAuthority("GOI");

		person.setCard(card);
		card.setPerson(person);

		PersonDao personDao = new PersonDao();
		personDao.saveBoth(person);


	}

}
