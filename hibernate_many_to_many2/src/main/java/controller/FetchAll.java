package controller;

import dao.ApplicationDao;

public class FetchAll {

	public static void main(String[] args) {
		ApplicationDao applicationDao= new ApplicationDao();
		applicationDao.fetchAll();
	}

}
