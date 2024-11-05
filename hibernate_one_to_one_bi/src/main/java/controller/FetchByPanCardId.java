package controller;

import dao.PersonDao;

public class FetchByPanCardId {

	public static void main(String[] args) {
		
		PersonDao personDao= new PersonDao();
		personDao.fetchPanCardById(1);

	}

}
