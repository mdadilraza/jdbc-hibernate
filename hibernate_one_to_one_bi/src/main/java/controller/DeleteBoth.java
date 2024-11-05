package controller;

import dao.PersonDao;

public class DeleteBoth {

	public static void main(String[] args) {
		PersonDao personDao= new PersonDao();
		personDao.deleteBoth(1);

	}

}
