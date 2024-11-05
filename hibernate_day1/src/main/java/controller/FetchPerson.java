package controller;

import dao.PersonDao;

public class FetchPerson {

	public static void main(String[] args) {
     PersonDao personDao = new PersonDao();
     personDao.fetchPerson(1);
	}

}
