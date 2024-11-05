package controller;

import dao.CollegeDao;

public class FetchAll {

	public static void main(String[] args) {
		CollegeDao collegeDao = new CollegeDao();
		//collegeDao.fetchAll();
		collegeDao.fetchById(1);
		collegeDao.fetchByStudent();
	}

}
