package controller;

import dao.ApplicationDao;

public class DeleteBoth {

	public static void main(String[] args) {
		ApplicationDao applicationDao= new ApplicationDao();
		applicationDao.deleteBoth(3);

	}

}
