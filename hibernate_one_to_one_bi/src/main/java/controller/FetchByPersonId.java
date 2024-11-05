package controller;

import dao.PersonDao;

public class FetchByPersonId {

	public static void main(String[] args) {
		PersonDao personDao= new PersonDao();
		personDao.fetchPersonById(1);

	}

}
