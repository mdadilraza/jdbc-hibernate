package controller;

import dao.PersonDao;

public class fetchAll {

	public static void main(String[] args) {
		PersonDao personDao= new PersonDao();
		personDao.fetchAll();

	}

}
